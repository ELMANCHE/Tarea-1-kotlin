// Escribe un programa que genere un número aleatorio entre 1 y
// 30, luego pida al usuario que adivine el número. Proporciona pistas indicando si el
// número a adivinar es mayor o menor que el número ingresado por el usuario.
// Continúa solicitando intentos hasta que el usuario adivine correctamente el
// número.Tienes 5 intentos, si se acaba debe imprimir game over. De lo contrario
// mostrar un mensaje de felicitación por ganar el juego
//Elias Manchego
// 21/02/24
// modificado 22/02/24

// como en el problem de piedra papel y tijera importare random

import kotlin.random.Random

fun main(){
    // voy a generar numeros del 1 al 31 como lo pide el problema de manera aleatoria gracias al random
    val numaadivinar = Random.nextInt(1, 31)
    // intentos disponibles
    var intentos = 5
    println(" Bienvenido al juego de adivinar, que comiencen los juegos del hambre")
    // creare un bucle que se ejecutara mientras quedan los intentos
    while (intentos > 0){
        // se solicita al usuario que ingrese el numero
        print("Introduce tu numero(Te quedan  $intentos) intentos:")
        // se lee la entrada y se convierte en entero
        val usuario = readLine()?.toIntOrNull()
        // para comprobar si el numero ingresado es valido
        if (usuario == null || usuario !in 1..30){
            // se imprimira el mensaje si el nuemro no es valido
            println("Por favor, escribe un numero valido")
            // volvera al inicio para pedir de nuevo el numero
            continue
        }
        // se comprovara si se adivino el numero
        if (usuario == numaadivinar){
            println("Adivinaste!")
            // se finaliza la ejecucion
            return
            // le dare pistas al usuarios
        } else if (usuario < numaadivinar){
            println("El numero que tienes que adivinar es mayor")
        } else {
            println(" El numero que tienes que adivinar es menor")
        }
        // para reducir el numero de intentos
        intentos--

    }
   // imprimir por si el usuario perdio
    println(" Se termino, El numero que tenias que adivinar era: $numaadivinar ")
}