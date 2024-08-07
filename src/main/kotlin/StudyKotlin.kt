import java.util.*

// 코틀린 놀이터 : https://play.kotlinlang.org/

//@Suppress("DIVISION_BY_ZERO")
fun main() {
//    val a = readLine()!!.toInt()
//    val b: Int = readLine()!!.toInt()
//    println(a + b)

//    println(Float.MIN_VALUE)   // 1.4E-45
//    println(Double.MAX_VALUE)   // 1.797693134862315710308
//    println(Double.POSITIVE_INFINITY)   // Infinity
//    println(1.0 / Double.NEGATIVE_INFINITY)   // - 0.0
//    println(2 - Double.POSITIVE_INFINITY)   // -Infinity
//    println(3 * Float.NaN)   // NaN
//    val hello = "Hello, world!"
//    val name = readLine()
//    println("Hello".isEmpty())
//    println("".isEmpty())
//    println("Hello".substring(2))
//    println("Hello".substring(1,3))
//    println("Hello".startsWith("Hel"))
//    println("Hello".endsWith("lo"))
//    println("abcabc".indexOf('b'))
//    println("abcabc".indexOf("ca"))
//    println("abcabc".indexOf("cd"))
//    println("abcabc".indexOf('b', 2))
//    println("abcabc".indexOf("ab", 2))
//    val message = """ Hello, $name,
//        Today is${Date() } """.trimIndent()

//    println("Hello, ${name}!\nToday is ${Date()}")

    val squares = arrayOf( 1, 4, 9, 16 )
    squares.size 	 // 4
    squares.lastIndex // 3
    squares[3]       // 16
    squares[1]       // 4

    val numbers = squares // numbers에 squares 배열을 대입하며 [0, 4, 9, 16]
    numbers[0] = 1000     // 바뀐 데이터가 squares와 numbers에 공유됨 [1000, 4, 9, 16]
    println(numbers.contentToString())
    println(squares[0])   // 1000

}