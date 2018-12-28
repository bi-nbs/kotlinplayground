/*
 * This file is generated by jOOQ.
 */
package Backend.JBProjekt.Generated.information_schema.tables;


import Backend.JBProjekt.Generated.information_schema.InformationSchema;
import Backend.JBProjekt.Generated.information_schema.tables.records.ProcesslistRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


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
public class Processlist extends TableImpl<ProcesslistRecord> {

    private static final long serialVersionUID = -275912454;

    /**
     * The reference instance of <code>information_schema.PROCESSLIST</code>
     */
    public static final Processlist PROCESSLIST = new Processlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProcesslistRecord> getRecordType() {
        return ProcesslistRecord.class;
    }

    /**
     * The column <code>information_schema.PROCESSLIST.ID</code>.
     */
    public final TableField<ProcesslistRecord, ULong> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.USER</code>.
     */
    public final TableField<ProcesslistRecord, String> USER = createField("USER", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.HOST</code>.
     */
    public final TableField<ProcesslistRecord, String> HOST = createField("HOST", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.DB</code>.
     */
    public final TableField<ProcesslistRecord, String> DB = createField("DB", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.COMMAND</code>.
     */
    public final TableField<ProcesslistRecord, String> COMMAND = createField("COMMAND", org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.TIME</code>.
     */
    public final TableField<ProcesslistRecord, Integer> TIME = createField("TIME", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.STATE</code>.
     */
    public final TableField<ProcesslistRecord, String> STATE = createField("STATE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.INFO</code>.
     */
    public final TableField<ProcesslistRecord, String> INFO = createField("INFO", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>information_schema.PROCESSLIST</code> table reference
     */
    public Processlist() {
        this(DSL.name("PROCESSLIST"), null);
    }

    /**
     * Create an aliased <code>information_schema.PROCESSLIST</code> table reference
     */
    public Processlist(String alias) {
        this(DSL.name(alias), PROCESSLIST);
    }

    /**
     * Create an aliased <code>information_schema.PROCESSLIST</code> table reference
     */
    public Processlist(Name alias) {
        this(alias, PROCESSLIST);
    }

    private Processlist(Name alias, Table<ProcesslistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Processlist(Name alias, Table<ProcesslistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Processlist(Table<O> child, ForeignKey<O, ProcesslistRecord> key) {
        super(child, key, PROCESSLIST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Processlist as(String alias) {
        return new Processlist(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Processlist as(Name alias) {
        return new Processlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Processlist rename(String name) {
        return new Processlist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Processlist rename(Name name) {
        return new Processlist(name, null);
    }
}
