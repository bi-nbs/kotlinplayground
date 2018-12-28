/*
 * This file is generated by jOOQ.
 */
package Backend.JBProjekt.Generated.jbprojekt.tables.records;


import Backend.JBProjekt.Generated.jbprojekt.tables.ItemCategory;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ItemCategoryRecord extends UpdatableRecordImpl<ItemCategoryRecord> implements Record4<Integer, Integer, String, Byte> {

    private static final long serialVersionUID = 1540475053;

    /**
     * Setter for <code>jbprojekt.item_category.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jbprojekt.item_category.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jbprojekt.item_category.parent_id</code>.
     */
    public void setParentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jbprojekt.item_category.parent_id</code>.
     */
    public Integer getParentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>jbprojekt.item_category.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jbprojekt.item_category.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jbprojekt.item_category.activated</code>.
     */
    public void setActivated(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>jbprojekt.item_category.activated</code>.
     */
    public Byte getActivated() {
        return (Byte) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Byte> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ItemCategory.ITEM_CATEGORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ItemCategory.ITEM_CATEGORY.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ItemCategory.ITEM_CATEGORY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return ItemCategory.ITEM_CATEGORY.ACTIVATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getActivated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getActivated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemCategoryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemCategoryRecord value2(Integer value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemCategoryRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemCategoryRecord value4(Byte value) {
        setActivated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemCategoryRecord values(Integer value1, Integer value2, String value3, Byte value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ItemCategoryRecord
     */
    public ItemCategoryRecord() {
        super(ItemCategory.ITEM_CATEGORY);
    }

    /**
     * Create a detached, initialised ItemCategoryRecord
     */
    public ItemCategoryRecord(Integer id, Integer parentId, String name, Byte activated) {
        super(ItemCategory.ITEM_CATEGORY);

        set(0, id);
        set(1, parentId);
        set(2, name);
        set(3, activated);
    }
}