package operators

fun main(args: Array<String>) {
    println("---------Exercise0---------")

    // string concatenation
    println("Hello + Alex")
    println("Hello " + "Alex")

    // string interpolation
    val numberOfFish = 5
    val numberOfPotatoes = 10
    println("I have $numberOfFish fish and I have $numberOfPotatoes potatoes")

    // expression in string interpolation
    //  You can also use operators with strings
    println("I have ${numberOfFish + numberOfPotatoes} Fish and Potatoes")

    println("do I have more fish than potatoes? ${numberOfFish > numberOfPotatoes}")
    // == is a by value comparison sign //!= not equal to


    val fish = "fish"
    val plant = "plant"
    plant == fish
    fish == fish
    fish != plant

    val numberFish = 60
    val numberPotatoes = 10
    if (numberFish > numberPotatoes)
    println("Good ratio")
    else println("bad ratio")



    //Boolean is used o represent logical values
    //Cant have two possible values true and false
    //var isSunny: Boolean = true
    //isSunny = false // sun is no longer shinning

    //Characters
    val letterChar = 'A'
    val digitChar = '$'

    //strings
    val myStr = "Hello World"
    var firstCharIntStr = myStr[0] //First character of Hello world
    var lastCharIntString = myStr[myStr.length -1] // last character of Hello World
    print("First Character$firstCharIntStr")


    //Arithmatic operators (+, -, /, *, %)
    var result = 5+3
    result = 15%2  //modular is the reminder 15/2 = 7 carry 1
    print(result)

    var newResult = 5+3
    val a = 5.0
    val b = 3
    var newResultDouble: Double
    newResultDouble = a / b
    print(newResultDouble)

    //comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3 // == checks the the value on the left hand side = the value on the right hand side you will get a true false result
    print("is equal is" + isEqual)

    val isNotEqual = 5!=5 // != checks is equal to
    print("isNotEqual$isNotEqual")

    println("is5greater3 ${5>3}")
    println("is5lessthan3 ${5<3}")
    println("is5lessthanequalto3 ${5<=3}")
    println("is3morethanorequalto5 ${3>=5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 10
    myNum += 5
    println("myNum is $myNum")

    var mynewNum = 100
    mynewNum -= 100
    println("myNum is $mynewNum")

    var mynextNum = 1000
    mynextNum *= 2
    println("myNum is $mynextNum")

    var mylatestNum = 1000
    mylatestNum /= 100
    mylatestNum += 5
    mylatestNum *= 3
    println("myNum is $mylatestNum")

    //Increment and decrement operators ( ++, -- )
    myNum++
    println("myNum is $myNum")
    myNum--
    println("myNum is $myNum")
    print("myNum is ${myNum++}")
    println("myNum is ${++myNum}")




}