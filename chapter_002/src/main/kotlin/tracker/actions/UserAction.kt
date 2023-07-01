package tracker.actions

import tracker.Input
import tracker.Tracker

interface UserAction {

    val key: Int
    val info: String
    val execute: (input: Input, tracker: Tracker) -> Unit
}
