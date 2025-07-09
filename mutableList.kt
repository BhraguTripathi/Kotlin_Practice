fun main(){
    val mutableList= mutableListOf("apple","banana","kiwi","grape")
    println(mutableList)
    mutableList.add("mango")
    mutableList[0]="pineapple"

    for(fruits in mutableList){
        print("$fruits ")
    }

}