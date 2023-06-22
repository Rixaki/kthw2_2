fun main(args: Array<String>) {
    var likes: Int = 1
    var enumToString: String = "человекам"
    if ((likes % 10 == 1) && (likes/10 != 1)) {
        enumToString = "человеку"
    }

    println("Понравилось $likes $enumToString")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
}