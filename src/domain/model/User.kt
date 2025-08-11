package domain.model

class User private constructor(val name: String) {
    companion object {
        @JvmStatic
        fun create(name: String): User {
            return User(name)
        }
    }
}

fun main() {
    val user = User.create("Alice")
    println("User created with name: ${user.name}")
}