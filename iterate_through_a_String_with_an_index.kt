//iterate through a String with an index
//Teste o código em: https://play.kotlinlang.org/

//Material de Estudos criado por Isaias Bueno
//e-mail:izaias.bueno@gmail.com

//Github: https://github.com/IsaiasBueno
//Linkedin: https://www.linkedin.com/in/isaias-bueno-34641b34/

fun main(args: Array<String>) {

    var text= "Kotlin"

    for (item in text.indices) {
        println(text[item])
    }
}