fun String.hello():String = "Hello $this"
fun String.printHello():Unit = println("Hello $this")

fun main() {
    val name = "Hanif"

    println(name.hello())

    name.printHello()

    "Hidayat".printHello()

}