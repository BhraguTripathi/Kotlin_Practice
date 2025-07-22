sealed class Demo{
    class ABC: Demo(){
        fun display(){
            println("Subclass ABC of Sealed Class")
        }
    }
    class ADC:Demo(){
        fun display() {
            println("Subclass ADC of Sealed Class")
        }
    }
}
fun main(){
    val obj1=Demo.ABC()
    obj1.display()

    val obj2=Demo.ADC()
    obj2.display()
}