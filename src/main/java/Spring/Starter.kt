package Spring

import Backend.DAO
import Backend.JBProjekt.InventoryDAOMySQL
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class Starter{

}

fun main (args : Array<String>) {
    SpringApplication.run(Starter::class.java, *args)
}