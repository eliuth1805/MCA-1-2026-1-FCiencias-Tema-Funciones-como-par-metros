/**
 * Llamada con parametro una función.
 *
 * Curso: MCA 1 2026-1 FCiencias
 * Tema: Funciones como parámetros
 *
 * Autor: Jesús Eliuth Martínez Mendoza 
 * Fecha: 05 Nov 2025
 *
 ** Software: Scala 3.7.3 (online)
 *
 * Descripción:
 * Este programa muestra cómo pasar una función como parámetro.
 * La función `calcular` recibe dos números y otra función que indica
 * qué operación matemática realizar (suma, resta o multiplicación).
 */

object Operaciones {

  // Función de orden superior que recibe otra función como parámetro
  def calcular(a: Int, b: Int, operacion: (Int, Int) => Int): Int = {
      operacion(a, b) // Aplica la operación recibida
  }

  // Funciones que pueden pasarse como parámetro
  def sumar(x: Int, y: Int): Int = x + y
  def restar(x: Int, y: Int): Int = x - y
  def multiplicar(x: Int, y: Int): Int = x * y


  // Funcion principal y ejemplo
  def main(args: Array[String]): Unit = {
    val num1 = 100
    val num2 = 2

    println(s"Los números son: $num1 y $num2\n")

    // Llamadas con diferentes funciones como parámetro
    println(s"Suma: ${calcular(num1, num2, sumar)}")
    println(s"Resta: ${calcular(num1, num2, restar)}")
    println(s"Multiplicación: ${calcular(num1, num2, multiplicar)}")
  }
}
