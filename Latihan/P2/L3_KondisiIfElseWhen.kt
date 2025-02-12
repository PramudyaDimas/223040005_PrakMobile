fun main() {
    val umur = 18
    if (umur >= 18) {
        println("Anda sudah dewasa")
    } else {
        println("Anda masih anak-anak")
    }

    when (umur) {
        in 0..17 -> println("Anda masih anak-anak")
        else -> println("Anda sudah dewasa")
    }
}