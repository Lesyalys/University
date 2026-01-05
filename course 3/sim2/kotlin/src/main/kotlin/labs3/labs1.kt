//Базовый класс – учащийся. Производные – школьник и студент. Создать класс Конференция, который может
//содержать оба вида учащихся. Предусмотреть метод подсчета участников конференции отдельно по
//школьникам и по студентам (использовать оператор is).

package labs3

open class Study {
    open var names = "Study";
    open fun getType(): String = "Study"
}
class School : Study() {
    override fun getType(): String = "School"
}
class Student : Study() {
    override fun getType(): String = "Student"
}

class Conference(private val types: List<Study>) {

    fun countStudy(){
        var countSc = types.count{it is School}
        var countSt = types.count{it is Student}

        println("countSc $countSc | countSt $countSt")
    }
}

fun main(){
    var array = listOf(School(), Student())
    var Conference = Conference(array)

    println(Conference.countStudy())
}