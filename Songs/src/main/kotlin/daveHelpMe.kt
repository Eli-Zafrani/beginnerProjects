// make a class called Food and a class called People and create the output:
// Eli is eating a hot dog
// Smokey is not eating chicken
// Melissa is eating burnt steak

class Food(var foodOnPlate: String, var isItBurned: Boolean) {
    fun whatYaEating(){
        if (isItBurned) print(" burnt $foodOnPlate.") else print(" $foodOnPlate.")
    }
}

class Person(val nameOfPerson: String, var areTheyEating: Boolean) {
    fun whoIsEating(){
        if (areTheyEating) print("$nameOfPerson is eating ") else print("$nameOfPerson is not eating")
    }
}


fun main(args: Array<String>) {

//    var person = arrayOf(Person("Eli", true), Person("Smokey", !true), Person("Melissa", true))
//    var food = arrayOf(Food("Hotdog", false), Food("Chicken", false), Food("steak", true))

    val eli = Person("Eli", true)
    val food1 = Food("hotdog", true)
}