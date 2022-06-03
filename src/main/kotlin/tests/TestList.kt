package tests

fun main() {
    val gustavo = Funcionario("joao", 3000.0, "CLT")
    val ferreira = Funcionario("ferreira", 5000.0,"PJ")
    val aline = Funcionario("Aline", 2000.0, "CLT")

    val funcionarios = listOf(gustavo, ferreira, aline)

    //O it AGORA VIRA O FUNCIONARIO
    funcionarios.forEach {
        println(it)
    }
    //SEPARA OS TIPOS DE CONTRATAÇÃO
    println("----------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach{ println(it)}
    println("groupby")

    println("----------------------")
    println(funcionarios.find { it.nome == "Aline" })

    //ORDENOU OS NOMES EM ORDEM
    println("----------------------")
    funcionarios.sortedBy { it.nome }.forEach {
        println(it)
    }
    println("----------------------")

}

