fun main() {

    val nilaiUjuan = 80
    val nilaiAbsen = 80
    val nilaiEkstra = 80

    val apakahLulusUjian = nilaiUjuan > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusEkstra = nilaiEkstra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusEkstra
    //breakdown
//    val apakahLulus = (apakahLulusUjian && apakahLulusAbsen) && apakahLulusEkstra
//    val apakahLulus = ((apakahLulusUjian && apakahLulusAbsen) && apakahLulusEkstra)
    println(apakahLulus)

}