
fun main(){
    myVoid(10, "Hello")
    myVoid(number = 12, aString = "this ist called named argument")
    myVoid(aString = "die reihenfolge ist egal", number = 5)  //hiermit sparrt man sich alle werte hinzuschreiben falls es leere werte geben sollte

    val mySum = sum(10, 1)
    println(mySum)

    println(calculateCatAge(4))
}

fun sum(n1: Int, n2: Int) :Int{  // () :Int ist der Return typ
    return n1 + n2
}

fun calculateCatAge(age: Int): Int = age*7   //one-line-functions

fun myVoid(number: Int, aString: String) :Unit{  //() :Unit heißt es wird nichts zurückgegeben muss aber nicht geschireben werden, wird eher dann bei lambda expressions nötig
    println("$number and $aString")
}
fun anotherVoid(number: Int, aString: String, age: Int = 0, aSecondString: String? = null){  //age und aSecondString sind hier            default arguments
    println("$number and $aString")
}