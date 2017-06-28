object Curry {
    def whilst(b: => Boolean)(f: => Unit): Unit = {
        if (b) {
            f
            whilst(b)(f)
        }
    }
    def repeat(b: => Boolean)(f: => Unit): Unit = {
        val again = b
        f
        if (again) {
            repeat(b)(f)
        }
    }
    def until(b: => Boolean)(f: => Unit): Unit = {
        val again = !b
        f
        if (again) {
            until(b)(f)
        }
    }
    def main(argv: Array[String]) = {
        println("whilst")
        var i = 0
        whilst(i < 10) { println(i); i += 1 }
        println("repeat")
        i = 0
        repeat(i < 10) { println(i); i += 1 }
        println("until")
        i = 0
        until(i >= 10) { println(i); i += 1 }
    }
}
