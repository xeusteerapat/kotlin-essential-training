package org.xeus.Functions

fun insidePrint(): String {
    return "inside"
}

fun getGreeting() = "Hi, there!" // single expression function, the return type will be inferred

fun main() {
    fun printSomething(): String {

        return "something"
    }

    println(insidePrint())
    println(getGreeting())
}