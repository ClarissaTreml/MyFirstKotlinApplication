
fun main(){
    val car = Car("red", "BMW")
    val car2 = Car("green")

    println(car.model)
    println(car2.model)

    car.drive()
    car2.speed(25, 150)
}

class Car (val color: String, val model: String = "Honda") {

    init { //initialisation block; wird immer aufgerufen wenn ein Objekt von Car generiert/initialisiert wird
        if (color == "green"){
            println("i love green")
        }
        else {
            println("not a green car urgh")
        }

    }

    fun drive(){
        println("drive...vrooom")
    }

    fun speed(minSpeed: Int, maxSpeed: Int){
        println("Max Speed is $maxSpeed and Min is $minSpeed")
    }

}