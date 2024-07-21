fun tryCatch () {
    var nameTest : String? = null
    println(nameTest?.length)

    try {
//        throw IllegalStateException("Error!")
        println(nameTest!!.length)

    } catch (exception : Exception) {
        println("A problem has occurred")
    } finally {
        println("running final code")
    }

//    Try as expression
    val firstValue = 10
    val secondValue = 0
    val result = try { firstValue/secondValue} catch (e: Exception) { 0 }
    println(result)
}