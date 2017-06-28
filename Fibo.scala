object Fibo {
    def timed(f: => Any): (Any, Double) = {
        val t0 = System.nanoTime
        val ret = f
        val t = System.nanoTime
        (ret, (t - t0) / 1000000.0)
    }
    def fib1(n: Int): BigInt =
        if (n == 0)
            0
        else if (n == 1)
            1
        else
            fib1(n-2) + fib1(n-1)
    def fib2(n: Int): BigInt = {
        def fibhelp(pp: BigInt, p: BigInt, n: Int): BigInt = {
            if (n > 0)
                fibhelp(p, p + pp, n - 1)
            else
                pp
        }
        fibhelp(0, 1, n)
    }
    def main(argv: Array[String]) = {
        println(timed(println("Hello World!")))
        0 to 20 map( i => (
            i,
            timed(fib1(i)),
            timed(fib2(i))
        ) ) foreach(println(_))
    }
}
