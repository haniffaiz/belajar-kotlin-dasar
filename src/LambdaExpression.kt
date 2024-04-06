fun toUpper(value: String):String = value.toUpperCase()

fun main() {

    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        //tidak perlu return
        //baris terakhir akan dikembalikan
        //jika 1 parameter menggunakan it.
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("hanif", "faiz")
    println(result)

    //jika 1 parameter menggunakan it
    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello("Hanif"))

    //method reference
    val lambdaName: (String) -> String = ::toUpper
    println(lambdaName("hanif faiz"))

}