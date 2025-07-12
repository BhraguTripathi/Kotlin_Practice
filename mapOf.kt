fun main(){
    val map=mapOf(1 to "apple", 2 to "banana", 3 to "kiwi", 4 to "orange", 1 to "watermealon")
    println(map)
    println(map.size)
    println(map.getValue(2))
    println(map.getOrDefault(4,2))
    println(map.getOrElse(5,{ 4 }))
}