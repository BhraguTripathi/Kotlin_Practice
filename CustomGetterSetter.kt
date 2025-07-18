class User{
    var email : String=""
        get()=field.lowercase()
        set(value){
            field=value.trim()
        }

    var password: String=""
        set(value){
            if(value.length>=6) field=value
            else println("Password is too short")
        }

    var age: Int=0
        set(value){
            field=if(value>0) value else 0
        }

    var gender : Char='U'
}
fun main(){
    val user=User()
    user.email="bhragutripathi@gmail.com"
    user.password="12345"
    user.age=21
    user.gender='M'

    println(user.email)
    println(user.password)
    println(user.age)
    println(user.gender)
}