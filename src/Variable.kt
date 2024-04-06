const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    //val immutable
    //var mutable
    val firstName = "Hanif"
    val age = 26

    println(firstName)
    println(age)

    var name: String? = null
    name = "Hanif"
    println(name)
    println(name?.length)

    println("$APPLICATION : $VERSION")
}