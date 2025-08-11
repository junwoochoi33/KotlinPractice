package domain.model

open class Person {

    constructor(firstName: String) {
        println("Person created with name: $firstName")
    }

    constructor(firstName: String, age: Int) {
        println("Person created with name: $firstName and age: $age")
    }

    open fun work() = println("Person is working.")
    fun talk() = println("Person is talking.")
}