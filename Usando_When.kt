//Usando When
//Teste o código em: https://play.kotlinlang.org/

//Material de Estudos criado por Isaias Bueno
//e-mail:izaias.bueno@gmail.com

//Github: https://github.com/IsaiasBueno
//Linkedin: https://www.linkedin.com/in/isaias-bueno-34641b34/

fun main(args: Array<String>) {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

class MyClass() {
}