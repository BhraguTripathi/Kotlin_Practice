class Company1<T>(name: T){
    var companyName=name
}
fun main(){
    val c1=Company1("TCS")
    val c2=Company1(1234)

    println(c1.companyName)
    println(c2.companyName)
}