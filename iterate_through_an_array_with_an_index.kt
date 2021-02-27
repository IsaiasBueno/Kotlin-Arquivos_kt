//iterate through an array with an index
//Teste o código em: https://play.kotlinlang.org/

//Material de Estudos criado por Isaias Bueno
//e-mail:izaias.bueno@gmail.com

//Github: https://github.com/IsaiasBueno
//Linkedin: https://www.linkedin.com/in/isaias-bueno-34641b34/

fun main(args: Array<String>) {

    var language = arrayOf("Ruby", "Koltin", "Python", "Java")

    for (item in language.indices) {

        // printing array elements having even index only
        if (item%2 == 0)
            println(language[item])
    }
}