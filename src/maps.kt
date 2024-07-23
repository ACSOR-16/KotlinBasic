fun maps() {
    val AgeSuperHero = mapOf(
        "Iron-Man" to 35,
        "Spider-Man" to 21,
        "Capitan-American" to 110
    )
    println(AgeSuperHero)

    val AgeHeroMutable = mutableMapOf(
        "Iron-Man" to 35,
        "Spider-Man" to 21,
        "Capitan-American" to 110
    )
    println(AgeHeroMutable)

    AgeHeroMutable.put("Thor", 568)
    println(AgeHeroMutable)

    AgeHeroMutable["Hulk"] = 35
    println(AgeHeroMutable)

    val ageIronMan = AgeHeroMutable["Iron-Man"]
    println(ageIronMan)

    AgeHeroMutable.remove("Spider-Man")
    println(AgeHeroMutable)

    println(AgeHeroMutable.keys)
}