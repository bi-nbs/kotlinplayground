package Model.JBProjekt

class Inventory (id: Int, state: Int){

    val id = id
    val state_id = state

    override fun toString(): String {
        return "Inventory(id=$id, state_id=$state_id)"
    }

}