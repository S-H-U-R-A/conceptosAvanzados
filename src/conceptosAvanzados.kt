import kotlin.math.sqrt

fun main(args: Array<String>) {

    //Un cambio Nuevo desde la nueva rama
    //Para un pull Request

    //Array Strings
    val countries: Array<String>
            = arrayOf("India", "Mexico", "Colombia");

    //Array Enteros
    val numbers: IntArray = intArrayOf(1,2,2,4,5,6,7,8)
    var sum = 0
    for (num:Int in numbers){
        sum += num;
    }

    val average = sum / numbers.size

    //println("El promedio es $average")

    //transformar tipos de datos objeto a primitivos
    var array1 = arrayOf(5,6,7,8,9)
    var intPrimitive: IntArray = array1.toIntArray()

    val suma = array1.average()

    //Se pueden añadir mas elementos
    //array1 = array1.plus(7)

    array1 = array1.reversedArray()

    for (i in array1){
        //println("Arreglo en desorden: $i")
    }

    val a = 1
    val b = 2

    println("la suma es $a + $b")

    println("La suma con expresiones es: ${ a + b }")

    //Funciones

    println("Raiz cuadrada de ${ Math.sqrt(4.0)}")

    fun evaluate(character: Char = '=', number: Int = 2): String{
        return "${number} es ${character}";
    }

    //Lambdas

    val saludo = { println("Hola lambda")}
    saludo()

    val sumar = { a:Int, b:Int -> a + b}
    val result = sumar(2,3);
    println(result)

    val calculateNumber = {
            n:Int ->
                when(n){
                    in 1..3 -> {
                        println("El numero $n esta en el rango de 1 al 3")
                    }
                    in 4..9 -> {
                        println("El numero $n esta en el rango del 4 al 9")
                    }
                    else -> {
                        println("El numero no esta en ningun rango")
                    }
                }

    }

    println(calculateNumber(6))

}