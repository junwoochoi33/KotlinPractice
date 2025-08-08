import domain.Animal
import domain.Dog
import domain.Person

fun main() {

    val person = Person("Alice", 30)
    person.introduce()

    val dog: Animal = Dog("Charlie")
    dog.sound()
}