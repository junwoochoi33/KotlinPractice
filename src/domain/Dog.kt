package domain

class Dog(name: String) : Animal(name) {

    override fun sound() {
        println("woof woof")
    }
}