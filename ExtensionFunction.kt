class Circle(val radius: Double){
    fun area(): Double{
        return Math.PI*radius*radius
    }
}
fun Circle.perimeter(): Double{
    return 2*Math.PI*radius
}
fun main(){
    val circle=Circle(2.5)
    println(String.format("%.2f",circle.area()))
    println(String.format("%.2f", circle.perimeter()))
}