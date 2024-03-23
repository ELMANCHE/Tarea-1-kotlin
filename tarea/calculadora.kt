//  Realizar una calculadora básica suma, resta,
// multiplicación, división. Debe imprimir un menú con las opciones incluyendo una
// opción salir. Validar que la opción esté disponible. Imprimir resultados.
//Elias Manchego
// 21/02/24
// modificado 22/02/24

//usare de nuevo la libreria scanner, la que use en el anterior problema ya que me ayudara a obtener la entrada del usuario
// comenzare con la funcion main, para aplicar una variable y realizar el mismo proceso que hice en el anterior problema
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    // creare una variable de almacenamiento
    var opcion: Int
    // comenzamos con el ciclo principal de la calculadora
    // usare el do-while para que el menu se muestre por lo menos una vez y creare el menu
    do{
        // menu
        println(" ==== Menú ====")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")
        println("5. Salir.")
        println(" Elige una option")
        // el programa lee la opcion del usuario
        opcion = scanner.nextInt()

        // usare ahora when para aber que accion tomar en cuanto a opcion
        when (opcion){
            1 -> sumar()
            2 -> restar()
            3 -> multiplicar()
            4 -> dividir()
            5 -> println(" nos vemos luego")
            6 -> println("No existe esa opcion, por favor ingresa una del 1 al 5")
        }
        // se repetira el ciclo para que el usuario pueda volver a elegir
    } while (opcion != 5 )
}

// creare la funcion para poder sumar
fun sumar(){
    // traemos la variable sacnner crea un objeto para leer la entrada del usuario
    // se usara next double para leer el valor ingresado y devolverlo como double
    val scanner = Scanner(System.`in`)
    print("Ingresa el primer numero :")
    val num1 = scanner.nextDouble()
    print("Ingresa el segundo numero: ")
    val num2 = scanner.nextDouble()
    val resultado = num1 + num2
    println("El resultado de la suma es: $resultado")
}
// se usara el mismo proceso de la suma para las demas operaciones

// Resta
fun restar(){
    // traemos la variable sacnner crea un objeto para leer la entrada del usuario
    // se usara next double para leer el valor ingresado y devolverlo como double
    val scanner = Scanner(System.`in`)
    print("Ingresa el primer numero :")
    val num1 = scanner.nextDouble()
    print("Ingresa el segundo numero: ")
    val num2 = scanner.nextDouble()
    val resultado = num1 - num2
    println("El resultado de la resta es: $resultado")
}

// multiplicacion
fun multiplicar(){
    // traemos la variable sacnner crea un objeto para leer la entrada del usuario
    // se usara next double para leer el valor ingresado y devolverlo como double
    val scanner = Scanner(System.`in`)
    print("Ingresa el primer numero :")
    val num1 = scanner.nextDouble()
    print("Ingresa el segundo numero: ")
    val num2 = scanner.nextDouble()
    val resultado = num1 * num2
    println("El resultado de la multiplicacion es: $resultado")
}

// division
fun dividir(){
    // traemos la variable sacnner crea un objeto para leer la entrada del usuario
    // se usara next double para leer el valor ingresado y devolverlo como double
    val scanner = Scanner(System.`in`)
    print("Ingresa el dividendo :")
    val dividendo = scanner.nextDouble()
    print("Ingresa el divisor: ")
    val divisor = scanner.nextDouble()
    // con la ayuda de la desion de if sabremos si el divisor no es diferente de 0
    if (divisor != 0.0){
        val resultado = dividendo / divisor
        println(" El resultado de la division es: $resultado")
    } else {
        println(" No se puede dividir entre 0 ")
    }
}