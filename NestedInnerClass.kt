class Engine{
    class Specs{
        fun showSpecs(){
            println("250 horsepower and 6 cylinders")
        }
    }
}
class College{
    val department : String="Computer Science & Engineering"
    inner class Student{
        fun showDepartment(){
            println("The student is from $department")
        }
    }
}
fun main(){
    val specs=Engine.Specs()
    specs.showSpecs()

    val college=College()
    val student=college.Student()
    student.showDepartment()
}