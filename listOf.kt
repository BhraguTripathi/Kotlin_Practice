fun main(){
    val list=listOf("apple","banana","grapes","kiwi","apple")
    println(list[0])
    println(list.last())
    for(fruit in list){
        print("$fruit ")
    }
    println()
    println(list.filter {it.startsWith("a")})
    println(list.indexOf("apple"))
    println(list.get(2))
    println(list.lastIndex)
    println(list.sorted())

}