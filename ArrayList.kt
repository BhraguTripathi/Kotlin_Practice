fun main(){
    val numbers=arrayListOf(1,2,3)
    println(numbers)

    numbers.add(4)
    numbers.add(1,5)
    println(numbers)

    numbers.remove(2)
    numbers.removeAt(1)
    println(numbers)

    numbers[0]=6

    for(number in numbers){
        print("$number ")
    }
}