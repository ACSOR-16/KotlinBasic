fun applyFunction() {
    val meals = mutableListOf("cevivhe", "arroz con pollo", "estofado", "seco a la norte;a")
        .apply { removeIf { meal -> meal.contains("seco") } }
    println(meals)

    val colors: MutableList<String>?? = mutableListOf("red", "blue", "green", "black", "white((")
    colors?.apply {
        println("the elements of this list: $this")
        println("size of the list is: $size")
    }
    println(colors)
}