package com.example.mdi2_101_a3

fun main(){
    println("\n----SETS----")
    val fruits = listOf<String>("Apple","Banana","Orange","Banana")
    println(fruits)
    println("First fruit: ${fruits[0]}")
    println("Second fruit: ${fruits[1]}")

    val subjects = setOf<String>("Math","Django","Databases","Django")
    println(subjects)

    val colors = setOf<String>("Red","Green","Blue","Red")
    println("Unique colors: $colors")
    println("Total unique colors: ${colors.size}")

    //Challenge 1
    // Set is useful because automatically ignore duplicate values
    println("\n----CHALLENGE 1----")
    val hobbies = setOf<String>(
        "Basketball",
        "Video games",
        "Driving",
        "Basketball",
        "Running",
        "Reading"
    )

    println("Hobbies: $hobbies")
    println("Number of unique hobbies: ${hobbies.size}")

    //Map
    println("\n----MAPS----")
    val student = mapOf(
        "name" to "Eduardo",
        "age" to "21",
        "major" to "Software Engineering"
    )
    println(student)
    println("Student name: ${student["name"]}")
    println("Student major: ${student["major"]}")

    //Challenge 2
    println("\n----CHALLENGE 2----")
    val countries = mapOf(
        "Argentina" to "Buenos Aires",
        "Brazil" to "Brasilia",
        "Venezuela" to "Caracas",
        "Uruguay" to "Montevideo"
    )
    println("Countries and capitals: $countries")
    println("Capital of Argentina: ${countries["Argentina"]}")

    println("**Print list of countries using a loop**")
    for((country,capital) in countries){
        println("$country -> $capital")
    }

    //Challenge 3
    println("\n----CHALLENGE 3----")
    val favoriteApps = listOf("Spotify","Youtube","Instagram","Facebook","Twitch")
    val hobbies2 = setOf("Basketball","Working Out","Reading","Basketball","Running","Swimming")
    val personalInformation = mapOf(
        "Name" to "Eduardo",
        "Age" to 21,
        "City" to "Tecate",
        "Major" to "Software Engineering"
    )
    println("**Favorite Apps**")
    for(app in favoriteApps){
       println(app)
    }
    println("\n**Hobbies**")
    for(hobbie in hobbies2){
        println(hobbie)
    }
    println("Total of unique hobbies: ${hobbies2.size}")
    println("\n**Map**")
    for((key, value) in personalInformation){
        println("$key: $value")
    }

    println("\n----List types----")
    //Immutable List
    println("**Immutable lists**")
    val fruits2 = listOf<String>("Apple","Banana","Orange")
    println(fruits2)
    println("First fruit: ${fruits2[0]}")
    println("Second fruit: ${fruits2[1]}")

    //Another immutable list example
    val months = listOf<String>("January","February","March","April")
    for(month in months){
        println(month)
    }

    //Challenge 4
    println("\n----CHALLENGE 4----")
    val favoriteMovies = listOf<String>(
        "Spiderman: Across The Spider-Verse",
        "Real Steel",
        "Interstellar",
        "Avengers",
        "Migration"
    )
    println("First movie: ${favoriteMovies[0]}")
    println("Last movie: ${favoriteMovies[4]}")
    println("**Movies**")
    for(movie in favoriteMovies){
        println(movie)
    }

    println("\n**Mutable lists**")
    //Mutable example
    val cars = mutableListOf<String>(
        "Toyota",
        "Honda"
    )
    //Add items
    cars.add("Kia")
    println(cars)

    //Removing items
    cars.remove("Toyota")
    println(cars)

    //Updating items
    cars[1] = "Chevrolet"
    println(cars)

    //Challenge 5
    println("\n----CHALLENGE 5----")
    val favoriteFoods = mutableListOf<String>(
        "Hamburger",
        "Tacos",
        "Pizza"
    )
    println("Initial list: $favoriteFoods")

    //Add one more food
    favoriteFoods.add("Pozole")
    println("After adding: $favoriteFoods")

    //Remove one food
    favoriteFoods.remove("Pizza")
    println("After removing: $favoriteFoods")

    //Replace one item
    favoriteFoods[1] = "Aguachile"
    println("After updating $favoriteFoods")

    //Functions
    println("\n----Functions----")
    sayHello()
    greetUser("Humberto")
    var result = addNumbers(2,3)
    println(result)

    //Challenge 6
    println("\n----CHALLENGE 6----")
    showMovie()
    greetUser("Christian")
    result = multiply(7,7)
    println("Result of multiplication: $result")
}

fun sayHello(){
    println("Hello")
}

fun greetUser(name:String){
    println("Hello, $name")
}

fun addNumbers(a: Int, b: Int):Int {
    return a+b
}

//Challenge 6 functions
fun showMovie(){
    println("My favorite movie is Spiderman: Across the Spider-Verse")
}
fun multiply(a:Int,b:Int):Int {
    return a*b
}
