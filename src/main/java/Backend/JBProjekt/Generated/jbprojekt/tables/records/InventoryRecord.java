/*
 * This file is generated by jOOQ.
 */
package Backend.JBProjekt.Generated.jbprojekt.tables.records;


import Backend.JBProjekt.Generated.jbprojekt.tables.Inventory;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class InventoryRecord extends UpdatableRecordImpl<InventoryRecord> implements Record3<Integer, Timestamp, Integer> {

    private static final long serialVersionUID = -44095145;

    /**
     * Setter for <code>jbprojekt.inventory.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jbprojekt.inventory.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jbprojekt.inventory.created_time</code>.
     */
    public void setCreatedTime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>jbprojekt.inventory.created_time</code>.
     */
    public Timestamp getCreatedTime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>jbprojekt.inventory.state_id</code>.
     */
    public void setStateId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>jbprojekt.inventory.state_id</code>.
     */
    public Integer getStateId() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Timestamp, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Timestamp, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Inventory.INVENTORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Inventory.INVENTORY.CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Inventory.INVENTORY.STATE_ID;
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
    public Timestamp component2() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getStateId();
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
    public Timestamp value2() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InventoryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InventoryRecord value2(Timestamp value) {
        setCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InventoryRecord value3(Integer value) {
        setStateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InventoryRecord values(Integer value1, Timestamp value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InventoryRecord
     */
    public InventoryRecord() {
        super(Inventory.INVENTORY);
    }

    /**
     * Create a detached, initialised InventoryRecord
     */
    public InventoryRecord(Integer id, Timestamp createdTime, Integer stateId) {
        super(Inventory.INVENTORY);

        set(0, id);
        set(1, createdTime);
        set(2, stateId);
    }
}
