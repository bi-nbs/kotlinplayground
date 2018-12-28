/*
 * This file is generated by jOOQ.
 */
package Backend.JBProjekt.Generated.jbprojekt.tables.records;


import Backend.JBProjekt.Generated.jbprojekt.tables.ItemCategoryItemDescriptor;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class ItemCategoryItemDescriptorRecord extends UpdatableRecordImpl<ItemCategoryItemDescriptorRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -880241515;

    /**
     * Setter for <code>jbprojekt.item_category_item_descriptor.item_category_id</code>.
     */
    public void setItemCategoryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jbprojekt.item_category_item_descriptor.item_category_id</code>.
     */
    public Integer getItemCategoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jbprojekt.item_category_item_descriptor.item_descriptor_id</code>.
     */
    public void setItemDescriptorId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>jbprojekt.item_category_item_descriptor.item_descriptor_id</code>.
     */
    public Integer getItemDescriptorId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ItemCategoryItemDescriptor.ITEM_CATEGORY_ITEM_DESCRIPTOR.ITEM_CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ItemCategoryItemDescriptor.ITEM_CATEGORY_ITEM_DESCRIPTOR.ITEM_DESCRIPTOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getItemCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getItemDescriptorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getItemCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getItemDescriptorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemCategoryItemDescriptorRecord value1(Integer value) {
        setItemCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemCategoryItemDescriptorRecord value2(Integer value) {
        setItemDescriptorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemCategoryItemDescriptorRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ItemCategoryItemDescriptorRecord
     */
    public ItemCategoryItemDescriptorRecord() {
        super(ItemCategoryItemDescriptor.ITEM_CATEGORY_ITEM_DESCRIPTOR);
    }

    /**
     * Create a detached, initialised ItemCategoryItemDescriptorRecord
     */
    public ItemCategoryItemDescriptorRecord(Integer itemCategoryId, Integer itemDescriptorId) {
        super(ItemCategoryItemDescriptor.ITEM_CATEGORY_ITEM_DESCRIPTOR);

        set(0, itemCategoryId);
        set(1, itemDescriptorId);
    }
}