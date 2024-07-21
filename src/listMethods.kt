fun listMethods() {
    val lotteryNumbers = listOf(22,44,11,78,56,45,32)

    val sortedNumbers = lotteryNumbers.sorted()
    println(sortedNumbers)

    val dessendingNumbers = lotteryNumbers.sortedDescending()
    println(dessendingNumbers)

    val multiplyOrder = lotteryNumbers.sortedBy { number -> number < 30 }
    println(multiplyOrder)

    val randomNumbers = lotteryNumbers.shuffled()
    println(randomNumbers)

    val numberRevers = lotteryNumbers.reversed()
    println(numberRevers)

    val numbersMessage = lotteryNumbers.map { number ->
//        println(number)
        "your lottery number is: $number "
    }
    println(numbersMessage)

    val filteredNumbers = lotteryNumbers.filter { number -> number % 5 == 0 }
    println(filteredNumbers)
}