package Project_8_Ball

import java.net.http.HttpResponse

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
        "3" -> exitOfTheMenu()
        else -> showError()
    }
}

fun showError() {
    println("Ups that's not a correct value")
}

fun exitOfTheMenu() {
    println("See you")
}

fun showAnswer() {
    println("Select an option")
    println("1. Review all answers")
    println("2. Review only affirmative answers")
    println("3. Review only doubtful answers")
    println("4. Review only negative answers")

    val selectedOption = readLine()?.toInt()
    when(selectedOption) {
        1 -> showAnswersByType()
        2 -> showAnswersByType(typeOfResponse = AFFIRMATIVE_ANSWER)
        3 -> showAnswersByType(typeOfResponse = DOUBTFUL_ANSWER)
        4 -> showAnswersByType(typeOfResponse = NEGATIVE_ANSWER)
        else -> println("invalid Answer, bye")
    }
}

fun showAnswersByType(typeOfResponse: String = "ALL") {
    when(typeOfResponse){
        
    "ALL" -> answers.keys.forEach { answer -> println(answer) }
        
    AFFIRMATIVE_ANSWER -> answers.filterValues { values -> values == AFFIRMATIVE_ANSWER }
        .also { affirmativeAnswer -> println(affirmativeAnswer.keys) }

    NEGATIVE_ANSWER -> answers.filterValues { values -> values == NEGATIVE_ANSWER }
        .also { negativeAnswer -> println(negativeAnswer.keys) }

    DOUBTFUL_ANSWER -> answers.filterValues { values -> values == DOUBTFUL_ANSWER }
        .also { doubtfulAnswer -> println(doubtfulAnswer.keys) }

    }
}

fun askAQuestion() {
    println("what question do you ask")
    readLine()
    println("So that's your question... The answer to that is:")

    val generatedAnswer = answers.keys.random()
    println(generatedAnswer)
}