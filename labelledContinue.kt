fun main(args : Array<String>){
    outer@ for(num1 in 4 downTo 1){
        inner@ for (num2 in 4 downTo 1){
            if(num2<=2)
                continue@inner
            println("$num1 ; $num2")
        }
    }
}