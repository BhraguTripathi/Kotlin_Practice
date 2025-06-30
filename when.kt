fun main(args: Array<String>){
    print("Enter the name of hevenly body: ")
    var name=readLine()!!.toString()
    when(name){

        "Sun" -> println("Sun is a star")
        "Moon" -> println("Moon is a satellite")
        "Earth" -> println("Earth is a planet")
        else -> println("I don't about this right now")
    }
}