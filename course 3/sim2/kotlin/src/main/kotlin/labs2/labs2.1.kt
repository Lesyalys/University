//1. Дан массив. Удалить из него нули и после каждого числа, оканчивающего на 5, вставить 1.
package labs2
import kotlin.random.Random

fun main(){
    var array = IntArray(10, { Random.nextInt(1, 6) });
    var result = array
        .filter { it != 0 }
        .map { if(it == 5) "51" else it }
    println("result: $result")
}