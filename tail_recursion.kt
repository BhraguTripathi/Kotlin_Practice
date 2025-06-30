fun fact(num:Int, x:Int):Long{
    return if(num==1) x.toLong()
        else fact(num-1,x*num)
}
fun main(){
    val x=1
    val num=readLine()!!.toInt()
    println(fact(num,x))
}