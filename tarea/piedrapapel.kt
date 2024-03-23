// programna de piedra papel y tijera importando la libreria randon
//Elias Manchego
// 21/02/24
// modificado 21/02/24


// lo primero que haremos sera importar la biblioteca random ya que el problema pide que sea aleatorio asi generamos valores aleatorios
import kotlin.random.Random

// vamos a crear una funcion main que es la de punto de entrada principal
fun main(){
    // lo primero que haremos es imprimir un mensaje de bienvenida
    println("Bienvenido a los juegos del piedra, papel o tijera, que la suerte este siempre de tu lado")
    // usaremos la variable opciones , usamos la clave val ya que es una de solo lectura
    // se usara un array de cadena que contendra las opciones de piedra,papel o tijera
    val opciones = arrayOf("Piedra","Papel", "Tijera")
    // ahora se creara la variable para que la eleccion aleatoria de la computadora
    // opciones es el array que contiene las opciones y el size para devolver el numero de los elementos
    // solo devuelve 3 poruqe las opciones son 3
    // luego el nexintcombinado con el opciones size generara 3 numeros aleatorios por las tres opciones 0 1 2
    val opcionCompu = opciones[Random.nextInt(opciones.size)]
    // imprimire mas mensajes
    println(" La computadora ha elegido muajajaj")
    println("Cual es tu jugada?: Piedra, Papel o Tijera ?")
    // se usara el readLine porque es para leer entrada de usuarios
    val jugador = readLine()
    // por medio de if comprobare si la entrada del uduario es valida
    // !in se usara este operador para verificar si un valor no existe, estas deben estar presentes en la variable opciones
    if (jugador !in opciones){
        // imprimire si la opcion no es valida
        println(" La opcion no existe cariño, tienes que elejir entre: Piedra, Papel o tijera")
        //se termina la opcion
        return
    }

    // usare el $ para insertar valores de variables en el print
    println("Tu jugada: $jugador")
    println("La jugada de la computadora: $opcionCompu")

    // se tiene que saber quien ha ganado
    // se hara por medio de if, else y else if usando && que es como un y o and en ingles
    if (jugador == opcionCompu){
        //para saber si se empato
        println(" Empataste amor")
        // el || es o o or
    } else if ((jugador == "Piedra" && opcionCompu == "Tijera") ||
            (jugador == "Papel" && opcionCompu == "Piedra")||
            (jugador == "Tijera" && opcionCompu == "Papel")){
                println(" Ganaste amor, Felicidades")
} else{
    println(" perdiste, no brillaste ")
}
}
