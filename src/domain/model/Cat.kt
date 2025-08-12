package domain.model

class Cat(override var category: String) : Pet {
    override fun feeding() {
        println("Feed the cat a tuna fish.")
    }
}

fun main() {
    val obj = Cat("russian blue")
    println("Pet category: ${obj.category}")
    obj.feeding()
    obj.patting()
}