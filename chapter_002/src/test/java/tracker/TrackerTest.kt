package tracker

import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertNull

internal class TrackerTest {

    @Test
    fun whenAddNewItemThenTrackerHasSameItem() {
        val tracker = Tracker()
        val item = createItem()

        tracker.add(item)

        tracker.getAll().let {
            assertEquals(1, it.size)
            assertEquals(item, it[0])
        }
    }

    @Test
    fun whenDeleteItemThenTrackerHasNoSameItem() {
        val item = createItem()
        val tracker = Tracker().also { it.add(item) }
        val id = tracker.getAll().first().id

        tracker.delete(id!!)

        assertEquals(0, tracker.getAll().size)
    }

    @Test
    fun whenFindByIdUnexistingItemThenReturnNull() {
        val tracker = Tracker()

        assertNull(tracker.findById("test"))
    }

    @Test
    fun whenReplaceItemThenItemIsReplaced() {
        with (Tracker().also { it.add(createItem()) }) {
            val replace = createItem(456)
            val itemId = getAll()[0].id

            replace(itemId!!, replace)

            assertEquals(replace, getAll()[0])
        }
    }

    @Test
    fun whenGetAllItemsThenReturnAllItems() {
        val item1 = createItem(123)
        val item2 = createItem(456)
        val tracker = Tracker().apply {
            add(item1)
            add(item2)
        }
        val expected = arrayOf(item1, item2)

        val result = tracker.getAll()

        assertContentEquals(expected, result)
    }

    @Test
    fun whenFindByNameExistingItemThenReturnItem() {
        val item = createItem()
        val tracker = Tracker().apply { add(item) }

        val result = tracker.findByName("test1")[0]

        assertEquals(item, result)
    }

    @Test
    fun whenFindByNameUnexistingItemThenReturnEmptyArray() {
        val item = createItem()
        val tracker = Tracker().apply { add(item) }

        val result = tracker.findByName("test2")

        assertEquals(0, result.size)
    }

    private fun createItem(): Item = createItem(123)

    private fun createItem(created: Long): Item = Item("test1", "testDescription", created)
}