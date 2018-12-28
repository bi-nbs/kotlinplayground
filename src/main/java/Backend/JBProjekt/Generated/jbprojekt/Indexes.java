/*
 * This file is generated by jOOQ.
 */
package Backend.JBProjekt.Generated.jbprojekt;


import Backend.JBProjekt.Generated.jbprojekt.tables.CategoryTree;
import Backend.JBProjekt.Generated.jbprojekt.tables.Inventory;
import Backend.JBProjekt.Generated.jbprojekt.tables.InventoryItem;
import Backend.JBProjekt.Generated.jbprojekt.tables.InventoryManagement;
import Backend.JBProjekt.Generated.jbprojekt.tables.ItemCategory;
import Backend.JBProjekt.Generated.jbprojekt.tables.ItemCategoryItemDescriptor;
import Backend.JBProjekt.Generated.jbprojekt.tables.ItemDescriptor;
import Backend.JBProjekt.Generated.jbprojekt.tables.UnitConverter;
import Backend.JBProjekt.Generated.jbprojekt.tables.User;
import Backend.JBProjekt.Generated.jbprojekt.tables.Waste;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>jbprojekt</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CATEGORY_TREE_PRIMARY = Indexes0.CATEGORY_TREE_PRIMARY;
    public static final Index CATEGORY_TREE_TOP_CATEGORY_ID = Indexes0.CATEGORY_TREE_TOP_CATEGORY_ID;
    public static final Index INVENTORY_PRIMARY = Indexes0.INVENTORY_PRIMARY;
    public static final Index INVENTORY_ITEM_FK_INVENTORY = Indexes0.INVENTORY_ITEM_FK_INVENTORY;
    public static final Index INVENTORY_ITEM_FK_ITEMINVENTORYITEM = Indexes0.INVENTORY_ITEM_FK_ITEMINVENTORYITEM;
    public static final Index INVENTORY_ITEM_PRIMARY = Indexes0.INVENTORY_ITEM_PRIMARY;
    public static final Index INVENTORY_ITEM_SORT_ORDER = Indexes0.INVENTORY_ITEM_SORT_ORDER;
    public static final Index INVENTORY_MANAGEMENT_FK_COMPLETED_INVENTORY_ID = Indexes0.INVENTORY_MANAGEMENT_FK_COMPLETED_INVENTORY_ID;
    public static final Index INVENTORY_MANAGEMENT_FK_EXPECTED_INVENTORY_ID = Indexes0.INVENTORY_MANAGEMENT_FK_EXPECTED_INVENTORY_ID;
    public static final Index INVENTORY_MANAGEMENT_PRIMARY = Indexes0.INVENTORY_MANAGEMENT_PRIMARY;
    public static final Index ITEM_CATEGORY_FK_CATEGORY_CATEGORY = Indexes0.ITEM_CATEGORY_FK_CATEGORY_CATEGORY;
    public static final Index ITEM_CATEGORY_PRIMARY = Indexes0.ITEM_CATEGORY_PRIMARY;
    public static final Index ITEM_CATEGORY_ITEM_DESCRIPTOR_FK_ITEM_CATEGORY_ITEM_DESCRIPTOR_ITEM_CATEGORY = Indexes0.ITEM_CATEGORY_ITEM_DESCRIPTOR_FK_ITEM_CATEGORY_ITEM_DESCRIPTOR_ITEM_CATEGORY;
    public static final Index ITEM_CATEGORY_ITEM_DESCRIPTOR_PRIMARY = Indexes0.ITEM_CATEGORY_ITEM_DESCRIPTOR_PRIMARY;
    public static final Index ITEM_DESCRIPTOR_PRIMARY = Indexes0.ITEM_DESCRIPTOR_PRIMARY;
    public static final Index ITEM_DESCRIPTOR_PRODUCT_ID = Indexes0.ITEM_DESCRIPTOR_PRODUCT_ID;
    public static final Index ITEM_DESCRIPTOR_UNIT_CONVERTER_ID = Indexes0.ITEM_DESCRIPTOR_UNIT_CONVERTER_ID;
    public static final Index UNIT_CONVERTER_PRIMARY = Indexes0.UNIT_CONVERTER_PRIMARY;
    public static final Index USER_PRIMARY = Indexes0.USER_PRIMARY;
    public static final Index WASTE_FK_ITEMWASTE = Indexes0.WASTE_FK_ITEMWASTE;
    public static final Index WASTE_FK_USER = Indexes0.WASTE_FK_USER;
    public static final Index WASTE_PRIMARY = Indexes0.WASTE_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index CATEGORY_TREE_PRIMARY = Internal.createIndex("PRIMARY", CategoryTree.CATEGORY_TREE, new OrderField[] { CategoryTree.CATEGORY_TREE.ID }, true);
        public static Index CATEGORY_TREE_TOP_CATEGORY_ID = Internal.createIndex("top_category_id", CategoryTree.CATEGORY_TREE, new OrderField[] { CategoryTree.CATEGORY_TREE.TOP_CATEGORY_ID }, true);
        public static Index INVENTORY_PRIMARY = Internal.createIndex("PRIMARY", Inventory.INVENTORY, new OrderField[] { Inventory.INVENTORY.ID }, true);
        public static Index INVENTORY_ITEM_FK_INVENTORY = Internal.createIndex("FK_Inventory", InventoryItem.INVENTORY_ITEM, new OrderField[] { InventoryItem.INVENTORY_ITEM.INVENTORY_ID }, false);
        public static Index INVENTORY_ITEM_FK_ITEMINVENTORYITEM = Internal.createIndex("FK_ItemInventoryItem", InventoryItem.INVENTORY_ITEM, new OrderField[] { InventoryItem.INVENTORY_ITEM.ITEM_DESCRIPTOR_ID }, false);
        public static Index INVENTORY_ITEM_PRIMARY = Internal.createIndex("PRIMARY", InventoryItem.INVENTORY_ITEM, new OrderField[] { InventoryItem.INVENTORY_ITEM.ID }, true);
        public static Index INVENTORY_ITEM_SORT_ORDER = Internal.createIndex("sort_order", InventoryItem.INVENTORY_ITEM, new OrderField[] { InventoryItem.INVENTORY_ITEM.SORT_ORDER }, false);
        public static Index INVENTORY_MANAGEMENT_FK_COMPLETED_INVENTORY_ID = Internal.createIndex("FK_completed_inventory_id", InventoryManagement.INVENTORY_MANAGEMENT, new OrderField[] { InventoryManagement.INVENTORY_MANAGEMENT.CURRENT_INVENTORY_ID }, false);
        public static Index INVENTORY_MANAGEMENT_FK_EXPECTED_INVENTORY_ID = Internal.createIndex("FK_expected_inventory_id", InventoryManagement.INVENTORY_MANAGEMENT, new OrderField[] { InventoryManagement.INVENTORY_MANAGEMENT.EXPECTED_INVENTORY_ID }, false);
        public static Index INVENTORY_MANAGEMENT_PRIMARY = Internal.createIndex("PRIMARY", InventoryManagement.INVENTORY_MANAGEMENT, new OrderField[] { InventoryManagement.INVENTORY_MANAGEMENT.PRIMARY_KEY }, true);
        public static Index ITEM_CATEGORY_FK_CATEGORY_CATEGORY = Internal.createIndex("FK_category_category", ItemCategory.ITEM_CATEGORY, new OrderField[] { ItemCategory.ITEM_CATEGORY.PARENT_ID }, false);
        public static Index ITEM_CATEGORY_PRIMARY = Internal.createIndex("PRIMARY", ItemCategory.ITEM_CATEGORY, new OrderField[] { ItemCategory.ITEM_CATEGORY.ID }, true);
        public static Index ITEM_CATEGORY_ITEM_DESCRIPTOR_FK_ITEM_CATEGORY_ITEM_DESCRIPTOR_ITEM_CATEGORY = Internal.createIndex("FK_item_category_item_descriptor_item_category", ItemCategoryItemDescriptor.ITEM_CATEGORY_ITEM_DESCRIPTOR, new OrderField[] { ItemCategoryItemDescriptor.ITEM_CATEGORY_ITEM_DESCRIPTOR.ITEM_CATEGORY_ID }, false);
        public static Index ITEM_CATEGORY_ITEM_DESCRIPTOR_PRIMARY = Internal.createIndex("PRIMARY", ItemCategoryItemDescriptor.ITEM_CATEGORY_ITEM_DESCRIPTOR, new OrderField[] { ItemCategoryItemDescriptor.ITEM_CATEGORY_ITEM_DESCRIPTOR.ITEM_DESCRIPTOR_ID, ItemCategoryItemDescriptor.ITEM_CATEGORY_ITEM_DESCRIPTOR.ITEM_CATEGORY_ID }, true);
        public static Index ITEM_DESCRIPTOR_PRIMARY = Internal.createIndex("PRIMARY", ItemDescriptor.ITEM_DESCRIPTOR, new OrderField[] { ItemDescriptor.ITEM_DESCRIPTOR.ID }, true);
        public static Index ITEM_DESCRIPTOR_PRODUCT_ID = Internal.createIndex("product_id", ItemDescriptor.ITEM_DESCRIPTOR, new OrderField[] { ItemDescriptor.ITEM_DESCRIPTOR.PRODUCT_ID }, true);
        public static Index ITEM_DESCRIPTOR_UNIT_CONVERTER_ID = Internal.createIndex("unit_converter_id", ItemDescriptor.ITEM_DESCRIPTOR, new OrderField[] { ItemDescriptor.ITEM_DESCRIPTOR.UNIT_CONVERTER_ID }, true);
        public static Index UNIT_CONVERTER_PRIMARY = Internal.createIndex("PRIMARY", UnitConverter.UNIT_CONVERTER, new OrderField[] { UnitConverter.UNIT_CONVERTER.ID }, true);
        public static Index USER_PRIMARY = Internal.createIndex("PRIMARY", User.USER, new OrderField[] { User.USER.ID }, true);
        public static Index WASTE_FK_ITEMWASTE = Internal.createIndex("FK_ItemWaste", Waste.WASTE, new OrderField[] { Waste.WASTE.ITEM_DESCRIPTOR_ID }, false);
        public static Index WASTE_FK_USER = Internal.createIndex("FK_User", Waste.WASTE, new OrderField[] { Waste.WASTE.USER_ID }, false);
        public static Index WASTE_PRIMARY = Internal.createIndex("PRIMARY", Waste.WASTE, new OrderField[] { Waste.WASTE.ID }, true);
    }
}