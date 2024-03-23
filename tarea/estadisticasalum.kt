// Se hara un programa para Preguntar cuántos alumnos hay en un salon. Preguntar la edad de cada uno de ellos. Mostrar la edad máxima y mínima. Imprimir lo siguiente
//Elias Manchego
// 21/02/24
// modificado 22/02/24

// se importara las librerias para obtener los maximos y minimos
// importre libreria scanner ya que es una erramienta util para leer entradas de usuario
import java.util.*

// se crea la funcion principal main
// se comienza con el objeto scanner para leer la entrada del usuario
// system es una clase del paquete java.lang para acceder a flujos de entrada y la palabra reservada in
fun main(){
    val scanner = Scanner(System.`in`)
    // se imprimira el mesnaje para pedirle al usuario que agrege los datos
    println("Ingresa la catidad de alumnos:")
    //nextin para convertir los numeros a enteros
    val cantidaddealum = scanner.nextInt()

    // inicializamos el maximo y minimo por medio de la decaracion de variables var

    var maximo = Int.MIN_VALUE
    var minimo = Int.MAX_VALUE
    // voy a hacer una iteracion para obtener la edad e ir actualizando las edades por medio de for

    for(p in 1..cantidaddealum){
        println("Ingresa la edad del alumno $p:")
        // variable edad de los alumnos
        val edad = scanner.nextInt()
        // actualizare la edad maxima si la edad actual es mayor a esta
        //por medio de un if
        if ( edad > maximo){
            maximo = edad
        }
        // hare lo mismo pero con minima
        if (edad < minimo){
            minimo = edad
        }
    }
    //imprimire las edades tanto maximas como minimas
    println("=== Edades ===")
    println("Maximo = $maximo")
    println("Minimo = $minimo")
    // Imprimir todo lo ingresado por el usuario
    println("Todo = ")
    // usare un for para crear un bucle
    // until para definir rangos
    // este rango ira desde 1 y no 0
    for(c in 1 until cantidaddealum){
        print("$c, ")
    }
    // finalmente imprimo la ultima edad sin la coma extra al final
    println(cantidaddealum)
}
