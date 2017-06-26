class Person(val first: String = "John", val last: String = "Doe")

object HelloWorld {
    val bloke: Person = new Person
    def main(args: Array[String]) {
        println("Hello " + bloke.first)
    }
}
