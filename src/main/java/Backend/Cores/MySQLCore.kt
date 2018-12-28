package Backend.Cores

import java.sql.Connection
import java.sql.DriverManager

class MySQLCore {

    fun something() : Connection {
        val user : String = "jb"
        val password : String = "r28^Pw3pZ5p#"
        val url : String = "jdbc:mysql://192.168.223.21:3306/jbprojekt?serverTimezone=Europe/Copenhagen&useUnicode=yes&characterEncoding=UTF-8"

        return DriverManager.getConnection(url, user, password)
    }

    companion object {
        fun getConnection() : Connection {
            return MySQLCore().something()
        }
    }

}