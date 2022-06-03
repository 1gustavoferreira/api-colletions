package tests
//MAPAS IMUTAVEIS E MUTAVEIS
fun main() {
    val pair: Pair<String, Double> = Pair("Gustavo", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach{(k, v) -> println("Chave: $k = valor : $v")}

    //to = PARA : NÃO FOI PRECISO DECLARAR STRING E DOUBLE
    val map2 = mapOf(
        "ALINE" to  2500.0, //1 ELEMENTO
        "FERREIRA" to 1000.0 //OUTRO ELEMENTO
    )
    map2.forEach{(k, v) -> println("Chave: $k = valor : $v")}
}