open class bbc {
    protected val int=10
}
class B : bbc(){
    fun getValue(){
        println(int)
    }
}
fun main(){
    val obj=B()
    obj.getValue()
    //println(obj.int)
}