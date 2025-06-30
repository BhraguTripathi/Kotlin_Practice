fun student(name : String="Bhragu", standard: String="IX", roll_no: Int=59){
    println("Name : $name")
    println("Standard : $standard")
    println("Roll no. : $roll_no")
}
fun main(args: Array<String>){
    val name="Ram"
    val standard="X"
    val roll_no=56
    student(name=name,roll_no=roll_no, standard = standard)
}