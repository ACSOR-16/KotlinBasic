fun runFunction() {
    val cellphones = mutableListOf("Google pixel A", "Google pixel B", "Xiaomi 11 T pro", "Honor x8b")
        .run {
            removeIf { cellphone -> cellphone.contains("Google")}
            this
        }
    println(cellphones)
}