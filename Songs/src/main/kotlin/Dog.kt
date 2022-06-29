fun main(args: Array<String>) {

    // use classes to create a template for objects u will create that consist of its properties and functions
//                      these are the properties of the class
    class Dog (val name: String,
               var weight_param: Int,
               val breed: String) {
        // a function defined in a class is a called a member function, sometimes called a method.
        fun bark() {
            println(if (weight < 20) "Yip!" else "Woof!")
        }
        // create a  setter -- first move weight property from constructor to the class body
        // to do this, make weight = weight param. now setter will make sure weight is > 0
        var weight = weight_param
        set(value) { // use field instead of weight=value, or u will be stuck in infinite loop of updating property and setter being called infinitely
            if (value > 0) field = value
        }
        // this is a getter that will return the dogs weight in kilograms ... new property added called weightInKgs, w/ custom getter
        val weightInKgs: Double
            get() = weight / 2.2

        init {
            println("Dog $name has been set")
        }

        var activities = arrayOf("Walks")

    }




    // use a dog class to create a dog object
    var myDog = Dog("Smokey", 62, "Mixed")
    println("${myDog.name} weighs approximately ${myDog.weight} pounds and is a ${myDog.breed} breed")

    // update property like this
    myDog.weight = 60
    println("${myDog.name} weighs approximately ${myDog.weight} pounds and is a ${myDog.breed} breed")
    // use . operator to call an objects functions like this:
    myDog.bark()

    // want an array of dogs? do this
    var dogs = arrayOf(Dog("Fido", 12, "Pug"), Dog("Rex", 75, "German Shepherd"))
    // ACCESS dogs in an array like this
    dogs[0].weight = 18
    dogs[0].bark()
    println("Smokeys weight in pounds is ${myDog.weight} and in KGs is ${myDog.weightInKgs}")
    println("weight for ${dogs[1].name} is ${dogs[1].weight} pounds or ${dogs[1].weightInKgs} kgs")

    myDog.activities = arrayOf("Walks", "Fetching Balls", "Frisbee")
    for (item in myDog.activities){
        println("${myDog.name} enjoys $item")
    }


}