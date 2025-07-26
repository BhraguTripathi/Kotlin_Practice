fun main(){
    val num:Int=26
    for(i in 1.rangeTo(num)){
        print("$i ")
    }
    println()
    ('a'..'z').reversed().forEach{
        print("$it ")
    }
}