package Backend.JBProjekt

import Backend.DAO
import Model.JBProjekt.Inventory

interface InventoryDAO : DAO<Inventory> {

    fun test()

}