val anonymous1=fun(x:Int,y:Int):Int=x+y

val anonymous2=fun(a:Int,b:Int):Int{
    val mul=a*b
    return mul
}

fun main(){
    println(anonymous1(5,3))
    println(anonymous2(5,2))
}
