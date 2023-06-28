package com.example.collections

data class Student(val name: String, val age: Int, val school: String)

fun main(){
    val students = arrayListOf(
        Student("Ahmet", 20, "Üniversite A"),
        Student("Ayşe", 27, "Üniversite B"),
        Student("Mehmet", 22, "Üniversite C"),
        Student("Fatma", 28, "Üniversite A"),
        Student("Ali", 29, "Üniversite B"),
        Student("Feyza", 24, "Üniversite A"),
        Student("Berkay", 22, "Üniversite B"),
        Student("Caner", 26, "Üniversite A")
    )
    val max=students.maxBy { it -> it.age }
    println(max)

    val min = students.minBy { it -> it.age }
    println(min)

    val filter= students.filter { it.school == "Üniversite A" }
    println(filter)

    println("filter -> ${filter.filter { it.age > 25 }}")
    println("filter -> ${filter.filter { it.age < 25 }}")
}
