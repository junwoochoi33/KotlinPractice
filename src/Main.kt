import domain.config.Settings
import domain.model.*
import extensions.sayHello

typealias StringAlias = String

fun main() {

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

    repeat(10, { println("Repeat action: $it") }, ::printPipe)

    println("5 multiply 10: ${5 multiply 10}")

    println("max and min between 2 and 3: ${max(2, 3)}, ${min(2, 3)}")

    val score: Int = 78
    if (score >= 90) {
        println("Grade: A")
    } else if (score in 80..89) {
        println("Grade: B")
    } else if (score in 70..79) {
        println("Grade: C")
    } else if (score in 60..69) {
        println("Grade: D")
    } else {
        println("Grade: F")
    }

    for (i in 1..5) println("Counting: $i")
    for (i in 5 downTo 1) println("Counting down: $i")
    for (i in 1 until 5) println("Counting up to 5: $i")
    for (i in 1..10 step 2) println("Counting by twos: $i")

    retFunc()

    val alice: Person = Developer("Alice", 30)

    val clone001 = object : Person("clone-001") {
        override fun work() = println("clone-001 is working.")
    }
    clone001.work()

    val myPrinter = object : Printer("MyPrinter") {
        override fun print() {
            println("Printing from $name")
        }
    }
    myPrinter.print()
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

inline fun repeat(times: Int, action: (Int) -> Unit, noinline printPipe: () -> Unit): Unit {
    for (index in 0 until times) {
        action(index)
        printPipe()
    }
}

fun printPipe() {
    print("|")
}

infix fun Int.multiply(other: Int): Int {
    return this * other
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun min(a: Int, b: Int): Int = if (a < b) {
    a
} else {
    b
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    println("start of inlineLambda")
    out(a, b)
    println("end of inlineLambda")
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3) lit@{ a, b ->
        val result = a + b
        if (result > 10) return@lit
        println("result: $result")
    }
    println("end of retFunc")
}

abstract class Printer(val name: String) {
    abstract fun print()
}