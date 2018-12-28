package Backend

interface DAO<T> {

    fun create(t: T)

    fun read(id: Int) : T

    fun readAll() : List<T>

    fun update(t: T)

    fun delete(id: Int)

}