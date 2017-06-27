import scala.util._

object Lottery {
    val r = new Random
    def lottn = r.nextInt(49) + 1
    def expSet(s: Set[Int], n: Int): Set[Int] =
        if (s.size >= n)
            s
        else
            expSet(s + lottn, n)
    def main(argv: Array[String]) {
        1 to 10 foreach( i => println(expSet(Set(), 6).toList.sorted) )
    }
}
