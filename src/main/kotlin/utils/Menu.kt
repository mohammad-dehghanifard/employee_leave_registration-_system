package utils

class Menu {
    companion object{
        fun getMenu() : Int {
            println("لطفا انتخاب نمایید : ")
            println("[0] -> خروج از سامانه")
            println("[1] -> ثبت کارمند جدید")
            println("[2] -> ثبت مرخصی برای کارمندان")
            return readln().toInt()
        }
    }
}