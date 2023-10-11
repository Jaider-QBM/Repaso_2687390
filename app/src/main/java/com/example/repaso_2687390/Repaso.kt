package com.example.repaso_2687390

fun saludo(nombre:String){
    println("Bienvenido a mi repaso $nombre")
}

fun sumar(){
    println("Ingrese numero 1:")
    val numero1 = readln().toDouble()
    println("Ingrese numero 2:")
    val numero2 = readln().toDouble()

    var resultado = numero1 + numero2
    println("El resultado de la suma = $resultado")
    restar(numero1,numero2)
    val resultmulti = multiplicar(numero1,numero2)
    println("el menor es = ${menor(numero1, numero2)}")
}

fun restar(numero1:Double, numero2:Double){
    var resultado = numero1- numero2
    println("El resultado de la resta es = $resultado")
}

fun multiplicar(num1: Double, num2: Double):Double{
    var resultado = num1*num2;
    return resultado
}

fun mayor(){
    fun calcularMayor(numero1: Double, numero2: Double) =
        if (numero1> numero2) numero1 else numero2
    for (i in 1..5){
        println("Ingrese el numero 1:")
        val num1 = readln().toDouble()

        println("Ingrese el numero 2:")
        val num2 = readln().toDouble()

        println("El numero mayor es: ${calcularMayor(num1, num2)}")
    }
}

fun  main(){
    saludo("Jaider")
    println("el resultado de la multiplicacion es: ${sumar()}")
    mayor()
}

fun menor(numero1: Double, numero2: Double) = if (numero1<numero2) numero1 else numero2