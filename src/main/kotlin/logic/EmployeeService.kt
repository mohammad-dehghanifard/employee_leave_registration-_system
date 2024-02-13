package logic
import entities.Employee
import entities.Vacation

class EmployeeService {

    fun registerEmployee(employeeList : MutableList<Employee>) {
       println("لطفا کدملی کارمند مورد نظر را وارد کنید...")
       val inputCode  = readln()
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
}