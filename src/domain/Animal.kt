package domain

open class Animal(val name: String) {

    open fun sound() {
        println("Animal is making a sound")
    }
}