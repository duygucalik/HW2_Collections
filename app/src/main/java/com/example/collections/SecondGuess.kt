package com.example.collections

import java.util.Scanner

data class Person(val name: String, val age: Int)

data class Name(val name: String)

fun main(){
   var names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")
    println("Aratmak için isim giriniz.")

    var input= Scanner(System.`in`)
    val name=input.next()
    if(name in names){
        //val opposite=name.reversed()
        val uppercase=name.uppercase().reversed()
        println("Aratılan isim :  $uppercase")
    }
    else{

        println("isim listede bulunmuyor!")

    }

}