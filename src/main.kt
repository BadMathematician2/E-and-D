import java.io.File
import kotlin.math.pow

fun main(){
    println("Write number of string")
    val n = readLine()!!.toInt()
    println("Write number of potion")
    val k = readLine()!!.toInt()
    val f = File("1.txt").bufferedReader()
    val st = f.readLines()
    if (n>16) {
        val s = st[15]
        val one = s.substring(0, s.length / 2)
        val zero = s.substring(s.length / 2)
        val m = (k / 2.0.pow(14)).toInt()
        val l = k - m * 2.0.pow(14).toInt()
        if (st[n - 15][m] == '1')
            println(one[l - 1])
        else
            println(zero[l - 1])
    }
    else println(st[n-1][k-1])
    f.close()
}
