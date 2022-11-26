import java.util.*
import kotlin.math.pow

fun main() {
    val read = Scanner(System.`in`)

    println("Enter n:")
    var decimalN = read.nextInt()

    var binaryN = 0
    var count = 0
    while (decimalN != 0) {
        val rem = decimalN % 2
        val c = 10.toDouble().pow(count)
        binaryN += (rem * c).toInt()

        decimalN /= 2
        count++
    }
    println("Equivalent Binary: $binaryN")
}
