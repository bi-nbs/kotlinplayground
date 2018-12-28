/*
 * This file is generated by jOOQ.
 */
package Backend.JBProjekt.Generated.jbprojekt.tables;


import Backend.JBProjekt.Generated.jbprojekt.Indexes;
import Backend.JBProjekt.Generated.jbprojekt.Jbprojekt;
import Backend.JBProjekt.Generated.jbprojekt.Keys;
import Backend.JBProjekt.Generated.jbprojekt.tables.records.ItemCategoryItemDescriptorRecord;

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
public class ItemCategoryItemDescriptor extends TableImpl<ItemCategoryItemDescriptorRecord> {

    private static final long serialVersionUID = -1732980135;

    /**
     * The reference instance of <code>jbprojekt.item_category_item_descriptor</code>
     */
    public static final ItemCategoryItemDescriptor ITEM_CATEGORY_ITEM_DESCRIPTOR = new ItemCategoryItemDescriptor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ItemCategoryItemDescriptorRecord> getRecordType() {
        return ItemCategoryItemDescriptorRecord.class;
    }

    /**
     * The column <code>jbprojekt.item_category_item_descriptor.item_category_id</code>.
     */
    public final TableField<ItemCategoryItemDescriptorRecord, Integer> ITEM_CATEGORY_ID = createField("item_category_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jbprojekt.item_category_item_descriptor.item_descriptor_id</code>.
     */
    public final TableField<ItemCategoryItemDescriptorRecord, Integer> ITEM_DESCRIPTOR_ID = createField("item_descriptor_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>jbprojekt.item_category_item_descriptor</code> table reference
     */
    public ItemCategoryItemDescriptor() {
        this(DSL.name("item_category_item_descriptor"), null);
    }

    /**
     * Create an aliased <code>jbprojekt.item_category_item_descriptor</code> table reference
     */
    public ItemCategoryItemDescriptor(String alias) {
        this(DSL.name(alias), ITEM_CATEGORY_ITEM_DESCRIPTOR);
    }

    /**
     * Create an aliased <code>jbprojekt.item_category_item_descriptor</code> table reference
     */
    public ItemCategoryItemDescriptor(Name alias) {
        this(alias, ITEM_CATEGORY_ITEM_DESCRIPTOR);
    }

    private ItemCategoryItemDescriptor(Name alias, Table<ItemCategoryItemDescriptorRecord> aliased) {
        this(alias, aliased, null);
    }

    private ItemCategoryItemDescriptor(Name alias, Table<ItemCategoryItemDescriptorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ItemCategoryItemDescriptor(Table<O> child, ForeignKey<O, ItemCategoryItemDescriptorRecord> key) {
        super(child, key, ITEM_CATEGORY_ITEM_DESCRIPTOR);
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
        return Arrays.<Index>asList(Indexes.ITEM_CATEGORY_ITEM_DESCRIPTOR_FK_ITEM_CATEGORY_ITEM_DESCRIPTOR_ITEM_CATEGORY, Indexes.ITEM_CATEGORY_ITEM_DESCRIPTOR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ItemCategoryItemDescriptorRecord> getPrimaryKey() {
        return Keys.KEY_ITEM_CATEGORY_ITEM_DESCRIPTOR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ItemCategoryItemDescriptorRecord>> getKeys() {
        return Arrays.<UniqueKey<ItemCategoryItemDescriptorRecord>>asList(Keys.KEY_ITEM_CATEGORY_ITEM_DESCRIPTOR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ItemCategoryItemDescriptorRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ItemCategoryItemDescriptorRecord, ?>>asList(Keys.FK_ITEM_CATEGORY_ITEM_DESCRIPTOR_ITEM_CATEGORY, Keys.FK_ITEM_CATEGORY_ITEM_DESCRIPTOR_ITEM_DESCRIPTOR);
    }

    public ItemCategory itemCategory() {
        return new ItemCategory(this, Keys.FK_ITEM_CATEGORY_ITEM_DESCRIPTOR_ITEM_CATEGORY);
    }

    public ItemDescriptor itemDescriptor() {
        return new ItemDescriptor(this, Keys.FK_ITEM_CATEGORY_ITEM_DESCRIPTOR_ITEM_DESCRIPTOR);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemCategoryItemDescriptor as(String alias) {
        return new ItemCategoryItemDescriptor(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemCategoryItemDescriptor as(Name alias) {
        return new ItemCategoryItemDescriptor(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ItemCategoryItemDescriptor rename(String name) {
        return new ItemCategoryItemDescriptor(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ItemCategoryItemDescriptor rename(Name name) {
        return new ItemCategoryItemDescriptor(name, null);
    }
}