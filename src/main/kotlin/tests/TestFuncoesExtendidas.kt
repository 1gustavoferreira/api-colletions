package tests

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
        )

    println("soma dos salarios R$${salarios.somatoria()}")

    println("media dos salarios R$${salarios.media()}")

}