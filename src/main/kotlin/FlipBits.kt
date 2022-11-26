import java.awt.BufferCapabilities.FlipContents

fun flippingBits(n: Long): Long {
    // Flip long number
    var a = n xor 4294967295
    //Convert to bit
    //val convertBit = a.toULong()
    // print long
   // return convertBit.toLong()
return a
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val n = readLine()!!.trim().toLong()
        val result = flippingBits(n)
        println(result)
    }
}
