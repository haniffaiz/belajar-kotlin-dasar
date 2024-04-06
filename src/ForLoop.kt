fun main() {
    var array = arrayOf("Hanif", "Faiz", "Hidayat","Haikal","Aziz")

    var total = 0
    for (name in array){
        //tidak bisa mengubah
        println(name)
        total++
    }
    println("Total perulangan = $total")

    //for range
    //kombinasi array dan range
    val ukuranArray = array.size - 1
    for (i in 0..ukuranArray){
        println("Index $i = ${array.get(i)}")
    }
}