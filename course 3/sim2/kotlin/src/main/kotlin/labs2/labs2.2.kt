//11. Дан целочисленный массив с количеством элементов n. Напечатать те его элементы, индексы которых являются
//степенями двойки
package labs2

import kotlin.random.Random

fun main(){
    try {
        var n = readln().toInt();
        var arr = IntArray(n, { Random.nextInt(1,5)})
        var result = arr.filter {  arr[it] % 2 == 0 }
        println("n: $n | arr: $arr | result: $result")
    } catch(e:Exception){
        println("ERROR! $e");
    }
}