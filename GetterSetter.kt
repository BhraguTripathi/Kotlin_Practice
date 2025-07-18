class Company{
    var name : String = "DefaultValue"
        get()= field
        set(value){
            field=value
        }
}
fun main(){
    val company=Company()
    company.name="Chatgpt"
    println(company.name)
}