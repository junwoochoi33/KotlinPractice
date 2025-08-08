package extensions

fun String.sayHello() = println("Hello, $this!")
fun String.removeWhitespace(): String = this.replace("\\s".toRegex(), "")