/*
 * This file is generated by jOOQ.
 */
package Backend.JBProjekt.Generated.information_schema.tables.records;


import Backend.JBProjekt.Generated.information_schema.tables.CharacterSets;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class CharacterSetsRecord extends TableRecordImpl<CharacterSetsRecord> implements Record4<String, String, String, Long> {

    private static final long serialVersionUID = 2072112713;

    /**
     * Setter for <code>information_schema.CHARACTER_SETS.CHARACTER_SET_NAME</code>.
     */
    public void setCharacterSetName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.CHARACTER_SETS.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.CHARACTER_SETS.DEFAULT_COLLATE_NAME</code>.
     */
    public void setDefaultCollateName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.CHARACTER_SETS.DEFAULT_COLLATE_NAME</code>.
     */
    public String getDefaultCollateName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.CHARACTER_SETS.DESCRIPTION</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.CHARACTER_SETS.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.CHARACTER_SETS.MAXLEN</code>.
     */
    public void setMaxlen(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.CHARACTER_SETS.MAXLEN</code>.
     */
    public Long getMaxlen() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return CharacterSets.CHARACTER_SETS.CHARACTER_SET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CharacterSets.CHARACTER_SETS.DEFAULT_COLLATE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CharacterSets.CHARACTER_SETS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return CharacterSets.CHARACTER_SETS.MAXLEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getCharacterSetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDefaultCollateName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getMaxlen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCharacterSetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDefaultCollateName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getMaxlen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSetsRecord value1(String value) {
        setCharacterSetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSetsRecord value2(String value) {
        setDefaultCollateName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSetsRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSetsRecord value4(Long value) {
        setMaxlen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSetsRecord values(String value1, String value2, String value3, Long value4) {
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
     * Create a detached CharacterSetsRecord
     */
    public CharacterSetsRecord() {
        super(CharacterSets.CHARACTER_SETS);
    }

    /**
     * Create a detached, initialised CharacterSetsRecord
     */
    public CharacterSetsRecord(String characterSetName, String defaultCollateName, String description, Long maxlen) {
        super(CharacterSets.CHARACTER_SETS);

        set(0, characterSetName);
        set(1, defaultCollateName);
        set(2, description);
        set(3, maxlen);
    }
}
