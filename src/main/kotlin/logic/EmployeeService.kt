package logic
import entities.Employee
import entities.Vacation
import java.lang.Exception

class EmployeeService {

    fun registerEmployee(employeeList : MutableList<Employee>) {
       println("لطفا کدملی کارمند مورد نظر را وارد کنید...")
       val inputCode  = readln()
        checkEmployeeForRegister(inputCode = inputCode, employeeList = employeeList)
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

    fun setVacation(employeeList : MutableList<Employee>) {
        println("لطفا کدملی کارمند مورد نظر را وارد کنید...")
        val inputCode  = readln()
        val employee : Employee = checkEmployeeForSetVacation(inputCode = inputCode, employeeList = employeeList)
        println("لطفا تاریخ مورد نظر خود را وارد کنید")
        val date : String = readln()
        val vacation = Vacation(employeeCode = inputCode,date = date)
        employee.vacations.add(vacation)
        println("درخواست شما با موفقیت ثبت شد!")
    }

    private fun checkEmployeeForRegister(employeeList : MutableList<Employee>,inputCode : String) {
        val findEmployee = employeeList.filter { it.code == inputCode }
        if (findEmployee.isNotEmpty()){
            throw Exception("در حال حاضر یک کاربر با این کدملی وجود دارد!")
        }
    }

    private fun checkEmployeeForSetVacation(employeeList : MutableList<Employee>,inputCode : String) : Employee {
        val findEmployee = employeeList.filter { it.code == inputCode }
        if (findEmployee.isEmpty()){
            throw Exception("کارمندی  با این کد ملی ثبت نشده است!")
        }
        return findEmployee[0]
    }
}