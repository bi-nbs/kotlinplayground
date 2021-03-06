/*
 * This file is generated by jOOQ.
 */
package Backend.JBProjekt.Generated;


import Backend.JBProjekt.Generated.information_schema.InformationSchema;
import Backend.JBProjekt.Generated.jbprojekt.Jbprojekt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;


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
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = -393540109;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>information_schema</code>.
     */
    public final InformationSchema INFORMATION_SCHEMA = Backend.JBProjekt.Generated.information_schema.InformationSchema.INFORMATION_SCHEMA;

    /**
     * The schema <code>jbprojekt</code>.
     */
    public final Jbprojekt JBPROJEKT = Backend.JBProjekt.Generated.jbprojekt.Jbprojekt.JBPROJEKT;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        List result = new ArrayList();
        result.addAll(getSchemas0());
        return result;
    }

    private final List<Schema> getSchemas0() {
        return Arrays.<Schema>asList(
            InformationSchema.INFORMATION_SCHEMA,
            Jbprojekt.JBPROJEKT);
    }
}
