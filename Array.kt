fun main(){
//    val arrayName=arrayOf(1,2,3,4,5)
//    for(i in 0..arrayName.size-1){
//        print(" "+arrayName[i])
//    }
//    println()
//    arrayName.forEach({index -> print(" "+index)})

    print("Enter the size of an array: ")
    val num=readLine()!!.toInt()

    val array=Array(num) {0}
    for(i in 0 until num){
        array[i]=readLine()!!.toInt()
    }

    print("Your array:")
    for(i in array){
        print(" "+i)
    }
    println()
}