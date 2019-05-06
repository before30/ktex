package cc.before30.ktex.demo

data class Person(val name: String,
                  val age: Int?= null)

fun main(args: Array<String>) {

    val person = listOf<Person>(Person("영희"),
            Person("철수", age = 29))
    val oldest = person.maxBy { it.age ?: 0 }
    println("Oldest is : $oldest")
}