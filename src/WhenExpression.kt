fun main() {
    var nilai = "A"

    when (nilai) {
        "A" -> {
            println("Amazing")
        }

        "B" -> {
            println("Good")
        }

        "C" -> {
            println("Not Bad")
        }

        "D" -> {
            println("Bad")
        }

        else -> {
            println("Try Again")
        }
    }

    // grouping
    // multiple
    when(nilai){
        "A","B","C" ->{
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Maaf, Anda Lulus")
        }
    }

    //when expression in
    val nilaiLulus: Array<String> = arrayOf("A","B","C")
    when(nilai){
        in nilaiLulus -> println("SELAMAT ANDA LULUS")
        !in nilaiLulus -> println("MAAF, TIDAK LULUS")
    }

    //when expression is
    val name = "hanif"
    when(name){
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    //when tanda variable
    val examValue = 90
    when{
        examValue > 90 -> println("Amazing")
        examValue > 80 -> println("Good Job")
        examValue > 60 -> println("Not Bad")
        else -> println("Ngulang")
    }
}