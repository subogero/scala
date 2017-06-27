object Perms {
    val perms = (c: Seq[Char]) =>
        c flatMap ( a =>
            c filter(b => b != a)
                map (b => (a, b))
        )
    def main(argv: Array[String]) = println(perms(Seq('a', 'b', 'c')))
}
