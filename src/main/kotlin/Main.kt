

fun main() {
    greatPerson("Rebecca")
    var c=(12%5)
    println(c)
    var t=(10+10+10+10)
    println(t)
    interestingFact(fact = "I love reading books")
}
fun greatPerson( name: String){
    println("Hello $name" )
}

fun remainder(num1:Int, num2:Int):Int{
    var remainder = num1 % num2
    return remainder

}
fun addition(num1:Int, num2:Int, num3:Int, num4:Int):Int{
    var addition = num1+num2+num3+num4
    return addition
}
fun interestingFact(fact :String){
    println("I love reading books")
}


