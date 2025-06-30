fun sum(arr: Array<Int>, index : Int): Int{
    return if(index<=0) 0
        else (sum(arr,index-1)+arr[index-1])
}
fun main(args: Array<String>){
    val arr=arrayOf(1,2,3,4,5)
    val n=arr.size
    val result=sum(arr,n)
    println(result)
}