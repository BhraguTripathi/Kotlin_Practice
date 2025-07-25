fun main(){
    val str1: String?="GeeksforGeeks"
    val str2: String?=null

    if(str2 is String){
        println("Length of string: ${str2.length}")
    }else{
        println("String is null")
    }
}