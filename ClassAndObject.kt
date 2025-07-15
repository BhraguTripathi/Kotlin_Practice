class Employee(val name: String, val age: Int, val gender: Char, val salary: Double){
    fun showDetails(){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("Salary: $salary")
    }
}
fun main(){
    val employee1=Employee("Bhragu",22,'M',220000.00)
    employee1.showDetails()
}