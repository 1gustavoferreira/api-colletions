package tests

fun main() {
    val wages = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (wage in wages) {
        println(wage)
    }
    println("----------------------")

    println("Maior wage: ${wages.maxOrNull()}") //MOSTRA O MAIOR SALARIO
    println("Menor wage: ${wages.minOrNull()}") //MOSTRA O  MENOR SALARIO
    println("Maior wage: ${wages.average()}")//MEDIA SALARIAL
//  SALARIO MAIOR QUE 2500
    val wagesFilter = wages.filter { it > 2500.0 }
    println("----------------------")
    wagesFilter.forEach {
        println(it)
    }
    println("----------------------")
    //CONTA QUANTOS SALARIOS TEM DE 2K A 5K UTILIZAMOS O RANGE
    println(wages.count{it in 2000.0..5000.0})

    println("----------------------")
    //BUSCA O SALARIO PEDIDO
    println(wages.find{it == 2250.0})
    //BUSCA O SALARIO PEDIDO MAS COMO NAO TEM RETORNA NULL
    println(wages.find{it == 500.0})

    println("----------------------")
    //BUSCA O SALARIO PEDIDO,MAS RETORNA TRUE OU FALSE
    println(wages.any{it == 1000.0})//TRUE
    println(wages.any{it == 500.0})//FALSE
}

