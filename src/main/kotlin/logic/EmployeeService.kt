package logic
import entities.Employee
import entities.Vacation
import java.lang.Exception

class EmployeeService {

    fun registerEmployee(employeeList : MutableList<Employee>) {
       println("لطفا کدملی کارمند مورد نظر را وارد کنید...")
       val inputCode  = readln()
       checkEmployee(inputCode = inputCode, employeeList = employeeList)
       println("نام کارمند را وارد کنید...")
       val firstName =  readln()
        println("نام خانوادگی کارمند را وارد کنید...")
        val lastName =  readln()
        println("شماره همراه کارمند را وارد کنید...")
        val mobile =  readln()
        println("سال تولد کارمند را وارد کنید...")
        val birthYear =  readln().toInt()
        val vacations =  mutableListOf<Vacation>()
        // create employee
        val employee  = Employee(firstName = firstName, lastName = lastName,mobile = mobile,birthYear= birthYear, vacations = vacations, code = inputCode)
        employeeList.add(employee)
        println("کارمند جدید با موفقیت ذخیره شد!")
    }

    fun setVacation() {

    }

    private fun checkEmployee(employeeList : MutableList<Employee>,inputCode : String) {
        val findEmployee = employeeList.filter { it.code == inputCode }
        if (findEmployee.isNotEmpty()){
            throw Exception("در حال حاضر یک کاربر با این کدملی وجود دارد!")
        }
    }
}