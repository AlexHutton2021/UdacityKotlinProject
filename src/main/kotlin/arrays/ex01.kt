package arrays


fun main(args: Array<String>) {

    //cool features of arrays in kotlin is the ability to initialise them with dynamic code
    val array = Array(5) { it * 2 }
    println(array.asList()) // initialise an array of 5 elements assign each item to its index times two

    //Combining arrays and 4 loops
    var bananas = 12
    var pears = 25
    val list = listOf(bananas, pears)
    val newList = arrayOf(list, arrayOf("dolphins", "whale", "sea urchins"))
    for (element in list) println (element)

    //while loops executes a block of code repeatedly as long as a given condition is true
    val b = 1
    while (b <= 10) {
        println("$b") //this will print 1 continously becuase 1 is less than 10
    }

    var g = 1
    while (g<=10) {
        println("$g")  // print in stead of println will result in everything on a single line
        g++
    }
    print("this while loop has been executed") //goes through the code prints 1 adds 1 incrementally goes through the code prints 2 until 9
    print("\n this while loop has been executed") //\n will result in a line break

    var p = 20
    while(p >= 0){
        print("$p")
        p -= 2
    }
    println("This loop is done")

    var x = 0
    while (x <= 10){
        println("$x")
        x+=1
    }
    print("\n This loop has met its condition")

    var q = 5000
    while (q <= 5000) {
        println("$q")
        x /= 100
    }
    println("this loop has met its condition")

    // Do while loops they dont check before they execute at least once

    var a =15         // now x = 15 (15) is not less than or equal to 10 so the code will be executed once result x = 15 but didnt follow through t=with the rest of the iteration
    do {
        print("$a")
        x++
    } while (a<=10)
    ("This loopy condition is met")

    var w = 10000
    do {
        print("$w")
        w--
    } while (w == 100)
    ("Hey presto magic number is 100")

    //4loops are generally used to iterate through ranges, arrays collections set of values that are stored in a construct

    var felttemp = "cold"
    var roomtemp = 0
    while (felttemp == "cold") {
        roomtemp++
        if (roomtemp >= 20) {
            felttemp = "comfy"
            println("Temp is comfy ")
        }
    }

    for (num in 1..10){
        print("$num")
    }

    for (j in 1 until 10){
        print("$j")
    }

    for (k in 10 downTo 1 step 2 ){
        print("$k")
    }

    //Arrays and loops
    //if val variable value is a reference then you cannot assign it a different reference later
    //however if you are referencing something thats not immutable it can still change it only applies to the reference

    val list1 = arrayOf("carrot", "apple", "banana")
    println(list1)

    //loops and Arrays
    val school = arrayListOf("Children", "thought", "fish")
    var fish = 12
    var plants = 25
    val swarm = listOf<Int>(fish, plants)
    val newnumbers = intArrayOf(1,2,3)
    val combo = arrayListOf(fish, 2)
    println(combo.toString())

    // collections are simply a group of the same type of data or a different type of data
    // in Kotlin there are two categories of collections classes taht than only hold one type of element or bpth one type and different type of element
    //collections of only the same element
    //IntArray - Integer
    //BooleanArray - Boolean
    //DoubleArray - Double
    //ByteArray - Byte
    //LongArray - Long
    //FloatArray - Float

    //immutable collections can only read the values but cannot write to it
    //List - listOf //is similar to array of but with more helper methods for performing operations on its values and can be increased when neeeded
    //set - setOf   //is a class that ensures there are no duplicate values in a group
    //Map - mapOf //mapOf is arranged as a key value pair where each value has a key in which to identify it

    //Mutable collections
    //Mutable list - ArrayList, arrayListOf, mutableListOf
    //Mutable Set - mutableSetOf, hashSetOf
    //Mutable Map - HashMap, hashMapOf, mutableMapOf

    val nxtInteger:IntArray = intArrayOf(1,2,3,4,5,6)
    val nxtInteger1 = intArrayOf(1,2,3,4,5,6)
    val nxtInteger2 = arrayOf(1,2,3,4,5,6)
    print(nxtInteger.contentToString()) //will need to use a utility method provided by kotlin for that purpose
    for (element in nxtInteger) {
        print("initial values ${nxtInteger.contentToString()}")
        print(element)               //will just print 1,2,3,4,5,6
        print(" ${element+2}")       //will print the summation of the array plus 2
        print(nxtInteger[4])         //print the 1st number 0=1, 1=2 2=3 etc
        nxtInteger[0] = 6        //If an number that is not referenced is used we will get an index out of bound exception
        nxtInteger[1] = 5
        nxtInteger[4] = 2
        nxtInteger[5] = 1
        print("\n New values ${nxtInteger.contentToString()}")
    }

    val numbers = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0)
    for (element in numbers) {
        print("initial values ${numbers.contentToString()}")
        numbers[0] = 6.0
        numbers[1] = 5.0
        numbers[4] = 2.0
        numbers[5] = 1.0
        print("\n New values ${numbers.contentToString()}")
    }
    val Dayzs = arrayOf("sun", "mon", "tue", "wed", "thu", "fri", "sat")
    print(Dayzs.contentToString())

    val Months = arrayOf("jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec")
    print(Months.contentToString())

//    val newfruits = arrayOf(Fruit("Apple", 2.5), (Fruit ( "Banana", 0.5 )))
//    for (fruit in Fruit) {
//    print(" ${fruit.name}")
//    }
//    print(newfruits.contentToString())
//    for (index in newfruits.indicies){
//    print("${newfruits[index].name} is in index $index")
//    }


    //lists can be used to list a group of values
    val months = listOf("jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec")
    val anyTypes = listOf(1, 2, 3, true, false, "string")
    print(anyTypes.size)   //this will print the number of values in the list in this case 6
    print(months[0])       //This will print the 1st month listed
    for (month in months){
        println(month)       //This will also print all the months
    }
    val additionalMonths = months.toMutableList() //in order to make a list that mutable we can convert our existing list to a mutable list and then add items
    val newMonths = arrayOf("april", "may", "june")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("june")
    print(additionalMonths)                //print months + newMonths using addAll method
    print(additionalMonths)                // print months + june

    val days = mutableListOf("mon", "tue", "wed","thur", "fri", "sat")
    days.add("sun")
    print(days)

    val appFunction = mutableListOf("login", "search", "addTocart", "checkout")
    appFunction.add("logout")
    print(appFunction)

    val rainbbow = mutableListOf("red", "yellow", "pink", "blue", "purple", "orange")
    rainbbow.add("violet")
    rainbbow[0] = "green"
    rainbbow.removeAt(index = 1)      //rainbbow.removeAll will remove the whole list
    print(rainbbow)

    //sets and maps
    val fruits = setOf("guava", "jackfruit", "dragonfruit", "passionfruit", "mango", "grape", "guava" )
    print(fruits.size)     //gives you the total number of unique fruits
    print(fruits.toSortedSet())   //order alphabetically without duplicates

    val newFruits = fruits.toMutableList()
    newFruits.add("pear")
    newFruits.add("peach")
    newFruits.add("plum")
    newFruits.add("pomegranet")
    print(newFruits.elementAt(index = 3))  //reference passionfruit from this list [guava, jackfruit, dragonfruit, passionfruit, mango, grape, pear, peach, plum, pomegranet]

    //maps
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday", 4 to "Thursday", 5 to "Friday", 6 to "Saturday", 7 to "Sunday")   // each key can only exist once also known as hashmaps {referring to the key values}
    print(daysOfTheWeek[2])    //result would be to print Tuesday
    for(key in daysOfTheWeek.keys)
        print("$key is to ${daysOfTheWeek[key]}")   //result will print tuesday
    val newDaysOfTheWeek = daysOfTheWeek.toMutableMap()
    newDaysOfTheWeek[1] = "Sunday"
    newDaysOfTheWeek[2] = "Monday"
    newDaysOfTheWeek[3] = "Tuesday"
    newDaysOfTheWeek[4] = "Wednesday"
    newDaysOfTheWeek[5] = "Thursday"
    newDaysOfTheWeek[6] = "Friday"
    newDaysOfTheWeek[7] = "Saturday"
    print(newDaysOfTheWeek.toSortedMap())



//    val fruitsMap = mapOf("favourite" to Fruit(name = "grape", price = 1.0), "ok" to Fruit(name = "Apple", price = 1.5), "2nd Favourite" to Fruit(name = "peach", price = 2.0))
//    print(fruitsMap)
//    val newFruitsMap1 = fruitsMap.toMutableMap()
//    newFruitsMap2[1.toString()] = ("New favourite" to Fruit(name = "Plum", price = 4.0))
//    newFruitsMap3[2.toString()] = ("It'll do" to Fruit(name = "pumpkin", price = 5.5))
//    newFruitsMap4[3.toString()] = ("2nd Favourite" to Fruit(name = "pear", price = 2.0))
//
//    val fruitsMap1 = mapOf(
//    "favourite" to Fruit(name = "grape", price = 1.0),
//    "ok" to Fruit(name = "Apple", price = 1.5),
//    "2nd Favourite" to Fruit(name = "peach", price = 2.0)
//    )
//    print(fruitsMap)
//    val newFruitsMap = fruitsMap.toMutableMap()
//    newFruitsMap[1.toString()] = ("New favourite" to Fruit(name = "Plum", price = 4.0))
//    newFruitsMap[2.toString()] = ("It'll do" to Fruit(name = "pumpkin", price = 5.5))
//    newFruitsMap[3.toString()] = ("2nd Favourite" to Fruit(name = "pear", price = 2.0))


    //Arraylist are used to create a dynamic array.
    //Which means the size of an ArrayList can be increased or decreased according to the requirement
    //The ArrayList class provides both read and write functionalities
    //The ArrayList follows the sequence of assertion order
    //An ArrayList is non synchronised and it may contain duplicate elements
    //ArrayList<E>(): Is used to create an empty array list
    //ArrayList(capacity: Int) is used to create an ArrayList of specified capacity
    //ArrayList(elements: Collection<E>) Is used to create an ArrayList filled with the elements of a collection

    //Empty ArrayList
    val arrayList = ArrayList<String>()
    arrayList.add("one")
    arrayList.add("two")
    println("print ArrayList")
    for (i in arrayList) {
        println(i)
    }



}




