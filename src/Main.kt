import domain.config.Settings
import domain.model.*

fun main() {

    val person = Person("Alice", 30)
    person.introduce()

    val dog: Animal = Dog("Charlie")
    dog.sound()

    val car = Car()
    car.move()

    val bankAccount = BankAccount(1000)
    println("Bank Account: ${bankAccount.getBalance()}")

    Settings.toggleDarkMode()
    println("Dark Mode Enabled: ${Settings.darkModeEnabled}")

    val circle: Shape = Circle(7.0)
    println("Circle Area: ${circle.area()}")

    fun String.sayHello() = println("Hello, $this!")
    "World".sayHello()
}


