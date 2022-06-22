fun main() {
    println("Hello World!")

    var greeting = "HEllo" //varibalen können überschribeben werden
    val name = "Jane" //imutable, kann nicht überschrieben werden

    greeting = "Hola"

    var a:String = "abc" //default darf nicht null sein  (a = null)
    println(a.length)

    var b:String? = "abc"
    b = null
    println(b?.length) //bekommen nullpointerexception
    //println(b!!.length) force unwarpping nur wenn nicht null.

    val listWithNulls: List<String?> = listOf("Kotlin", null, null, "Java")
    for (item in listWithNulls){
        item?.let{    //let ist eine scope function und hier falls item is kein null call dann führe den code aus
            println(item)
        }
    }





}