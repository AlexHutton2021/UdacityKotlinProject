package variables

fun main(args: Array<String>) {

//variable is a location in memory (storage)
//To indicate the storage area, each variable should be given a unique (identifier)


//Exercise 1 Create three String variables for trout, haddock, and snapper.
//Use a String template to print whether you do or don't like to eat these kinds of fish.

    var trout = "1"
    var haddock = "1"
    var snapper = "1"
    println("when im slightly hungry i can just eat $trout trout")
    println("when im hungry i can eat ${trout + haddock} trout and haddock")
    println("When im hungry i can eat $trout trout and $haddock haddock")
    println("when im very hungry i can eat ${trout + haddock + snapper} haddock and snappers")
    println("when im super hungry i can eat $trout trout $haddock haddock and $snapper snapper")

}