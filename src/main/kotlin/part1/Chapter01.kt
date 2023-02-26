package part1

fun <T> identify(x: T): T = x

fun add(a: Int, b: Int) = a + b

fun main() {
    println(identify(0) == 0)
    println(add(0, 10) == 10)
}