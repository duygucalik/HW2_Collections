package com.example.collections

fun main() {
    data class Workers(val name: String, val salary: Double)

    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )

    val sortedWorkers = workers.map { Workers(it.name,(it.salary * 0.35) + it.salary) }.shuffled().sortedBy { it.salary } //her çalışana %35 zam

    val highestSalary = sortedWorkers.maxBy { it.salary }  //En yüksek maaş alan
    println("En yüksek maaş alan personel: $highestSalary")

    val lowestSalary = sortedWorkers.minBy { it.salary } //En düşük maaş alan
    println("En düşük maaş alan personel: $lowestSalary")

    val sumOfSalaries = sortedWorkers.sumOf { it.salary } // maaşların ortalaması
    val avgOfSalaries = sumOfSalaries/sortedWorkers.count()
    println("Tüm maaşların ortalaması: $avgOfSalaries")
}