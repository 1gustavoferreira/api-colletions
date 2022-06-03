package tests

fun main() {
    val separa = "------------------------"
    val gustavo = Funcionario("joao", 3000.0, "CLT")
    val ferreira = Funcionario("ferreira", 5000.0,"PJ")
    val aline = Funcionario("Aline", 2000.0, "CLT")


    val funcionarios1 = setOf(gustavo,ferreira)
    val funcionarios2 = setOf(aline)

    //.union PARA FAZER A UNIÃO DOS FUNCIONARIOS
    val resultUniao = funcionarios1.union(funcionarios2)
    resultUniao.forEach{ println(it) }

    println(separa)

    //.subtract PARA FAZER A SUBTRAÇÃO DOS FUNCIONARIOS ALINE FOI DEMITIDA
    val funcionarios3 = setOf(gustavo,ferreira,aline)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println(separa)

    //.intersect PARA FAZER A COMPARAÇÃO DOS FUNCIONARIOS = ALINE FOI ADMITIDA NOVAMENTE
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{ println(it)}
}