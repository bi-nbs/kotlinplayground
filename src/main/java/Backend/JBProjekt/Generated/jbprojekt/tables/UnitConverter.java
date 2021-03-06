/*
 * This file is generated by jOOQ.
 */
package Backend.JBProjekt.Generated.jbprojekt.tables;


import Backend.JBProjekt.Generated.jbprojekt.Indexes;
import Backend.JBProjekt.Generated.jbprojekt.Jbprojekt;
import Backend.JBProjekt.Generated.jbprojekt.Keys;
import Backend.JBProjekt.Generated.jbprojekt.tables.records.UnitConverterRecord;

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
public class UnitConverter extends TableImpl<UnitConverterRecord> {

    private static final long serialVersionUID = -2099331184;

    /**
     * The reference instance of <code>jbprojekt.unit_converter</code>
     */
    public static final UnitConverter UNIT_CONVERTER = new UnitConverter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UnitConverterRecord> getRecordType() {
        return UnitConverterRecord.class;
    }

    /**
     * The column <code>jbprojekt.unit_converter.id</code>.
     */
    public final TableField<UnitConverterRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>jbprojekt.unit_converter.gram</code>.
     */
    public final TableField<UnitConverterRecord, Double> GRAM = createField("gram", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>jbprojekt.unit_converter.pieces</code>.
     */
    public final TableField<UnitConverterRecord, Double> PIECES = createField("pieces", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>jbprojekt.unit_converter.liter</code>.
     */
    public final TableField<UnitConverterRecord, Double> LITER = createField("liter", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>jbprojekt.unit_converter.base_unit</code>.
     */
    public final TableField<UnitConverterRecord, Double> BASE_UNIT = createField("base_unit", org.jooq.impl.SQLDataType.DOUBLE.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.DOUBLE)), this, "");

    /**
     * Create a <code>jbprojekt.unit_converter</code> table reference
     */
    public UnitConverter() {
        this(DSL.name("unit_converter"), null);
    }

    /**
     * Create an aliased <code>jbprojekt.unit_converter</code> table reference
     */
    public UnitConverter(String alias) {
        this(DSL.name(alias), UNIT_CONVERTER);
    }

    /**
     * Create an aliased <code>jbprojekt.unit_converter</code> table reference
     */
    public UnitConverter(Name alias) {
        this(alias, UNIT_CONVERTER);
    }

    private UnitConverter(Name alias, Table<UnitConverterRecord> aliased) {
        this(alias, aliased, null);
    }

    private UnitConverter(Name alias, Table<UnitConverterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UnitConverter(Table<O> child, ForeignKey<O, UnitConverterRecord> key) {
        super(child, key, UNIT_CONVERTER);
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
        return Arrays.<Index>asList(Indexes.UNIT_CONVERTER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UnitConverterRecord, Integer> getIdentity() {
        return Keys.IDENTITY_UNIT_CONVERTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UnitConverterRecord> getPrimaryKey() {
        return Keys.KEY_UNIT_CONVERTER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UnitConverterRecord>> getKeys() {
        return Arrays.<UniqueKey<UnitConverterRecord>>asList(Keys.KEY_UNIT_CONVERTER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnitConverter as(String alias) {
        return new UnitConverter(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnitConverter as(Name alias) {
        return new UnitConverter(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UnitConverter rename(String name) {
        return new UnitConverter(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UnitConverter rename(Name name) {
        return new UnitConverter(name, null);
    }
}
