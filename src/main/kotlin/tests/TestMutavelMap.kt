package tests

fun main() {
    val s = "------------------------"
    val gustavo = Funcionario("gustavo", 3000.0, "CLT")
    val ferreira = Funcionario("ferreira", 5000.0,"PJ")
    val aline = Funcionario("Aline", 2000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(gustavo.nome, gustavo)
    repositorio.create(ferreira.nome, ferreira)
    repositorio.create(aline.nome, aline)

    println(repositorio.findById(gustavo.nome))

    println(s)
    repositorio.findAll().forEach { println(it) }

    println(s)
    println(repositorio.remove(gustavo.nome))
    repositorio.findAll().forEach { println(it) }

}