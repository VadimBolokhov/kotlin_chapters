package tracker

import java.util.StringJoiner

/**
 * Класс заявки.
 * @author Vadim Bolokhov
 */
class Item {

    constructor() : this(desc = "Default Item", name = "Default description", created = System.currentTimeMillis()) {
    }

    constructor(name: String, desc: String) {
        this.name = name
        this.desc = desc
    }

    constructor(name: String, desc: String, created: Long) {
        this.name = name
        this.desc = desc
        this.created = created
    }

    var id: String? = null
    val name: String?
    private var desc: String? = null
    private var created: Long = 0L
    private val comments: List<String> = listOf()

    override fun toString(): String {
        return """
            Name: $name
            Description: $desc
            id: $id
        """.trimIndent()
    }
}