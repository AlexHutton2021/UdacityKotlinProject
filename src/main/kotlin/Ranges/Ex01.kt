package Ranges

fun main(args: Array<String>) {

    //ranges
    val M5 = 2500
    if (M5 in 2000..3000)
        println("M5")

    //ranges using if, else if
    val M1 = 9500
    val M2 = 5300
    val M3 = 7500
    if (M1 in 2000..3000){
        print("M1") }
    else if (M2 in 4999..5001) {
        print("M2")}
    else {
        print("This is not an M series")
    }

    //ranges using when statement
    val numOfFish = 50
    when (numOfFish) {
        0 -> println("Empty Tank")
        50 -> println("Full tank")
        else -> println("Not relevant")
    }

    //ranges using letters
    for (i in 'b'..'g')
        println(i)

    //ranges advancing in multiple steps
    for (j in 3..6 step 2) {
        println(j)  // print the every 2nd number from range 3, 4, 5 6 ie 3,5
    }

    for (k in 1 until 10){
        print("$k")
    }

    for (l in 10 downTo(1) step(2)) {
        print("$l")
    }

    for(num in 200 downTo(1))
        if(num==10) {
            println("10 is the winning number")
            }

            //ranges for number going downwards
            for (i in 5 downTo 1) {
                println(i)
            }

            var age = 18
            when (age) {
                in 18..20 -> print("you are legally allowed to drive in the us")
                in 16..17 -> print("you are legally allowed to vote in the US")
                in 21..24 -> print("Your legally allowed to drink in US")
                else -> print("Your too young to do anything ")
            }


        }

