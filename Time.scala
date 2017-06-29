class Time(val h: Int, val min: Int, val s: Int) {
    override def toString = "%02d:%02d:%02d".format(this.h, this.min, this.s)
}

object Time {
    implicit def s2i(s: String) = if (s == "") 0 else s.toInt
    implicit def s2Time(s: String): Time = {
        val r_all = """(0*(\d+):)?0*(\d+):0*(\d+)""".r
        var r_s = """(0*(\d+)\s*s""".r
        var r_m = """(0*(\d+)\s*min""".r
        var r_h = """(0*(\d+)\s*h""".r
        s match {
            case r_all(_, h, min, s) => new Time(h, min, s)
            case r_s(s) => new Time(0, 0, s)
            case r_m(m) => new Time(0, m, 0)
            case r_h(h) => new Time(h, 0, 0)
        }
    }
    def main(argv: Array[String]) = {
        val t: Time = "01:01:01";
    }
}
