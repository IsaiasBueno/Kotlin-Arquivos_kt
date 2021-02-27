//Different Ways to Iterate Through a Range

//Teste o código em: https://play.kotlinlang.org/

//Material de Estudos criado por Isaias Bueno
//e-mail:izaias.bueno@gmail.com

//Github: https://github.com/IsaiasBueno
//Linkedin: https://www.linkedin.com/in/isaias-bueno-34641b34/

fun main(args: Array<String>) {

    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)

    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing

    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)

    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)

    println()

    print("for (i in 4 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)
}