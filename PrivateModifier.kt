class Private{
    private val int=5
    fun display(){
        println(int)
    }
}
fun main(){
    val private=Private()
    //println(private.int)
    private.display()
}