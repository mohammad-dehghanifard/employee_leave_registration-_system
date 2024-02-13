package entities

data class Employee(
    val firstName : String,
    val lastName : String,
    val mobile : String,
    val code : String,
    val birthYear : Int,
    val vacations : MutableList<Vacation>
)
