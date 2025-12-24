//1. Написать программу, выясняющую кол-во четных цифр во введенном пользователем числ
package labs1
fun main() {
    try {
        val number = readln()
        val counter = number.count(){ it.digitToInt() % 2 == 0 }
        println("your number is $number | Count $counter" )
    } catch (e: Exception) {
        println("ERROR!: $e");
    }
}