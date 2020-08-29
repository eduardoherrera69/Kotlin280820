package com.example.kotlin270820

import android.net.IpPrefix
import android.provider.ContactsContract
import android.webkit.ConsoleMessage

fun main(){

////llamar el metodo
//    imprimirNombreCompleto("Eduardo", "Herrera", 30)
//println(imprimirNombreCompleto("Eduardo", "Herrera", 30))
//
//
//    val saludo = "Este es un mensaje"
 //  printMessage(saludo)

// Extension
//    val nombre = "Carlos"
//    val nombre2 = "Antonio"
//    "algo".imprime()
//    nombre2.imprime()

/*
 instancia de un objeto
 se crearan dos objetos
el objeto customer se utilizara cuando se llame a customer

   val customer = Customer()
  val mContact = Contact( 1,"cristian.vidal.lopez@gmail.com")
   println(mContact.id) //imprime el "1"
   println(mContact.email) // imprime el correo
*/

/*    //INstancia el perrito de la herencia
val perrito = Dog()
perrito.makeNoise()
  val yorkShire: Dog = Yorkshire()
    yorkShire.makeNoise()*/

}//Aca termina mi Main


//
//fun printMessage(Mensaje: String){
//    println(Mensaje)
//}
////Declarar una funcion y asignarle parametros
//fun imprimirNombreCompleto(nombre: String, apellidos: String,edad: Int):String {
//
//    return "Mi nombre es $nombre $apellidos $edad"
//
//
//}
//fun printMessage (message: String){
//    println(message)

//Prefix


//}
// fun printMessageWhitPrefix(name: String, prefix: String = "Estudiante :"){
//
//     println("$prefix : $name")
//
// }
//   fun sum(x: Int, y: Int): Int {
//       return x + y
//
// }
//fun multiplicacion(num: Int, num2: Int): Int{
//    return num * num2
//}
//
////funcion que recibe multiples parametros
//fun imprimeVariosParametros(vararg message: String) {
//    for (elemento in message) println(elemento)
//
//}
//
//fun imprimirAllWithPrefix(vararg message:String, prefix: String: String){
//    for (elemento in message) println(prefix + elemento)
//}

// Extension
//fun String.imprime() {
//    println(this )
//}
//
//fun String.despedida(){
//   println("Chao")
//}
// CLASE

/*class FirstClass

class Persona(mText: String)*/

/*
// ej de clases

class Customer // una clase y no hace nada porque no parametros, ni nada
class Contact(val id: Int, var email: String) // una clase con parametros
Imprime:
1
cristian.vidal.lopez@gmail.com
*/

//HERENCIA
/*open class Dog{
    open fun makeNoise(){
        println("Guau Guau")
    }
}

class  Yorkshire: Dog(){
    override fun makeNoise() {
    //super.makeNoise()
        println("Gui Gui")
    }*/
