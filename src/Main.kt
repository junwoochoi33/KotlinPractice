import domain.model.Animal
import domain.model.Car
import domain.model.Dog
import domain.model.Person

fun main() {

    val person = Person("Alice", 30)
    person.introduce()

    val dog: Animal = Dog("Charlie")
    dog.sound()

    val car = Car()
    car.move()
}