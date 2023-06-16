package professions

import java.util.*

class Diagnosis(val doctor: Doctor, val patient: Patient) {

    override fun toString(): String {
        return StringJoiner(" ")
            .add("Доктор")
            .add(doctor.name)
            .add("лечит пациента по имени")
            .add(patient.name)
            .toString()
    }
}