import domain.config.Settings
import domain.model.*
import extensions.sayHello

typealias StringAlias = String

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

    "World".sayHello()

    val user: StringAlias = "John Doe"
    println("User: $user")

    val str1 : String? = null
    println("length of str1: ${str1?.length ?: "null"}")
    // println("length of str1: ${str1!!.length}")


}


