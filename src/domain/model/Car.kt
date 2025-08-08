package domain.model

import domain.behavior.Movable

class Car : Movable {

    override fun move() {
        println("Car moved!")
    }
}