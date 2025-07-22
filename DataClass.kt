data class Person(val name:String, val age: Int, val height:Int)

fun main(){
    val man=Person("Man",65,150)
    println(man)
    val man2=man.copy("Man 2")
    println(man2)
    val man3=man.copy("Man 3")
    println(man3)
}