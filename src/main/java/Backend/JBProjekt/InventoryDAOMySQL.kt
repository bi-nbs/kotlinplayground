package Backend.JBProjekt

import Backend.Cores.MySQLCore
import Backend.DAO
import Model.JBProjekt.Inventory
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import Backend.JBProjekt.Generated.jbprojekt.Tables.*

class InventoryDAOMySQL : DAO<Inventory> {
    override fun create(t: Inventory) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun read(id: Int): Inventory {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun readAll(): List<Inventory> {
        val inventories : MutableList<Inventory> = ArrayList()

        MySQLCore.getConnection().use {
            val context = DSL.using(it, SQLDialect.MYSQL)

            for (line in context.select().from(INVENTORY).fetch()){
                inventories.add(Inventory(line.get(INVENTORY.ID)))
            }

        }

        return inventories
    }

    override fun update(t: Inventory) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(id: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}