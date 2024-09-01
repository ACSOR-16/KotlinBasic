fun lambdasFunctions() {
    val myLambda : (String) -> Int = {
        parameter -> parameter.length
    }
    val lambdaExe = myLambda("Testing count")
    println(lambdaExe)

    val greetings = listOf("Hello", "Hola", "Ciao")
    val numbersOfLetters = greetings.map(myLambda)
    println(numbersOfLetters)
}