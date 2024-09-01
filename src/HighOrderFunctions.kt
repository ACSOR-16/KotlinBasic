fun superFunction(name: String, block : (String) -> Int) : Int{
    return block(name)
}

fun functionInception (name: String) : () -> String{
    return {
        "hello $name from function inception"
    }
}