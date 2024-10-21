import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var stringTokenizer = StringTokenizer(bufferedReader.readLine())
    //처음 입력한 수를 분리해서 배열의 인덱스 수 와 연산할 문제 갯수로 저장
    val suNo = stringTokenizer.nextToken().toInt()
    val quizNo = stringTokenizer.nextToken().toInt()
    val S = LongArray(suNo + 1)
    stringTokenizer = StringTokenizer(bufferedReader.readLine())
    //for문으로 배열안에 들어갈 값을 공백으로 구분하여 넣어줌
    for (i in 1..suNo) {
        S[i] = S[i - 1] + stringTokenizer.nextToken().toInt()
    }
    //수식을 입력하고 엔터를 누르면 결과를 보여줌
    for (q in 0 until quizNo) {
        stringTokenizer = StringTokenizer(bufferedReader.readLine())
        val i = stringTokenizer.nextToken().toInt()
        val j = stringTokenizer.nextToken().toInt()
        println(S[j] - S[i - 1])
    }
}