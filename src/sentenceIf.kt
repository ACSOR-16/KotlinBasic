fun sentenceIf() {
    val name = "ara";

    if (name.isNotEmpty()) println("the size of the string is ${name.length}")
    else println("Error")

    val message: String = if (name.length > 4) "your name es large"
     else if (name.isNotEmpty()) "is not empty"
     else "your name is short"

    println(message)

}