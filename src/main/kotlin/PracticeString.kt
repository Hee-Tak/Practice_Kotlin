class PracticeString {
    fun testString(){
        val a = "kotlin"
        val b = "kotlin"
        val c = "KOTLIN"

        if(a == b)
            println("a is equal to b")
        if(a == c)
            println("a is equal to c")

        if(a.equals(b))
            println("a is equal to b")
        if(a.equals(c))
            println("a is equal to c")

        if(a.compareTo(b) == 0)
            println("a is equal to b")
        if(a.compareTo(c) > 0 )
            println("a is greater than c")
        if(c.compareTo(a) < 0)
            println("c is less than a")

        if(a.compareTo(c, false) > 0)
            println("a is greater than c (Case Sensitive)")
        if(a.compareTo(c, true) == 0)
            println("a is equals to c (Case Insensitive)")
    }
}