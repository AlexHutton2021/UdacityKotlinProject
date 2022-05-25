fun main() {

    var denis = Person("Alex", "Hutton", "age: 39")
    var john = Person()
    john.hobby = "play video games"
    println("denis is ${denis.age} years old")
    john.statehobby()
    var johnPeterson = Person(lastName = "Peterson")
    denis.hobby = "to play poker"
    denis.statehobby()


}

//classes and objects (inheritance)
class Person(firstName: String = "John", lastName: String = "Doe"){   ////constructor allows us to add values to our objects when we create objects of our class
    // Member variables - properties is a variable within a class
    var age : Int? = null
    var hobby : String = "is to watch Netflix"
    var firstName : String? = null
    //Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new person object with" + "firstName = $firstName and lastName = $lastName and age $age")
        //member secondary constructor
        constructor(firstName: String, lastName: String, age: Int)  // the age that is given to the constructor when the object is created should be assigned to the age of class var age: Int? = null
        : this(firstName,lastName){
            this.age = age
        }
    }
        //member functions - methods a function within a class
    fun statehobby(){
        println("$firstName\'s hobby is $hobby")
    }
}

//Exercise 1
//Try and create a class called MobilePhone. It should have 3 primary constructor variables osName,brand,model
//use the initialiser to print those details
//create three objects of that class in the main function
//example would be Samsung galaxy S20 Ultra, osName = Android, brand = Samsung, model = Galaxy S20 Ultra

//fun main() {
//    val iPhone = MobilePhone("iPhone10", "iPhone11", "iPhone12")
//    val galaxy = MobilePhone("Samsungs9", "Samsungs10", "Samsungs10" )
//    val google = MobilePhone("pixel5", "pixel5a", "pixel6")
//
//}
//class MobilePhone(osName: String, brand: String, model: String){   ////constructor allows us to add values to our objects when we create objects of our class
//
//    //Initializer Block
//    init {
//        println("Mobile phone is $model from $brand which is uses $osName as its operating system")
//    }
//
//}