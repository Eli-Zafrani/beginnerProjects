// make a drumkit class that prints the following output
// "ding ding ba-da-bing!
// bang bang bang!
// "ding ding ba-da-bing!

class DrumKit(var hasTopHat: Boolean, var hasSnare: Boolean){

    fun playTopHat() {
        if (hasTopHat) println("ding ding ba-da-bing!")
    }
    fun playSnare() {
        if (hasSnare) println("bang bang bang!")
    }

}

// code challenge - create this output
// rectangle 0 has area 15. it is not a square
// rectangle 1 has area 36. it is a square
// rectnagle 2 has area 63. it is not a square
// rectangle 3 has area 96. it is not a square

class Rectangle(var width: Int,
                var height: Int){
    val isSquare: Boolean
    get() = (width == height)

    val area: Int
    get() = (width * height)
}

//my own challenge -- create this output
// make a class called Food and a class called People and create the output:
// Eli is eating a hot dog
// Smokey is not eating chicken
// Melissa is eating burnt steak
//class Food(var foodOnPlate: String, var isItBurned: Boolean) {
//    fun whatYaEating(){
//        if (isItBurned) print(" burnt $foodOnPlate.") else print(" $foodOnPlate.")
//    }
//}
//
//class Person(val nameOfPerson: String, var areTheyEating: Boolean) {
//    fun whoIsEating(){
//        if (areTheyEating) print("$nameOfPerson is eating ") else print("$nameOfPerson is not eating")
//    }
//}


fun main(args: Array<String>) {

//    var person = arrayOf(Person("Eli", true), Person("Smokey", !true), Person("Melissa", true))
//    var food = arrayOf(Food("Hotdog", false), Food("Chicken", false), Food("steak", true))
//
//        val eli = Person("Eli", true)
//        val food1 = Food("hotdog", true)
//




    val r = arrayOf(Rectangle(1, 1), Rectangle(1,1),
                    Rectangle(1, 1), Rectangle(1,1))
    for (x in 0..3) {
        r[x].width = (x + 1) * 3
        r[x].height = x + 5
        print("Rectangle $x has area ${r[x].area}.")
        if (r[x].isSquare){
            println(" it is a square")
        } else {
            println(" it is not a square")
        }

        }


    val d = DrumKit(true,true)
        d.playTopHat()
        d.playSnare()
        d.hasSnare = false
        d.playTopHat()
        d.playSnare()

}