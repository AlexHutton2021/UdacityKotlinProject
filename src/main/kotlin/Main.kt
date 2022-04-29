import java.util.*

fun main(args: Array<String>) {
    //println("Alex!")

    //Data type called a string, which is used for data values that are made up of ordered sequences of characters
    // "Hello"
    //String can be concatonated using the "+" sign
    //println("Hello + Alex")
    //You can also use string templates to build strings by combining them with values
    //val NumberOfFish = 5
    // NumberOfPotatoes = 10
    //println("I have $NumberOfFish fish and I have $NumberOfPotatoes potatoes") //the dollar variable name is replaced by text representing its value

    // You can also use operators with strings
    //println("I have ${NumberOfFish + NumberOfPotatoes} Fish and Potatoes")
    //== is a by value comparison sign //!= not equal to
    //val fish = "fish"
    //val plant = "plant"
    //plant == fish
    //fish == fish
    //fish != plant

    //val NumberOfFish = 60
    //val NumberOfPotatoes = 10
    //if (NumberOfFish > NumberOfPotatoes)
        //println("Good ratio")
    //else println("bad ratio")

    //more If else statements

    //var heightperson1 = 180
    //var heightperson2 = 180
    //if (heightperson1 > heightperson2) {
    //print("You are allowed to go on the ride")
    //} else if (heightperson1 == heightperson2) {
    //print("Your too short to go on this ride, Sorry")
    //} else {
    //print("Height is not a valid requirement for this ride ")
    //}

    //var oventemp1 = 120
    //var oventemp2 = 180
    //var oventemp3 = 180
    //if (oventemp2 < oventemp1) {
    //print("This temp is perfect for quiches")
    //} else if (oventemp1 > oventemp2) {
    //print("This temp is perfect for cakes")
    //} else if (oventemp3 == oventemp2) {
    //print("This temp is perfect for Roast dinners")
    //}

    //var time1 = 1350
    //var time2 = 1600
    //var time3 = 1900
    //if (time3 < time2) {
    //println(" You qualify be a motogp driver")
    //} else if (time1 == 1250) {
    //println("You qualify to be an F1 driver")
    //} else if (time3 > time2) {
    //println("You qualify to be a F3000 driver")
    //}

    //ranges
    //val M1 = 2500
    //if (M1 in 2000..3000)
        //println("M1")

    //ranges using if, else if
    //val M1 = 9500
    //val M2 = 5300
    //val M3 = 7500
    //if (M1 in 2000..3000){
    //print("M1") }
    //else if (M2 in 4999..5001) {
    //print("M2")}
    //else {
    //print("This is not an M series")
    //}

    //ranges using when statement
    //val NumberofFish = 50
    //when (NumberofFish) {
        //0 -> println("Empty Tank")
        //50 -> println("Full tank")
        //else -> println("Not relevant")
    //}

    //ranges using letters
    //for (i in 'b'..'g')
        //println(i)

    //ranges advancing in multiple steps
    //for (i in 3..6 step 2)
        //println(i)  // print the every 2nd number from range 3, 4, 5 6 ie 3,5

    //for (i in 1 until 10){
    //print("$i")
    //}

    //for (i in 10 downTo(1).step(2))
    //print("$i")

    //for(num 1..10000)
    //if(num==9001){
    //print("Its over 9000")
    // }

    //for(num in 200 downTo(1))
    //if(num==10) {
    //println("10 is the winning number")
    //}

    //ranges for number going downwards
    //for (i in 5 downTo 1)
        //println(i)

    //var age = 18
    //when(age){
    //in 18..20 ->  print("you are legally allowed to drive in the us")
    //in 16..17 -> print("you are legally allowed to vote in the US")
    //in 21..24 -> print("Your legally allowed to drink in US")
    //else ->  print("Your too young to do anything ")
    //}


    //Exercise 1 Create three String variables for trout, haddock, and snapper.
    //Use a String template to print whether you do or don't like to eat these kinds of fish.

    //val trout = "1"
    //val haddock = "1"
    //val snapper = "1"
    //println("when im slightly hungry i can just eat $trout tout")
    //println("when im hungry i can eat ${trout + haddock} trout and haddock")
    //println("When im hungry i can eat $trout trout and $haddock haddock")
    //println("when im very hungry i can eat ${trout + haddock + snapper} haddock and snappers")
    //println("when im super hungry i can eat $trout trout $haddock haddock and $snapper snapper")

    //Exercise 2 Create a when statement with three comparisons:
    //If the length of the fishName is 0, print an error message.
    //If the length is in the range of 3...12, print "Good fish name".
    //If it's anything else, print "OK fish name".
    //if fish.length

    //var fishName.length = 15
    //when (fishName.length) {
    //0 -> println("error")
    //in 3..12 -> println("Good fish name")
    //else -> println("Ok fish name")
    //}

    //Arrays and loops
    //if val variable value is a reference then you cannot assign it a different reference later
    //however if you are referencing something thats not immutable it can still change it only applies to the reference

    //val myList = MutableListOf("carrot", "apple", "banana")
    //val myList = MutableListOf("carrot", "apple", "banana")
    //myList.remove("apple")

    //loops and Arrays
    //val school = arrayListOf<>("Children", "thought", "fish")
    //var fish = 12
    //var plants = 25
    //val swarm = listOf<>(fish, plants)
    //val numbers = intArrayOf(1,2,3)
    //val mix = arrayListOf<>("fish", 2)
    //println(Arrays.toString(mix))

    //cool features of arrays in kotlin is the ability to initialise them with dynamic code
    //val array = Array(5) { it * 2 }
    //println(array.asList()) // initialise an array of 5 elements assign each item to its index times two

    //Combining arrays and 4 loops
    //var fish = 12
    //var plants = 25
    //val swarm = listOf(fish, plants)
    //val bigswarm = arrayOf(swarm, arrayOf("dolphins", "whale", "sea urchins"))
    //for (element in swarm) println (element)

    //while loops executes a block of code repeatedly as long as a given condition is true
    //val x = 1
    //while (x <= 10) {
        //println("$x") //this will print 1 continously becuase 1 is less than 10
    //}

    //var x = 1
    //while (x<=10) {
    //println("$x")  // print in stead of println will result in everything on a single line
    //x++
    //}
    //print("this while loop has been executed") //goes through the code prints 1 adds 1 incrementally goes through the code prints 2 until 9
    //print("\n this while loop has been executed") \n will result in a line break

    //var x = 20
    //while(x >= 0){
    //print("$x")
    //x -= 2
    //}
    //println("This loop is done")

    //var x = 0
    //while (x <= 10){
    //println("$x")
    //x+=1
    //}
   // print("\n This loop has met its condition")

    //var x = 5000
    //while (x <= 5000) {
    //println("$x")
    //x /= 100
    //}
    //println("this loop has met its condition")

    // Do while loops they dont check before they execute at least once

    //var x =15         // now x = 15 (15) is not less than or equal to 10 so the code will be executed once result x = 15 but didnt follow through t=with the rest of the iteration
    //do {
    //print("$x")
    //x++
    //} while (x<=10)
    //("This loopy condition is met")

    //var x = 10000
    //do {
    //print("$x")
    //x--
    //} while (x == 100)
    //("Hey presto magic number is 100")

    // 4loops are generally used to iterate through ranges

    //var felttemp = "cold"
    //var roomtemp = 0
    //while (felttemp == "cold") {
    //roomtemp++
    //if (roomtemp >= 20) {
    //felttemp = "comfy"
    //println("Temp is comfy ")
    //}
    //}



    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}