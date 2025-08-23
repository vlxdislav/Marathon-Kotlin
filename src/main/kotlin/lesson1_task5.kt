fun main() {

    val TOTAL_SECONDS : Int = 6480  //всего секунд
    val SECONDS_IN_MINUTE = 60 //внес константу

    val hours = TOTAL_SECONDS / (60*60)
    val secondsAfterHours = TOTAL_SECONDS % (60*60) //сколько секунд после часов
    val minutes = secondsAfterHours / SECONDS_IN_MINUTE //60 заменил на константу
    val seconds = secondsAfterHours % SECONDS_IN_MINUTE //так же

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}
