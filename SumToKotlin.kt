fun main() {
    val number = readLine()!!.toInt()
    val str = readLine()!!
    val arr = str.toCharArray().map { it - '0'}
    var sum = 0
    arr.forEach { i ->
        sum += i
    }
    println(sum)
}