import Backend.JBProjekt.InventoryDAOMySQL

fun main(args: Array<String>) {
    val dao = InventoryDAOMySQL()

    for (element in dao.readAll()) {
        println(element.toString())
    }
}