package tests

fun main() {
    val s = "------------------------"
    val gustavo = Funcionario("gustavo", 3000.0, "CLT")
    val ferreira = Funcionario("ferreira", 5000.0,"PJ")
    val aline = Funcionario("Aline", 2000.0, "CLT")


    //O método mutableListOf() retorna uma instância de MutableList Interface,
    // e pega o array de um determinado tipo ou elementos mistos (depende do,
    // tipo de instância MutableList) ou pode ser nulo também
    val funcionarios = mutableListOf(gustavo, aline)
    funcionarios.forEach { println(it) }


    //ADICIONA O FUNCIONARIO FERREIRA
    println(s)
    funcionarios.add(ferreira)
    funcionarios.forEach { println(it) }

    //REMOVE O FUNCIONARIO GUSTAVO
    println(s)
    funcionarios.remove(gustavo)
    funcionarios.forEach { println(it) }


    println("---------SET---------")
    val funcionarioSet = mutableSetOf(gustavo)
    funcionarioSet.forEach { println(it) }


    funcionarioSet.add(ferreira)
    funcionarioSet.add(aline)
    funcionarioSet.forEach { println(it) }

    funcionarioSet.remove(gustavo)
    funcionarioSet.forEach { println(it) }
}