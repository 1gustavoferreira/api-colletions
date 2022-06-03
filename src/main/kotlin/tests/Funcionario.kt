package tests

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    //PARA FAZER O RETORNO
    override fun toString(): String =
        """
            NOME: $nome
            salario: $salario
        """.trimIndent()
}