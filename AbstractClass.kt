abstract class Animal{
    abstract fun sound()
    fun eat(){
        println("Animal is eating")
    }
}
class Dog: Animal(){
    override fun sound(){
        println("Dog bark's")
    }
}
fun main(){
    val dog=Dog()
    dog.sound()
    dog.eat()
}