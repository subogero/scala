class Complex(val re: Double = 0, val im: Double = 0) {
    override def toString: String = {
        if (this.im >= 0)
            "%f + %fi".format(this.re, this.im)
        else
            "%f - %fi".format(this.re, -this.im)
    }
    def + (x: Complex) = new Complex(this.re + x.re, this.im + x.im)
    def - (x: Complex) = new Complex(this.re - x.re, this.im - x.im)
}

object Complex {
    implicit def d2c(x: Double) = new Complex(x)
    def main(argv: Array[String]) = {
        val c = new Complex(1,-2)
        val c2 = c - 5
        val c3 = c + c2
        val c4 = 2 - c
        println(c)
        println(c2)
        println(c3)
        println(c4)
    }
}
