package domain.model

interface Pet {
    var category: String
    fun feeding()
    fun patting() {
        println("Keep patting!")
    }
}