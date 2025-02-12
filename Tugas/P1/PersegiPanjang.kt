class PersegiPanjang {
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    fun hitungKeliling(panjang: Int, lebar: Int): Int {
        return 2 * (panjang + lebar)
    }
}

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Usage: java PersegiPanjang <panjang> <lebar>")
        return
    }

    val panjang = args[0].toInt()
    val lebar = args[1].toInt()

    val persegiPanjang = PersegiPanjang()
    val luas = persegiPanjang.hitungLuas(panjang, lebar)
    val keliling = persegiPanjang.hitungKeliling(panjang, lebar)

    println("Panjang: $panjang")
    println("Lebar: $lebar")
    println("Luas: $luas")
    println("Keliling: $keliling")
}