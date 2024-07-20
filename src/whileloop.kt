fun whileLoop () {
    var count = 12
    while (count > 0) {
        println("the value of count is: $count")
        count--
    }

    do {
        println("Generate random number...")
        val randomNumber = (0..100).random()
        println("The number generate is: $randomNumber")
    } while (randomNumber < 50)
}