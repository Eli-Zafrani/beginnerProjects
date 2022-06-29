


    class Song(val title: String, val artist: String, genre_param: String){
        fun play(){
            println("Playing the song $title by $artist")
        }
        fun stop(){
            println("Stopped playing $title")
        }
        // initializer blocks are executed when the object is initialized, immediately after teh constructor is called, and theyre prefexed with init keyword
        init {
            println("Song $title has been created")
        }

        init {
            println("$artist is the artist.")
        }

        var genre = genre_param.uppercase()

        init {
            println("the genre is $genre.")
        }

//
        var isItLyrical: Boolean? = null

    }





    fun main(args: Array<String>) {
                    // Song(this is the constructor -- a constructor instantiates an object when)
                    // Song(it runs. it's used to define properties and initialize them)
                    // a property is a variable thats local to the object
                // an object is sometimes called an instance of a class, so its properties are called instance variables
        val songOne = Song("Live Free", "Mac Miller", "Rap")
        val songTwo = Song("I Blame The World", "Sasha Sloan","Indie")
        val songThree = Song("Thor's Hammer", "Ski Mask The Slump God", "Rap")
        songTwo.play()
        songTwo.stop()
        songOne.play()
        println(songOne.isItLyrical)


}
