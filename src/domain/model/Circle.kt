package domain.model

class Circle(val radius: Double) : Shape() {

    override fun area(): Double = Math.PI * radius * radius
}