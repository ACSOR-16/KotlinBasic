fun withFunction() {
    val colors = listOf("red", "blue", "green", "black", "white")

    with(colors) {
        println("Elements of this list are: $this")
        println("Size oh the list is: $size")
    }
}