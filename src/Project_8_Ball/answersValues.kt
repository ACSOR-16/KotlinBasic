package Project_8_Ball

// VALUES OF THE ANSWERS
const val AFFIRMATIVE_ANSWER = "GREAT"
const val NEGATIVE_ANSWER = "NOPE"
const val DOUBTFUL_ANSWER = "WTF"

// WE LINK THE ANSWERS WITH THE VALUES
val answers = mapOf(
    "si" to AFFIRMATIVE_ANSWER,
    "es cierto" to AFFIRMATIVE_ANSWER,
    "totalmente" to AFFIRMATIVE_ANSWER,
    "sin duda" to AFFIRMATIVE_ANSWER,
    "Pregunta en otro momento" to DOUBTFUL_ANSWER,
    "No puedo decirte en este momento" to DOUBTFUL_ANSWER,
    "Puede que si o puede que no" to DOUBTFUL_ANSWER,
    "No va a suceder" to NEGATIVE_ANSWER,
    "No cuentes con ello" to NEGATIVE_ANSWER,
    "Definitivamente no" to NEGATIVE_ANSWER,
    "No lo creo" to NEGATIVE_ANSWER,
)

fun main() {
    println("HI I'm your 8 Ball")
    println("1. Ask a question")
    println("2. Review all answers")
    println("3. Exit")

    val inputValue = readLine()

    when(inputValue) {
        "1" -> askAQuestion()
        "2" -> showAnswer()
        "3" -> exit()
        else -> showError()
    }


}