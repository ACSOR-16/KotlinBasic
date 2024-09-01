fun scopeFunction() {
    var name : String? = null
    name?.let { value -> println("the name is not null, is $value") }

    name = "Oscar"
    name?.let { value -> println("the name is not null, is $value") }
}