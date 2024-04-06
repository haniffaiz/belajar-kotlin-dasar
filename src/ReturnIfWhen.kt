fun main() {

    fun sayHello(name:String=""):String{
        return when(name){
            "" -> "Hello Bro!"
            else -> "Hello $name"
        }

//        return if(name == ""){ //return if
//            "Hello Bro !"
//        }else{
//            "Hello $name"
//        }
    }

    println(sayHello("Hanif"))

}