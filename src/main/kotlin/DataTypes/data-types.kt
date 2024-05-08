package org.xeus.DataTypes

fun main() {
    // val is read-only variable
    val somethinTrue = true
    val num = 1
    val str = "Teerapat"

    println("somethingTrue: $somethinTrue , number: $num , str: $str")

    // var can be re-assign
    var name = "Xeus"
    println("Before :$name")

    name = "Teerapat Prommarak"
    println("After :$name")

    // Numeric data types
    val normalInt = 38
    val longInt: Long = 10000000000000
    // or
    val anotherLong = 10L
    // or same as js
    val hundredMillion = 100_000_000
    val someFloat: Float = 0.0f

    // conversion
    println(10.5.toInt()) // 10

    // String and Char
    val aChar = 'a' // use single quote
    val bChar = 'b'
    val someStr = "something" // use double quote

    // concat String
    val aAndB = someStr + " cool!"
    println(aAndB)

    // or use template literal
    println("My name is $name") // My name is Teerapat Prommarak

    // multi-line string
    val multiLine = """
        Something
        kinda
        Cool!
    """.trimIndent()

    println(multiLine)

    // String methods
    println("Hello".isEmpty()) // false
    println("  Hello  ".trim()) // "Hello"
    println("hello".contains("l")) // true
    println("hello".uppercase()) // HELLO

    // Null and Non-Nullable types
    val canBeNull: String? = null
    println(canBeNull?.length) // null safe call to prevent NullPointerException. This will print null

    // provide default value
    println(canBeNull?.length ?: "DEFAUL VALUE HERE") // if value is null, then use the default value
}

