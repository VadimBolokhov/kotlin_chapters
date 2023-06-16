package professions

/**
 * Профессия.
 * @author Vadim Bolokhov
 */
open class Profession constructor(_name: String, _profession: String) {
    val name: String
    val profession: String

    init {
        name = _name
        profession = _profession
    }
}

class Doctor(name: String): Profession(name, "Доктор") {

    fun heal(patient: Patient): Diagnosis {
        return Diagnosis(this, patient)
    }
}

class Teacher(name: String) : Profession(name, "Учитель") {

    fun teach(student: Student) {}
}

class Engineer : Profession {

    constructor(name: String) : super(name, "Инженер") {
        // инициализация полей, если требуется
    }

    fun build(house: House) {}
}