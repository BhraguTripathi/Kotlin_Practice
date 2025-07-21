class AddingNumbers{
    var sum:Int=0
    constructor(a:Int,b:Int){
        sum=a+b
        println(sum)
    }
    constructor(a:Int,b:Int,c:Int): this(a,b,c,8){
        sum=a+b+c
        println(sum)
    }
    constructor(a:Int,b:Int,c:Int,d:Int){
        sum=a+b+c+d
        println(sum)
    }
}
fun main(){
    val add1=AddingNumbers(5,6)
    val add2=AddingNumbers(8,5,6)
}