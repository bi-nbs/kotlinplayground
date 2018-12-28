/*
 * This file is generated by jOOQ.
 */
package Backend.JBProjekt.Generated.jbprojekt.tables;


import Backend.JBProjekt.Generated.jbprojekt.Indexes;
import Backend.JBProjekt.Generated.jbprojekt.Jbprojekt;
import Backend.JBProjekt.Generated.jbprojekt.Keys;
import Backend.JBProjekt.Generated.jbprojekt.tables.records.InventoryManagementRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class InventoryManagement extends TableImpl<InventoryManagementRecord> {

    private static final long serialVersionUID = 227759093;

    /**
     * The reference instance of <code>jbprojekt.inventory_management</code>
     */
    public static final InventoryManagement INVENTORY_MANAGEMENT = new InventoryManagement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InventoryManagementRecord> getRecordType() {
        return InventoryManagementRecord.class;
    }

    /**
     * The column <code>jbprojekt.inventory_management.primary_key</code>.
     */
    public final TableField<InventoryManagementRecord, String> PRIMARY_KEY = createField("primary_key", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>jbprojekt.inventory_management.expected_inventory_id</code>.
     */
    public final TableField<InventoryManagementRecord, Integer> EXPECTED_INVENTORY_ID = createField("expected_inventory_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>jbprojekt.inventory_management.current_inventory_id</code>.
     */
    public final TableField<InventoryManagementRecord, Integer> CURRENT_INVENTORY_ID = createField("current_inventory_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>jbprojekt.inventory_management</code> table reference
     */
    public InventoryManagement() {
        this(DSL.name("inventory_management"), null);
    }

    /**
     * Create an aliased <code>jbprojekt.inventory_management</code> table reference
     */
    public InventoryManagement(String alias) {
        this(DSL.name(alias), INVENTORY_MANAGEMENT);
    }

    /**
     * Create an aliased <code>jbprojekt.inventory_management</code> table reference
     */
    public InventoryManagement(Name alias) {
        this(alias, INVENTORY_MANAGEMENT);
    }

    private InventoryManagement(Name alias, Table<InventoryManagementRecord> aliased) {
        this(alias, aliased, null);
    }

    private InventoryManagement(Name alias, Table<InventoryManagementRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InventoryManagement(Table<O> child, ForeignKey<O, InventoryManagementRecord> key) {
        super(child, key, INVENTORY_MANAGEMENT);
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
        return Arrays.<Index>asList(Indexes.INVENTORY_MANAGEMENT_FK_COMPLETED_INVENTORY_ID, Indexes.INVENTORY_MANAGEMENT_FK_EXPECTED_INVENTORY_ID, Indexes.INVENTORY_MANAGEMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InventoryManagementRecord> getPrimaryKey() {
        return Keys.KEY_INVENTORY_MANAGEMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InventoryManagementRecord>> getKeys() {
        return Arrays.<UniqueKey<InventoryManagementRecord>>asList(Keys.KEY_INVENTORY_MANAGEMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<InventoryManagementRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<InventoryManagementRecord, ?>>asList(Keys.FK_EXPECTED_INVENTORY_ID, Keys.FK_COMPLETED_INVENTORY_ID);
    }

    public Inventory fkExpectedInventoryId() {
        return new Inventory(this, Keys.FK_EXPECTED_INVENTORY_ID);
    }

    public Inventory fkCompletedInventoryId() {
        return new Inventory(this, Keys.FK_COMPLETED_INVENTORY_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InventoryManagement as(String alias) {
        return new InventoryManagement(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InventoryManagement as(Name alias) {
        return new InventoryManagement(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InventoryManagement rename(String name) {
        return new InventoryManagement(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InventoryManagement rename(Name name) {
        return new InventoryManagement(name, null);
    }
}
