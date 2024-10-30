import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()
    val A = Array(N + 1) { IntArray(N + 1) }
    for (i in 1..N) {
        st = StringTokenizer(br.readLine())
        for (j in 1..N) {
            A[i][j] = st.nextToken().toInt()
        }
    }
    val D = Array(N + 1) { IntArray(N + 1) }
    for (i in 1..N) {
        for (j in 1..N) {
            //부분 합 구하기
            D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j]
        }
    }
    for (i in 0 until M) {
        st = StringTokenizer(br.readLine())
        val x1 = st.nextToken().toInt()
        val y1 = st.nextToken().toInt()
        val x2 = st.nextToken().toInt()
        val y2 = st.nextToken().toInt()
        //  부분 합 배열을 이용한 질의 답변하기
        val result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1]
        println(result)
    }
}