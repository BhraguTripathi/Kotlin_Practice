class Utils {
    fun greet(name: String): String {
        return "Hello $name"
    }

    companion object{
        fun sayHello(): String{
            return "Hello from the Kotlin Static function"
        }
    }
}