import entities.Employee
import logic.EmployeeService
import utils.Menu.Companion.getMenu

fun main() {
    val employeeList = mutableListOf<Employee>()
    val service : EmployeeService = EmployeeService()

    while (true){
        when(getMenu()){
            0 -> {
                println("با موفقیت از سامانه خارج شدید")
                return
            }
            1 -> {
                service.registerEmployee(employeeList)
            }
            2 -> {

            }
        }
    }
}