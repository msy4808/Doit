import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var stringTokenizer = StringTokenizer(bufferedReader.readLine())
    val suNo = stringTokenizer.nextToken().toInt()
    val quizNo = stringTokenizer.nextToken().toInt()
    val S = LongArray(suNo + 1)
    stringTokenizer = StringTokenizer(bufferedReader.readLine())
    for (i in 1..suNo) {
        S[i] = S[i - 1] + stringTokenizer.nextToken().toInt()
    }
    for (q in 0 until quizNo) {
        stringTokenizer = StringTokenizer(bufferedReader.readLine())
        val i = stringTokenizer.nextToken().toInt()
        val j = stringTokenizer.nextToken().toInt()
        println(S[j] - S[i - 1])
    }
}