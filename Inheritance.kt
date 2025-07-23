//open class Employee(name: String, age:Int, salary:Long){
//    init{
//        println("My name is $name and my age is $age and my salary is $salary")
//    }
//}
//class WebDeveloper(name: String,age: Int,salary: Long): Employee(name,age,salary){
//    fun display(){
//        println("I am web developer")
//        println()
//    }
//}
//class AndroidDeveloper(name: String,age: Int,salary: Long): Employee(name,age,salary){
//    fun display(){
//        println("I am android developer")
//        println()
//    }
//}
//class IOSDeveloper(name: String,age: Int,salary: Long): Employee(name,age,salary){
//    fun display(){
//        println("I am ios developer")
//        println()
//    }
//}
//fun main(){
//    val employee1=AndroidDeveloper("Bhragu",22,200000)
//    employee1.display()
//}

//open class Animal{
//    open fun run(){
//        println("Animal can run")
//    }
//}
//class Tiger: Animal(){
//    override fun run() {
//        println("Tiger can run very fast")
//    }
//}
//fun main(){
//    val tiger=Tiger()
//    tiger.run()
//}