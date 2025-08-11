open class Base {
    open val x : Int = 1
    open fun f() = println("Base function f() called, x = $x")
}

class Child : Base() {
    override val x: Int = super.x + 1
    override fun f() = println("Child function f() called, x = $x")

    inner class Inside {
        fun f() = println("Inside class function f() called, x = $x")
        fun test() {
            f()
            Child().f()
            super@Child.f()
            println("Inside class test() called, x = $x, super.x = ${super@Child.x}")
        }
    }
}

fun main() {
    val c1 = Child()
    c1.Inside().test()
}
