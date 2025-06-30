fun calculate(a:Int, b:Int, operation: (Int,Int)->Int): Int{
    return operation(a,b)
}
fun main(){
    val add={a:Int,b:Int->a+b}
    val sub={a:Int,b:Int->a-b}
    val multiply={a:Int,b:Int->a*b}
    val division={a:Int,b:Int->a/b}
    val calc=calculate(5,3,add)
    val calc2=calculate(5,2,sub)
    val calc3=calculate(5,3,multiply)
    val calc4=calculate(5,2,division)
    println(calc)
    println(calc2)
    println(calc3)
    println(calc4)
}