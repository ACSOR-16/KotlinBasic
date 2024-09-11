fun alsoFunction() {
    val activities = mutableListOf("run", "walk", "study", "cook")
        .also {
            list -> println("original list of the list: $list")
        }.asReversed()

    println(activities)
}