
// problema de evaluacion de empleados y cantidad de dinero conseguida segun el nivel
//Elias Manchego
// 21/02/24
// modificado 21/02/24


// Lo primero que se hace es tener que crear la funcion que calcule la cantidad que recibe
// se usara double para que los calculos sean mejores
// las final de la funcion de devuelve double por la division entre 10
fun calculardinerito(salario: Double, puntuacion: Int): Double{
    // se multiplicara el salario mensual por la division de la puntuacion
    // se usa el double para convertir los datos de salario a decimales para ser mas precisos
    return salario * (puntuacion.toDouble() / 10)
}

// se crea una funcion para saber el nivel de rendimiento de los empleadxs
// se usa el string para que se devuelvan los datos ya que string es una secuencia de datos
fun obtenerelnivel( puntuacion: Int): String {
    // ahora usare el when que es para evaluar multiples deciciones en kotlin lo usare en ves del if o else
    return when {
        // ahora vamos a evaluar los 3 casos del problema y uno mas que es falso algun dato que no exista
        // caso de 0 a 3
        // se usara el && que es como un y o and en ingles que devolvera true si se cumple
        // se usa el -> para saber si esta condicion es verdadera y mostrar el mensaje
        puntuacion >= 0 && puntuacion <= 3 -> "Inaceptable"
        // se repetira lo mismo para los otros 2 casos
        puntuacion >= 4 && puntuacion <= 6 -> "Aceptable"
        puntuacion >= 7 && puntuacion <= 10 -> "Meritorio"
        // ahora usaremos el fuera de rango por un valor que no existe
        // se usara el else para los casos que no esten dentro de los parametro
        else -> "fuera de rango"


    }
}

fun main(){
    // salario con la variable salario
    //se usara decimales
    val salario = 2000.80
    // ahora la puntuacion
    val puntuacion = 5
    // obtenemos el rendimiento del empleado
    val nivel = obtenerelnivel(puntuacion)
    // se calcula la cantidad de dinero recibida
    val dinero = calculardinerito(salario, puntuacion)
    // por ultimo imprimimos el resultado de lo que escribimos anteriormente incrustando el $
    println("el rendimiento es: $nivel \nLa cantidad de dinero es: S/$dinero" )
}
