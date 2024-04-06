
fun sayHello(firstName:String, lastName:String?){
    //by default param itu val
    if (lastName == null){
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }
}

fun main() {
    sayHello("Hanif", "Faiz")
    sayHello("Faiz", null)
}