package org.xeus.Functions

fun insidePrint(): String {
    return "inside"
}

fun getGreeting() = "Hi, there!" // single expression function, the return type will be inferred

private fun privateFunc() = "Other file is not allow to use!"

// with parameters
fun greetWithName(name: String) = "Hello, $name"

// Function type
var greetFunc: (String) -> String = {
    "Hello $it"
}

// Override "it" with some param name
var greetFunc2: (String) -> String = { coolName ->
    "Hello $coolName and it disappear!"
}

// Higher-Order func
fun callFunc(a: Int, b: Int,  invoker: (Int, Int) -> Int): Int {
    return invoker(a, b)
}

fun main() {
    fun printSomething(): String {

        return "something"
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    println(insidePrint())
    println(getGreeting())
    println(greetWithName("Teerapat"))
    println(greetFunc("Xeus"))
    println(greetFunc2("Xeus"))
    println(callFunc(2, 6) { a, b ->
        a + b
    }) // call with trailing Lambda expression
}