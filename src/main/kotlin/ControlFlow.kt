
fun main(){
    showIfElse(20)
    showWhen(200)
}

fun showCaseForLoops(){

}

fun showWhen(amount: Int){
    when(amount){   //when statement
        100 -> println("pretty much")
        150-> showIfElse(100)
        200-> {
            println("multiline statement")
            println("test")
        }
    }
    when(amount){
        in 1..100 -> println("range between 1 and 100")
        !in 10..90 -> println("not in range between 10 to 90")
    }

    val validNumbers = listOf(1, 2, 3, 4, 5, 100)

    when(amount){
        in validNumbers -> println("valid number")
    }

    val test = "prefix"
    val test2 = 10
    println("test value: $test")
    println("hasPrefix ${hasPrefix(test, "pre")}")  //true
    println("hasPrefix ${hasPrefix(test2, "pre")}")  //false
}

fun hasPrefix(x: Any,prefix: String) = when(x){     //x can jeden möglichen datentyp annehmen
    is String -> x.startsWith(prefix)   //falls es ein String is check ob es mit dem übergebenen prefix startet
    else -> false
}

fun showIfElse(amount: Int){
    val amount = 100

    if(amount == 100){
        println("pretty much")
    }
    else if (amount > 100){
        println("wow..very much")
    }
    else {
        println("doing ok")
    }


    val a = 10
    val b = 1

    val max = if(a > b){
        println("a > b")
        a  //das hier ist das was geprint wird egal was hier steht ob int oder string    diese letzte zeile hat auswirkungen
    }
    else {
        b
    }
    println(max)
}