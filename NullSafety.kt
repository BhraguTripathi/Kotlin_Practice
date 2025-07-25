fun main(){
    val name: String?="Bhragu"
    val length=name?.run{
        println("Name is $this")
        this.length
    }
    println(length)
}