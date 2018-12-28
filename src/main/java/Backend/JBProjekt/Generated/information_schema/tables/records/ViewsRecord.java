/*
 * This file is generated by jOOQ.
 */
package Backend.JBProjekt.Generated.information_schema.tables.records;


import Backend.JBProjekt.Generated.information_schema.tables.Views;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


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
public class ViewsRecord extends TableRecordImpl<ViewsRecord> implements Record10<String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1794953128;

    /**
     * Setter for <code>information_schema.VIEWS.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.VIEWS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.VIEWS.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.VIEWS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.VIEWS.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.VIEWS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.VIEWS.VIEW_DEFINITION</code>.
     */
    public void setViewDefinition(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.VIEWS.VIEW_DEFINITION</code>.
     */
    public String getViewDefinition() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.VIEWS.CHECK_OPTION</code>.
     */
    public void setCheckOption(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.VIEWS.CHECK_OPTION</code>.
     */
    public String getCheckOption() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.VIEWS.IS_UPDATABLE</code>.
     */
    public void setIsUpdatable(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.VIEWS.IS_UPDATABLE</code>.
     */
    public String getIsUpdatable() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.VIEWS.DEFINER</code>.
     */
    public void setDefiner(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.VIEWS.DEFINER</code>.
     */
    public String getDefiner() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.VIEWS.SECURITY_TYPE</code>.
     */
    public void setSecurityType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.VIEWS.SECURITY_TYPE</code>.
     */
    public String getSecurityType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.VIEWS.CHARACTER_SET_CLIENT</code>.
     */
    public void setCharacterSetClient(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.VIEWS.CHARACTER_SET_CLIENT</code>.
     */
    public String getCharacterSetClient() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.VIEWS.COLLATION_CONNECTION</code>.
     */
    public void setCollationConnection(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.VIEWS.COLLATION_CONNECTION</code>.
     */
    public String getCollationConnection() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Views.VIEWS.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Views.VIEWS.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Views.VIEWS.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Views.VIEWS.VIEW_DEFINITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Views.VIEWS.CHECK_OPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Views.VIEWS.IS_UPDATABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Views.VIEWS.DEFINER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Views.VIEWS.SECURITY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Views.VIEWS.CHARACTER_SET_CLIENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Views.VIEWS.COLLATION_CONNECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getViewDefinition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCheckOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getIsUpdatable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDefiner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getSecurityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCharacterSetClient();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCollationConnection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getViewDefinition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCheckOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getIsUpdatable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDefiner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSecurityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCharacterSetClient();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCollationConnection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewsRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewsRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewsRecord value3(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewsRecord value4(String value) {
        setViewDefinition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewsRecord value5(String value) {
        setCheckOption(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewsRecord value6(String value) {
        setIsUpdatable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewsRecord value7(String value) {
        setDefiner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewsRecord value8(String value) {
        setSecurityType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewsRecord value9(String value) {
        setCharacterSetClient(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewsRecord value10(String value) {
        setCollationConnection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewsRecord
     */
    public ViewsRecord() {
        super(Views.VIEWS);
    }

    /**
     * Create a detached, initialised ViewsRecord
     */
    public ViewsRecord(String tableCatalog, String tableSchema, String tableName, String viewDefinition, String checkOption, String isUpdatable, String definer, String securityType, String characterSetClient, String collationConnection) {
        super(Views.VIEWS);

        set(0, tableCatalog);
        set(1, tableSchema);
        set(2, tableName);
        set(3, viewDefinition);
        set(4, checkOption);
        set(5, isUpdatable);
        set(6, definer);
        set(7, securityType);
        set(8, characterSetClient);
        set(9, collationConnection);
    }
}
