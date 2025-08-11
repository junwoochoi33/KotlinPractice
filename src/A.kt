open class A {
    open fun f() = println("A function f() called")
    fun a() = println("A function a() called")
}

interface B {
    fun f() = println("B function f() called")
    fun b() = println("B function b() called")
}

class C: A(), B {
    override fun f() = println("C function f() called")

    fun test() {
        f()
        b()
        super<A>.f() // Calls A's f()
        super<B>.f() // Calls B's f()
    }
}

fun main() {
    val c = C()
    c.test()
}






