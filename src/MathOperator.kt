fun main() {

    //kalo butuh pembagian tipe data double pake .0 biar presisi
    var result = 10.0 / 3.0
    println(result)

    var result2 = 10 + 10 / 2
    println(result2)

    // augmented assignments
    var total: Int = 0

    val barang1 = 100
    total += barang1
    val barang2 = 200
    total += barang2
    val barang3 = 300
    total += barang3
    println(total)

    // unary operator
    total++ // total = total + 1
    total++ // total = total + 1
    total++ // total = total + 1
    println(total)

    val suhu = -5
    println(suhu) // negative

    val sehat = true
    println(!sehat)
}