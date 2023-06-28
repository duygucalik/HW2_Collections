package com.example.collections
import  java.util.Scanner

fun main(){
    var names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")
    println("Araya virgül koyarak 3 tane isim giriniz.")
    
    var input=Scanner(System.`in`)
    val name=input.next()
    val isimler: List<String> = name!!.split(",").map { it.trim() }
    
    if(isimler.size == 3 && isimler.isNotEmpty()) {
        names.add(isimler.toString())
        println("The new list is: $names")
    } else {
        println("You did not enter three names!")
    }
}

