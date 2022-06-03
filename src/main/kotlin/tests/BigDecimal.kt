package tests

import java.math.BigDecimal

    //ESTOU USANDO ESSA FUNÇÃO CHAMADA SOMATORIA E BIG DECIMAL, VAI REDUZIR A SOMATORIA DE TUDO QUE TA NO VALOR
    fun Array<BigDecimal>.somatoria() = this.reduce{
        acc, valor -> acc + valor
    }
    //SE O ARRAY TIVER VAZIO A MEDIA É ZERO SE NAO ELE CHAMA A SOMA DE TODOS OS ELEMENTOS E VE A MEDIA
    fun Array<BigDecimal>.media() =
        if (this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()

