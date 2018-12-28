package Backend.JBProjekt

import Backend.Cores.MySQLCore
import Backend.JBProjekt.Generated.jbprojekt.Tables.*
import org.jooq.Record
import org.jooq.Result
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import java.sql.DriverManager

class Something {

    fun something() : Result<Record>{

        MySQLCore.getConnection().use {

            val context = DSL.using(it, SQLDialect.MYSQL)

            return context.select().from(INVENTORY).fetch()
        }

    }

}

