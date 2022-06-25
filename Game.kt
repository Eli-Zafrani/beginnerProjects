fun main(args: Array<String>) {

    val options = arrayOf("Rock", "Paper", "Scissors")

    val gameChoice= getGameChoice(options)

    val userChoice = getUserChoice(options)
    printResults(userChoice, gameChoice.toString())


}
// functions are made with parameters. when theyre called, u pass the arguments (values)
// parameters go in the parenthesis after a function, like this fun getChoice(num: Int, word: String) -- when a function is called, an argument is used getChoice(3, "lol")
fun getGameChoice(optionsParam: Array<String>) {
    optionsParam[(Math.random() * optionsParam.size).toInt()]

}


fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    //Loop until the user enters a valid choice
    while (!isValidChoice) { // keep looping until isValidChoice is true - while isValidChoice is not true (False) is what the ! means
        // ask for choice
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        // read the user input
        val userInput = readLine()
        // validate the user input
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        // if the choice is invalid, inform the user
        if(!isValidChoice) println("You must enter a valid choice")

    }
    return userChoice

}


fun printResults(userChoice: String, gameChoice: String){
    val result: String
    // figure out the result
    if (userChoice == gameChoice) result = "Tie!"
    else if (
        (userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")) result = "You Win!"

    else result = "You Lose!"

    // print the result
    println("you chose $userChoice. I chose $gameChoice. $result")
}