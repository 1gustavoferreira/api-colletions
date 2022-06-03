package tests

fun main(){
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach {
        println(it)
    }
    println("222222222222222222222")
    values.sort()
    values.forEach {
        println(it)
    }
}