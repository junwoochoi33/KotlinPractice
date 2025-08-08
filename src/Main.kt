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

    val name = "Alice"
    println("Uppercased Name: ${name.let {
        println("Uppercasing name: $it")
        it.uppercase()
    }}")
    name.run {
        println("Calculating length of name: $this")
        this.length
    }
    println("Built Sentence: ${
        with(StringBuilder()) {
            append("Hello, ")
            append(name)
            toString()
        }
    }")

    val coordinate = Coordinate().apply {
        longitude = 12.34
        latitude = 56.78
    }
    println("Coordinate: Latitude = ${coordinate.latitude}, Longitude = ${coordinate.longitude}")

    val list = mutableListOf(1, 2, 3)
    list.also {
        println("Before adding: $it")
    }.add(4).let {
        println("After adding: $list")
    }

    val unit: Unit = sayHello("Alice")
    println("Unit value: $unit")

    normalVarargs(1, 2, 3, 4, 5)

    val fun1 = ::printLength
    fun1("Hello, Kotlin Island 1!")

    val fun2 = { println("Hello, Kotlin Island 2!") }
    fun2()

    val words = arrayOf("Hello", "America")
    printAll(*words)

    val add : (Int, Int) -> Int = fun(x, y) = x + y
    println("Add Result of 5 and 10: ${add(5, 10)}")

    repeat(10) { println("Repeat action: $it") }
}

fun printLength(obj: Any?) {
    when (obj) {
        is String -> println("Length of string: ${obj.length}")
        is List<*> -> println("Length of list: ${obj.size}")
        else -> println("Unknown type")
    }
}

fun sayHello(name: String): Unit {
    println("Hello, $name!")
}

fun normalVarargs(vararg counts: Int) {
    println("Counts: ${counts.joinToString(", ")}")
}

fun printAll(vararg words: String) {
    for (word in words) {
        println(word)
    }
}

inline fun repeat(times: Int, action: (Int) -> Unit): Unit {
    for (index in 0 until times) {
        action(index)
    }
}
