fun typeOfList() {
    val nameList = listOf("oscar", "araceli", "fre")
    println(nameList)

    val emptyList = mutableListOf<String>()
    println(emptyList)

    emptyList.add("elvis")
    println(emptyList)

    val usingValueGet = emptyList.get(0)
    println(usingValueGet)
    val usingOperatorValue = emptyList[0]
    println(usingOperatorValue)

    val firstValue: String? = nameList.firstOrNull()
    println(firstValue)

    emptyList.removeAt(0)
    println(emptyList)

    emptyList.add("luis")
    emptyList.removeIf { characters -> characters.length < 7 }
    println(emptyList)

    val myArray = arrayOf(1,2,3,4,5,6)
    println(myArray)
    println(myArray.toList())
}