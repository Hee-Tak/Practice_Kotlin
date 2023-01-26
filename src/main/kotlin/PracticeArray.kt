class PracticeArray {

    fun arraytest() {
        val array: Array<Int> = arrayOf(1, 2, 3)
        val arrOfNulls: Array<Int?> = arrayOfNulls<Int>(3)
        val emptyArray: Array<Int> = emptyArray()
        val arrayLambda: Array<Int> = Array(5) { index -> index } //{0,1,2,3,4} 생성
        val intArrayLambda: IntArray = IntArray(5) { index -> index } //{0,1,2,3,4} 생성
        val intArrayWithRange1: Array<Int> = (0..10).toList().toTypedArray() //{0,1,2,3,4,5,...,9}
        val intArrayWithRange2: IntArray = (0..10).toList().toIntArray() //{0,1,2,3,4,....,9}

        val arrayExample: Array<String> = arrayOf("a", "b", "c")

        print(arrayExample[1]+"\t") //b
        arrayExample[1] = "c"
        print(arrayExample[1]+"\t") //c

        print(arrayExample.get(1)+"\t")
        arrayExample.set(1, "d")
        println()

        val arrayExample1: Array<Array<String>> = arrayOf(arrayOf("a", "b", "c"), arrayOf("e", "f"))
        print(arrayExample1[0][1]+"\t") //b
        arrayExample1[0][1] = "g"
        print(arrayExample1[0][1]+"\t") //g
        println()

        /*
        print(arrayExample1[0])
        println()
        print(arrayExample1[1])
        println()
         */
        println(arrayExample1.contentDeepToString())
    }
}