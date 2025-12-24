//. Дано натуральное число N. Найти и вывести все числа в интервале от 1 до N–1, у которых сумма всех
//цифр совпадает с произведением цифр данного числа. Если таких чисел нет, то вывести слово «нет».
//Пример. N = 32. Числа: 24, 15, 6.
package labs1
import kotlin.collections.mutableListOf

fun selectNumber(N: String): String {
    val foundNumbers = mutableListOf<Int>()
    val product = N.fold(1){acc,c -> acc * c.digitToInt()}
    for (i in 1 until N.toInt()){
        var sum =0
        var temp = i

        while (temp > 0){
            sum += temp % 10
            temp /= 10
        }
        if(sum == product){
            foundNumbers.add(i)
        }
    }
    return if (foundNumbers.isEmpty()) "No" else foundNumbers.joinToString(",")
}

fun main(){
    try{
        val N = readln()
        val product = N.fold(1){acc,c -> acc * c.digitToInt()}
        val res =selectNumber(N)
        print("N = $N | proiz: $product | number: $res")
    } catch (e:Exception){
        println("ERROR!: $e")
    }

}
