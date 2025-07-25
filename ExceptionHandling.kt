fun main(){
    val num1=readLine()!!.toInt()
    val num2=readLine()!!.toInt()
    try{
        val calc=(num1/num2)
    }catch (e : ArithmeticException){
        println("There is an error in the code: ${e.message}")
    }finally {
        println("Please check the number.")
    }
}