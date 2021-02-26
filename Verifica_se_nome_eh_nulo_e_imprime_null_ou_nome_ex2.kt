//Verifica se nome é nulo e imprime null ou nome (Exemplo 2)
//Teste o código em: https://play.kotlinlang.org/

//Material de Estudos criado por Isaias Bueno
//e-mail:izaias.bueno@gmail.com

//Github: https://github.com/IsaiasBueno
//Linkedin:https://www.linkedin.com/in/isaias-bueno-34641b34/

fun main (){
    val nome: String? = null

    nome?.let {
        println(null)
    } ?: println(nome)
}