fun main(){
    val fruits=setOf("apple","banana","grapes","kiwi","apple")
    println(fruits.last())
    println(fruits.first())

    for(fruit in fruits){
        print("$fruit ")
    }
    println()
    println(fruits.filter{it.contains("a")})
}