fun SentenceWhen() {
    val colorName = "Red"

    when (colorName) {
        "yellow" -> println("this color symbolizes joy")
        "Red", "RedStone" -> println("this color symbolizes fury")
        else -> println("error don't exist color")
    }

    val code = 200
    when (code) {
        in 200..300 -> println("everything went well")
        in 301..400 -> println("something went wrong")
        else -> ("unknown code. something has gone wrong")
    }

    val shoeSize = 40;
    val message = when (shoeSize) {
        in 40..43 -> println("we have shoes available")
        in 44..47 -> println("we almost have no shoes left")
        48 -> println("sorry we don't have that size of shoes available ")
        else -> println("there ara only these shoe sizes")
    }
    println(message)
}