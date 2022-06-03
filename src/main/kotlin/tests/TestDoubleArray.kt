package tests

fun main() {
    val salarios = DoubleArray(3)
    salarios [0] = 1000.0
    salarios [1] = 3000.0
    salarios [2] = 500.0

    salarios.forEach { println(it) }
    println("++++++++++++++++++++++++")
    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }
    println("++++++++++++++++++++++++")
    val wage = doubleArrayOf(500.0,1250.0,5000.0)
    wage.sort()
    wage.forEach { println(it) }
}