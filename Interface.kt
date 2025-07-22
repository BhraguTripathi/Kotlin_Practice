interface Vehicle{
    fun start()
    fun stop()
}
class Car: Vehicle{
    override fun start(){
        println("Car is started.")
    }
    override fun stop(){
        println("Car is stopped")
    }
}
fun main(){
    val car=Car()
    car.start()
    car.stop()
}