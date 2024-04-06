fun main() {
    // val masih bisa dirubah itemnya
    // Array tidak bisa null. karena tipe nya
    // boleh null tambah ? di dalam tipenya
    // ukuran array tidak dinamis
    val names: Array<String> = arrayOf("Hanif","Faiz","Hidayat")
    names[0] = "Hanz"
    println(names[0])

    val nilai: Array<Int> = arrayOf(10,9,8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val members: Array<String?> = arrayOfNulls(5)
    members[0]="Hanif"
    members[1]="Hanif"
    members[2]="Hanif"
    members[3]="Hanif"
    members[4]="Hanif"
    println(members[0])
    println(members.size)
}