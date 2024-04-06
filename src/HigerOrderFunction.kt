fun main() {

    fun hello(name: String, transformer: (String)->String):String{
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    //bisa seperti ini
    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(hello("Hanif", lambdaUpper))

    //dan bisa seperti ini
    println(hello("Hanif", {value: String -> value.toLowerCase()}))

    //trailing lambda
    val result = hello("Hanif") {value: String ->
        value.toLowerCase()
    }

}