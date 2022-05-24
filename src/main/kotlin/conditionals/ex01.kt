package conditionals
fun main(args: Array<String>) {
    // If else statements

    var heightperson1 = 180
    var heightperson2 = 180
    if (heightperson1 > heightperson2) {
        print("You are allowed to go on the ride")
    } else if (heightperson1 == heightperson2) {
        print("Your too short to go on this ride, Sorry")
    } else {
        print("Height is not a valid requirement for this ride ")
    }

    var oventemp1 = 120
    var oventemp2 = 180
    var oventemp3 = 180
    if (oventemp2 < oventemp1) {
        print("This temp is perfect for quiches")
    } else if (oventemp1 > oventemp2) {
        print("This temp is perfect for cakes")
    } else if (oventemp3 == oventemp2) {
        print("This temp is perfect for Roast dinners")
    }

    var time1 = 1350
    var time2 = 1600
    var time3 = 1900
    if (time3 < time2) {
        println(" You qualify be a motogp driver")
    } else if (time1 == 1250) {
        println("You qualify to be an F1 driver")
    } else if (time3 > time2) {
        println("You qualify to be a F3000 driver")
    }

//Exercise 2 Create a when statement with three comparisons:
//If the length of the fishName is 0, print an error message.
//If the length is in the range of 3...12, print "Good fish name".
//If it's anything else, print "OK fish name".
//if fish.length

//var new.length = 15
//when (new.length) {
//0 -> println("error")
//in 3..12 -> println("Good fish name")
//else -> println("Ok fish name")
//}




}
