package tracker

/**
 * Класс заявки.
 * @author Vadim Bolokhov
 */
open class Item {

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

    open var id: String? = null
    open val name: String?
    open var desc: String? = null
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

class EmptyItem(val message: String) : Item() {

    companion object {
        const val EMPTY: String = "<Empty Item>"
    }

    constructor() : this("Заявки не существует")

    override var id: String? = EMPTY
    override var name: String? = EMPTY
    override var desc: String? = EMPTY

    override fun toString() = message
}