fun main(args: Array<String>) {
    println("Hello world");

    var x = 1

    while (x < 3) {
        print(if (x == 1) "Yab" else "Dab")
        print("ba")
        x += 1
    }
    if (x == 3) print("Do")
}

fun echo(name: String): String {
    return "Echo, echo, echo : $name"
}