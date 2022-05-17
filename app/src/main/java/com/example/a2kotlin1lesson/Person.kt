package com.example.a2kotlin1lesson

class Person(var firstName: String, private val lastName: String, private val age: Int) {

    fun printMethod() {
        println(("$firstName $lastName $age"))
    }
}