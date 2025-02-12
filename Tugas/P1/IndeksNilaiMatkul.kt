class IndeksNilaiMatkul {
    fun hitungIndeks(nilai: Int): String {
        return when (nilai) {
            in 80..100 -> "A"
            in 70..79 -> "AB"
            in 60..69 -> "B"
            in 50..59 -> "BC"
            in 40..49 -> "C"
            in 30..39 -> "D"
            in 0..29 -> "E"
            else -> "Nilai di luar jangkauan"
        }
    }
}

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Nilai harus diisi")
        return
    }

    val nilai = args[0].toIntOrNull()

    if (nilai == null) {
        println("Input harus berupa angka")
        return
    }

    val indeksNilaiMatkul = IndeksNilaiMatkul()
    val indeks = indeksNilaiMatkul.hitungIndeks(nilai)

    println("Input: $nilai")
    println("Output: $indeks")
}