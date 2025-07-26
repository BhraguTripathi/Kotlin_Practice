fun main(){
//    val input=123
//    val regex= Regex("123")
//    println(regex.containsMatchIn("1"))

    val pattern = Regex("ll")
    val ans: MatchResult?=pattern.find("HelloWorld",0)
    println(ans?.value)
}