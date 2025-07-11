fun main(){
    val fruits=setOf("apple","banana","grapes","kiwi","apple")
    println(fruits.last())
    println(fruits.first())

    for(fruit in fruits){
        print("$fruit ")
    }
    println()
    println(fruits.filter{it.contains("a")})

    println(fruits.indexOf("apple"))
    println(fruits.elementAt(2))
    println(fruits.lastIndexOf("apple"))
    println(fruits.count())

}