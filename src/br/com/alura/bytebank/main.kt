package br.com.alura.bytebank

fun main() {
//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()

    val minhaFuncaoLambda = {
        println("Executa como lambda")
    }
    minhaFuncaoLambda()

    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como anonima")
    }
    minhaFuncaoLambda()
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasses: () -> Unit = Teste()
    println(minhaFuncaoClasses())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
}

fun teste() {
    println("Executa teste")
}

class Teste: () -> Unit {
    override fun invoke() {
        println("Executando invoke do Teste")
    }

}