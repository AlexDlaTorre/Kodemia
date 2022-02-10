package com.example.excepciones2

import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
   // obtenerFollowersInstagram()
    //adivinaLosCaracteres()
    //divideLaCuenta()
   // buscarFactura()
}

fun obtenerFollowersInstagram() {
    println("Ingresa ¿cuántos followers tienes en Instagram?")

    try {

        var followers = readLine()?.toInt()
        val numeroPopular = 100

        println("Calculando popularidad ...")
        if (followers != null) {
            if (followers > numeroPopular) {
                println("Eres muy popular")
            } else {
                println("Te faltan followers")
            }
        }
    } catch (e: NumberFormatException) {
        println(e.message)
        println("No se ingresó un número")
    }
}

fun adivinaLosCaracteres(){

    try {
        println("Ingresa una frase de 40 caracteres en 3 segundos")
        var frase = readLine().toString()
        val longitud = frase[40]
    } catch (e: StringIndexOutOfBoundsException) {
        println(e.message)
        println("Tu calculo no contiene 40 caracteres")
    }
}

fun divideLaCuenta(){

    try {
        println("Ingresa el total de tu cuenta")
        var total = readLine()?.toInt()
        println("Ingresa el número de personas que van a pagar")
        val personas = readLine()?.toInt()
        val aportacionPorPersona = personas?.let { total?.div(it) }
        println("A cada quién le toca $aportacionPorPersona")
    } catch (e: ArithmeticException) {
        println(e.message)
        println("Ingresa almenos una persona")
    }
}

fun buscarFactura() {
    try {
        println("Ingresa tu RFC")
        var rfc = readLine().toString()
        val file = File("E://$rfc.txt")
        val fileReader = FileReader(file)
    } catch (e: FileNotFoundException) {
        println(e.message)
        println("Tu factura no se encontró en el sistema")
    }
}