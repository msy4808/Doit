fun main() {
    var n = readLine()!!.toInt()
    var max = 0
    var sum = 0
    for (i in 1  .. n) {
        val num = readLine()!!.toInt()
        if (max <= num) {
            max = num
        }
        sum += num
    }
    println(sum * 100.0 / max / n)
}