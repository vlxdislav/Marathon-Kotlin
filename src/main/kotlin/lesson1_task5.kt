fun main() {

    val totalSeconds : Int = 6480

    val hours = totalSeconds / 3600
    val secondsAfterHours = totalSeconds % 3600
    val minutes = secondsAfterHours / 60
    val seconds = secondsAfterHours % 60

    val formattedHours = String.format("%02d", hours)
    val formattedMinutes = String.format("%02d", minutes)
    val formattedSeconds = String.format("%02d", seconds)

    println("$formattedHours:$formattedMinutes:$formattedSeconds")

}