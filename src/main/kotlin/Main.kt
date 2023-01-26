fun main(args: Array<String>) {
    //======================================
    println("Studying Kotlin\n")
    //======================================
    practiceFor()

    practiceWhile()

    PracticeString().testString() //오 기본생성자 이용하는거임? 그런거같은데

    PracticeArray().arraytest()
}

fun practiceFor(){
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
    println()

    //for(i in 10..1 step(-1))    //error
    //   print("$i ")

    for(a in 10 downTo 1)
        print("$a ")
    println()

    for(a in 10 downTo 1 step(2))
        print("$a ")
    println()
    //==========================================
    val arr: IntArray = intArrayOf(10, 20, 30, 40, 50)

    for(k in arr)
        print("$k ")
    println()

    for(k in arr.reversed())
        print("$k ")
    println()

    val list = listOf<String>("korea", "salmon", "T_T")
    for(k in list)
        print("$k ")
    println()

    for(k in 0 until list.count())
        print("${list[k]} ")
    println()
}

fun practiceWhile(){
    var a: Int = 1
    while(a <= 10)
        print("${a++} ")
    println()

    do{
        print("${a--} ")
    }while(a > 0)
    println()
}