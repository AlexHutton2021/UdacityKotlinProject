package oop

//lateinit plus setters and getters
fun main() {
    var myCar = Car()
    println("brand is : ${myCar.myBrand}")

}
//Only thing to be mindful of is not to use the variable before you have initialised it
class Car(){
    lateinit var owner : String

    val myBrand: String = "ASTON"
    get() {
        return field.tolowercase()
    }

    init {
        this.owner = "Alex"
    }


}