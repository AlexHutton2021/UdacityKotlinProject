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


//    val fish = "fish"
//    val plant = "plant"
//    plant == fish
//    fish == fish
//    fish != plant
//
//    val NumberOfFish = 60
//    val NumberOfPotatoes = 10
//    if (NumberOfFish > NumberOfPotatoes)
//    println("Good ratio")
//    else println("bad ratio")
}