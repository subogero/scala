class Person ( val first: String, val last: String, val born: Int) {
    Person.n += 1
    println("Instance " + Person.n)
    def age(): Int = {
        val date = new java.util.Date
        val now = 1900 + date.getYear
        now - born
    }
}

object Person {
    var n = 0
    def main(args: Array[String]) = {
        val tibi = new Person("Tibi", "Napi", 1970)
        println(tibi.age)
        val klara = new Person("Klara", "Napi", 1975)
        println(klara.age)
    }
}
