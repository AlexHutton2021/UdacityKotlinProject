package oop

//scope

fun main(args: Array<String>) {

    myFunction(a:5)
}

//This a is a parameter
fun myFunction(a:Int){
// if you try and assign a value to a it will not work as you cannot assign a value to a parameter within the function
// You cannot reassign a value to it
// a is a variable
var a = 5
println("a is $a")


}