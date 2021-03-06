/*
 * This file is generated by jOOQ.
 */
package Backend.JBProjekt.Generated.jbprojekt.tables;


import Backend.JBProjekt.Generated.jbprojekt.Indexes;
import Backend.JBProjekt.Generated.jbprojekt.Jbprojekt;
import Backend.JBProjekt.Generated.jbprojekt.Keys;
import Backend.JBProjekt.Generated.jbprojekt.tables.records.WasteRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Waste extends TableImpl<WasteRecord> {

    private static final long serialVersionUID = -424574451;

    /**
     * The reference instance of <code>jbprojekt.waste</code>
     */
    public static final Waste WASTE = new Waste();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WasteRecord> getRecordType() {
        return WasteRecord.class;
    }

    /**
     * The column <code>jbprojekt.waste.id</code>.
     */
    public final TableField<WasteRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>jbprojekt.waste.registered_at</code>.
     */
    public final TableField<WasteRecord, Timestamp> REGISTERED_AT = createField("registered_at", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jbprojekt.waste.item_descriptor_id</code>.
     */
    public final TableField<WasteRecord, Integer> ITEM_DESCRIPTOR_ID = createField("item_descriptor_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>jbprojekt.waste.quantity</code>.
     */
    public final TableField<WasteRecord, BigDecimal> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.DECIMAL(11, 2), this, "");

    /**
     * The column <code>jbprojekt.waste.unit_cost</code>.
     */
    public final TableField<WasteRecord, BigDecimal> UNIT_COST = createField("unit_cost", org.jooq.impl.SQLDataType.DECIMAL(11, 2), this, "");

    /**
     * The column <code>jbprojekt.waste.wastecategory_id</code>.
     */
    public final TableField<WasteRecord, Integer> WASTECATEGORY_ID = createField("wastecategory_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>jbprojekt.waste.wastestate_id</code>.
     */
    public final TableField<WasteRecord, Integer> WASTESTATE_ID = createField("wastestate_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>jbprojekt.waste.user_id</code>.
     */
    public final TableField<WasteRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>jbprojekt.waste</code> table reference
     */
    public Waste() {
        this(DSL.name("waste"), null);
    }

    /**
     * Create an aliased <code>jbprojekt.waste</code> table reference
     */
    public Waste(String alias) {
        this(DSL.name(alias), WASTE);
    }

    /**
     * Create an aliased <code>jbprojekt.waste</code> table reference
     */
    public Waste(Name alias) {
        this(alias, WASTE);
    }

    private Waste(Name alias, Table<WasteRecord> aliased) {
        this(alias, aliased, null);
    }

    private Waste(Name alias, Table<WasteRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Waste(Table<O> child, ForeignKey<O, WasteRecord> key) {
        super(child, key, WASTE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jbprojekt.JBPROJEKT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.WASTE_FK_ITEMWASTE, Indexes.WASTE_FK_USER, Indexes.WASTE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<WasteRecord, Integer> getIdentity() {
        return Keys.IDENTITY_WASTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WasteRecord> getPrimaryKey() {
        return Keys.KEY_WASTE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WasteRecord>> getKeys() {
        return Arrays.<UniqueKey<WasteRecord>>asList(Keys.KEY_WASTE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<WasteRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<WasteRecord, ?>>asList(Keys.FK_ITEMWASTE, Keys.FK_USER);
    }

    public ItemDescriptor itemDescriptor() {
        return new ItemDescriptor(this, Keys.FK_ITEMWASTE);
    }

    public User user() {
        return new User(this, Keys.FK_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Waste as(String alias) {
        return new Waste(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Waste as(Name alias) {
        return new Waste(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Waste rename(String name) {
        return new Waste(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Waste rename(Name name) {
        return new Waste(name, null);
    }
}
