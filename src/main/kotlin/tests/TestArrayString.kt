package tests

fun main() {
    val nomes = Array(3) { "" }
    nomes [0] = "Maria"
    nomes [1] = "Zaza"
    nomes [2] = "Aline"

    for(nome in nomes ){
        println(nome)
    }
    println("--------------------")
    nomes.sort()
    for(nome in nomes ){
        println(nome)
    }
    println("--------------------")
    //Jeito mais facil para se usar
    val nomes2 = arrayOf("Gustavo", "Aline", "Zaza")
    nomes2.sort()
    nomes2.forEach { println(it) }

    //.sort() ORGANIZA EM ORDEM

}