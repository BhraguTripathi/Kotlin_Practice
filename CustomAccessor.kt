class Rectangle(val width: Int, val height: Int){
    val isSquare : Boolean
        get() = width==height
}
fun main(){
    val rectangle=Rectangle(5,5)
    println(rectangle.isSquare)
}