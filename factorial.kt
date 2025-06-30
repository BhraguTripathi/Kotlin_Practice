fun fact(num: Int) : Long{
    return if(num==1) num.toLong()
        else num*fact(num-1)
}
fun main(args : Array<String>){
    val num=readLine()!!.toInt()
    println(fact(num))
}