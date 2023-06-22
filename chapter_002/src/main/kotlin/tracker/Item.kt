package tracker

/**
 * Класс заявки.
 * @author Vadim Bolokhov
 */
class Item {

    constructor() : this(desc = "Default Item", name = "Default description", created = System.currentTimeMillis()) {
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

}