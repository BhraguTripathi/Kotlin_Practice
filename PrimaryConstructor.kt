class Add(val a:Int, val b:Int){
    init {
        println("Constructor is started")
    }
    val c=a+b
    init {
        println("Constructor is ended")
    }
}
fun main(){
    val add=Add(5,5)
    println(add.c)
}