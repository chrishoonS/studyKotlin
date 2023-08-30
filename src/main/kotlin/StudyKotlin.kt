// 코틀린 놀이터 : https://play.kotlinlang.org/

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

    val x = 1;
    val y = 0;

    println(x or y)                         // 1
    println(( x == 0 ) || ( y == 0 ))       // false
    println((x == 1) and ( y != 1 ))        // false
    println(x and y)                        // 1
    println(x xor y)                        // 0
    println((x == 1) xor ( y != 1 ))        // true
    println( x == 1 || (y / (x - 1)) != 1)  // true
    println( x != 1 && (y / (x - 1)) != 1)  // false
}