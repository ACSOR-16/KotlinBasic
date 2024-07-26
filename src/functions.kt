fun functions() {
    fun String.randomCase(): String {
        val randomNumber = 0..100
        val randomResult = randomNumber.random()

        if (randomResult.rem(2) == 0) {
            return this.toUpperCase()

        } else {
            return this.toLowerCase()
        }
    }

    fun printPhrase(phrase: String): Unit {
        println("your phrase is $phrase")
    }

    val randomPhrase = "Hi Good Night".randomCase()
//    println(randomCase("Phrase In English"))
    println(printPhrase(randomPhrase))
}