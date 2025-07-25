fun main(){
    val name="Bhragu"
    val age=22
    val salary=2222.22
    val empId=524f
    val employeeDetails: List<Any> =listOf(name,age,salary,empId)

    for(attribute in employeeDetails){
        when(attribute){
            is String -> println("Name: $attribute")
            is Int -> println("Age: $attribute")
            is Double -> println("Salary: $attribute")
            else -> println("Employee ID: $attribute")
        }
    }
}