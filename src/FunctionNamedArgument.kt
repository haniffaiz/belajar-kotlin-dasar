
fun fullName(
    firstName:String,
    middleName:String,
    lastName:String,
){
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName(
        lastName = "Hidayat",
        middleName = "Faiz",
        firstName = "Hanif",
    )
}