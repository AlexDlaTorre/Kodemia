package com.example.excepciones2

import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.lang.NumberFormatException

fun main() {
    arithmeticException()
    nullPointerException()
    stringIndexOutOfBoundsException()
    fileNotFound()
    numberFormatException()
    arrayIndexOutOfBounds()
}

fun arithmeticException() {
    try {
        val a = 30
        val b = 0
        val c = a / b //División entre cero, no se puede hacer
        println("Resultados = $c")
    } catch (e: ArithmeticException) {
        println(e.message)
        println("Una división no puede ser entre 0")

    }
}

fun nullPointerException() {
    try {
        val a: String? = null
        println(a!![0])
    } catch (e: NullPointerException) {
        println(e.message)
        println("Null pointer exception")
    }
}

fun stringIndexOutOfBoundsException() {
    try {
        val a = "Estoy escalando el Pico del Águila"
        val b = a.length
        val c = a[39]
        println(c)
    } catch (e: StringIndexOutOfBoundsException) {
        println(e.message)
        println("Indice de la cadena fuera de rango")
    }
}

fun fileNotFound() {
    try {
        val file = File("E://archivo.txt")
        val fileReader = FileReader(file)
    } catch (e: FileNotFoundException) {
        println(e.message)
        println("Archivo no se encuentra")
    }
}

fun numberFormatException() {
    try {
        val numero = "akki".toInt()
        println(numero)
    } catch (e: NumberFormatException) {
        println(e.message)
        println("No se ingresó un número")
    }
}

fun arrayIndexOutOfBounds() {
    try {
        val a = IntArray(5)
        a[6] = 9
    } catch (e: ArrayIndexOutOfBoundsException) {
        println(e.message)
        println("Elemento (indice) fuera del rango rango del Array (matriz)")
    }
}