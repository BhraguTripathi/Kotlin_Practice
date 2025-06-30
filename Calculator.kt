fun main(){
    println("What do you want to do: \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Quotient\n5.Remainder")
    val n=readLine()!!.toInt()
    print("Enter the first value: ")
    val a=readLine()!!.toInt()
    print("Enter the second value: ")
    val b=readLine()!!.toInt()
    when(n){

        1 -> println("Addition of two number is: "+(a+b))
        2 -> println("Subtraction of two number is: "+(a-b))
        3 -> println("Multiplication of two number is: "+(a*b))
        4 -> println("Quotient of two number is: "+(a/b))
        5 -> println("Remainder of two number is: "+(a%b))
        else -> println("Invalid Input")
    }
}
