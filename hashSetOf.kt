fun main(){
    val hash=hashSetOf(1,2,3,4,5)
    println(hash)
    hash.add(6)
    println(hash)
    hash.remove(6)
    println(hash)

    println(hash.elementAt(2))
    println(hash.indexOf(5))
    println(hash.lastIndexOf(4))
    println(hash.contains(6))
    
}