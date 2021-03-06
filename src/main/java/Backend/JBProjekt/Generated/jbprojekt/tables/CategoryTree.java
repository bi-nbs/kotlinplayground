/*
 * This file is generated by jOOQ.
 */
package Backend.JBProjekt.Generated.jbprojekt.tables;


import Backend.JBProjekt.Generated.jbprojekt.Indexes;
import Backend.JBProjekt.Generated.jbprojekt.Jbprojekt;
import Backend.JBProjekt.Generated.jbprojekt.Keys;
import Backend.JBProjekt.Generated.jbprojekt.tables.records.CategoryTreeRecord;

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
public class CategoryTree extends TableImpl<CategoryTreeRecord> {

    private static final long serialVersionUID = 1627054308;

    /**
     * The reference instance of <code>jbprojekt.category_tree</code>
     */
    public static final CategoryTree CATEGORY_TREE = new CategoryTree();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CategoryTreeRecord> getRecordType() {
        return CategoryTreeRecord.class;
    }

    /**
     * The column <code>jbprojekt.category_tree.id</code>.
     */
    public final TableField<CategoryTreeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>jbprojekt.category_tree.top_category_id</code>.
     */
    public final TableField<CategoryTreeRecord, Integer> TOP_CATEGORY_ID = createField("top_category_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jbprojekt.category_tree.name</code>.
     */
    public final TableField<CategoryTreeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>jbprojekt.category_tree</code> table reference
     */
    public CategoryTree() {
        this(DSL.name("category_tree"), null);
    }

    /**
     * Create an aliased <code>jbprojekt.category_tree</code> table reference
     */
    public CategoryTree(String alias) {
        this(DSL.name(alias), CATEGORY_TREE);
    }

    /**
     * Create an aliased <code>jbprojekt.category_tree</code> table reference
     */
    public CategoryTree(Name alias) {
        this(alias, CATEGORY_TREE);
    }

    private CategoryTree(Name alias, Table<CategoryTreeRecord> aliased) {
        this(alias, aliased, null);
    }

    private CategoryTree(Name alias, Table<CategoryTreeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CategoryTree(Table<O> child, ForeignKey<O, CategoryTreeRecord> key) {
        super(child, key, CATEGORY_TREE);
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
        return Arrays.<Index>asList(Indexes.CATEGORY_TREE_PRIMARY, Indexes.CATEGORY_TREE_TOP_CATEGORY_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CategoryTreeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CATEGORY_TREE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CategoryTreeRecord> getPrimaryKey() {
        return Keys.KEY_CATEGORY_TREE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CategoryTreeRecord>> getKeys() {
        return Arrays.<UniqueKey<CategoryTreeRecord>>asList(Keys.KEY_CATEGORY_TREE_PRIMARY, Keys.KEY_CATEGORY_TREE_TOP_CATEGORY_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CategoryTreeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CategoryTreeRecord, ?>>asList(Keys.FK_CATEGORY_TREE_ITEM_CATEGORY);
    }

    public ItemCategory itemCategory() {
        return new ItemCategory(this, Keys.FK_CATEGORY_TREE_ITEM_CATEGORY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryTree as(String alias) {
        return new CategoryTree(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryTree as(Name alias) {
        return new CategoryTree(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CategoryTree rename(String name) {
        return new CategoryTree(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CategoryTree rename(Name name) {
        return new CategoryTree(name, null);
    }
}
