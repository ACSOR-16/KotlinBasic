fun forLoop() {
    val fruitLIst = listOf("apple", "banana", "melon", "berry")

    for (fruit in fruitLIst) {
        println("Today I will eat a fruit named: $fruit")
    }

    for (fruit in fruitLIst) println("A fruit: $fruit")

    fruitLIst.forEach { fruit -> println("this is a: $fruit") }

    val fruitCharacters = fruitLIst.map { fruit -> fruit.length }
    println(fruitCharacters)

    val filterFruitList = fruitCharacters.filter { fruitLength -> fruitLength > 5 }
    println(filterFruitList)
}