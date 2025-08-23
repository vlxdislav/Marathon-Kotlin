fun main() {
    val TOTAL_SECONDS: Int = 6480

    val SECONDS_IN_MINUTE = 60
    val SECONDS_IN_HOUR = SECONDS_IN_MINUTE * SECONDS_IN_MINUTE

    val hours = TOTAL_SECONDS / SECONDS_IN_HOUR
    val secondsAfterHours = TOTAL_SECONDS % SECONDS_IN_HOUR
    val minutes = secondsAfterHours / SECONDS_IN_MINUTE
    val seconds = secondsAfterHours % SECONDS_IN_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}