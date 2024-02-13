import entities.Employee
import logic.EmployeeService
import utils.Menu.Companion.getMenu
import java.lang.Exception

fun main() {
    val employeeList = mutableListOf<Employee>()
    val service = EmployeeService()

    while (true){
        try {
            when(getMenu()){
                0 -> {
                    println("با موفقیت از سامانه خارج شدید")
                    return }
                1 -> { service.registerEmployee(employeeList) }
                2 -> { service.setVacation(employeeList) }
            }
        }catch(error : Exception){
            println(error.message)
        }
    }
}