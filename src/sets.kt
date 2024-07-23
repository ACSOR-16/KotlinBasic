fun sets() {
    val vowels = setOf("a", "e", "i", "o", "u", "a", "e")
    println(vowels)

    val favoritesNumbers = mutableSetOf(1,2,3,4,5,5)
    favoritesNumbers.add(6)
    favoritesNumbers.add(6)

    favoritesNumbers.remove(5)
    println(favoritesNumbers)

    val setValue = favoritesNumbers.first { number -> number > 2 }
    println(setValue)
}