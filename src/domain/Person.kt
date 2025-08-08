package domain

class Person(val name: String, var age: Int) {

    fun introduce() {
        println("Hello, my name is $name and I am $age years old.")
    }
}