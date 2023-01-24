fun main(args: Array<String>) {
    //======================================
    println("Studying Kotlin\n")
    //======================================
    for(i: Int in 1..10)
        print("$i ")
    println()

    val len: Int = 5
    for(i in 1..len)
        print("$i ")
    println()

    for(i in 1 until len)
        print("$i ")
    println()
    //======================================
    for(a: Int in 1..10 step(2))
        print("$a ")

    //for(i in 10..1 step(-1))    //error
    //   print("$i ")

    for(a in 10 downTo 1)
        print("$a ")

    for(a in 10 downTo 1 step(2))
        print("$a ")

}
