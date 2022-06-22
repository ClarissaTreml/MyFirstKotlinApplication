//Lambda Expressions sind function literale
//man muss sie nicht unbedingt deklarieren und kann sie sofort als expression aufrufen

fun main(){
    val addiition = sumAsLambda(12, 10)
    println(addiition)

    printCustomMessage("My Message", printMessage)
    printCustomMessage("My Message", printMessage2)

}

fun sum2(n1: Int, n2: Int) :Int{ //ich habe hier 2 Übergabe Parameter vom Typ Int und 1 Rückgabe Parameter vom Typ Int
    return n1 + n2                 //diese funktion wollen wir als lambda schreiben
}

//im ersten Part definiere ich die typen der Übergabe Parameter, danach folgt( ->) der Return Wert, damm kommt ein function body
//in dem ich etwas mit diesem Übergabe Parameter mache
val sumAsLambda: (Int, Int) -> Int = {a, b -> a + b} //diese variable speichert eine No-named-Method


//überprüfe, ob eine Liste einen bestimmten Wert hat
//return Wert muss angegeben werden
val ckeckIfContains: (List<String>, String) -> Boolean = {list, key ->
    val contains = list.contains(key)
    contains
}

val calcCatAgeLambda: (Int) -> Int = {age -> age*7}



//Lambda Expressions kann man in Funktionen übergeben kann
fun printCustomMessage(message: String, funAsParam: (String) -> Unit){ //wir haben eine Funktion an eine andere Funktion übergeben
    funAsParam(message)
}

// wenn man den Parameter nicht festlegt dann kann man den mit 'it' ansprechen (aber gilt nur für einen Parameter)
val printMessage: (String) -> Unit = { println("This is a message: $it") }

val printMessage2: (String) -> Unit = { println("This is another message: $it") }