import domain.model.Person

class Developer: Person {

    constructor(firstName: String): super(firstName) {
        println("Developer created with name: $firstName")
    }

    constructor(firstName: String, age: Int): super(firstName, age) {
        println("Developer created with name: $firstName and age: $age")
    }
}