fun main() {
    var firstName: String = "Hanif"
    var lastName: String = "Faiz"

    var address: String = """
        |Jalan belum jadi, RT 01 RW 01
        |Kabupaten Cilacap
        |Jawa Tengah
        |Indonesia
    """.trimMargin();

    println(firstName)
    println(lastName)
    println(address)

    var fullName: String = "$firstName $lastName";
    println(fullName)

    var description: String = "$fullName length = ${fullName.length}"
    println(description)
}