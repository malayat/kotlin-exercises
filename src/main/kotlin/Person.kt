/**
 * Created by alejo on 30/03/17.
 */
class Person(val nombre: String, val edad: Int) {

    val esMayorDeEdad : Boolean
//    get() {
//        return edad >= 18
//    }
    get() = edad >= 18
}