fun main(){
    val hashMap : HashMap<Int, String> = HashMap<Int, String> ()
    hashMap.put(1,"apple")
    hashMap.put(2,"banana")
    hashMap.put(3,"kiwi")
    hashMap.put(4,"mango")

    println(hashMap)
    println(hashMap.get(4))
    println(hashMap.get(5))

}