//enum class TrafficSignal{
//    Red, Yellow, Green
//}
//fun signalAction(signal: TrafficSignal){
//    when(signal){
//        TrafficSignal.Red ->println("Stop")
//        TrafficSignal.Yellow -> println("Wait")
//        TrafficSignal.Green -> println("Go")
//    }
//}
//fun main(){
//    val redSignal=TrafficSignal.Red
//    signalAction(redSignal)
//}

enum class Days(val isWeekend: Boolean=false){
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true);

    companion object {
        fun today(obj: Days): Boolean{
            return obj.name.compareTo("SATURDAY")==0 || obj.name.compareTo("SUNDAY")==0
        }
    }
}
fun main(){
    for(days in Days.values()){
        println("${days.name} is weekend ${days.isWeekend}")
    }
    val today=Days.THURSDAY
    println(today.isWeekend)
}