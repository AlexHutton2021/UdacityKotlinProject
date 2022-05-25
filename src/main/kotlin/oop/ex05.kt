package oop

//scope - Shadowing is useful for decoupling your code from other parts of the system. It is possible because names are bound to current scope
//try to avoid use shadowing for 2 reasons
//1. Your code becomes hard to read as two different things have the same name
//2. Once shaowed, you can no longer acccess the original variable with scope
fun main(args: Array<String>) {
    myFunction(5)
}

//This a is a parameter
fun myFunction(a: Int) {
// if you try and assign a value to a it will not work as you cannot assign a value to a parameter within the function
// You cannot reassign a value to it
// a is a variable
    var a = 5
    println("a is $a")
}