fun main() {
    var soTruoc: Int = 0
    var soHienTai: Int = 1

    for (i in 0..100) {

        if (soTruoc >= 100) {
            break
        }

        println("Vị trí $i: $soTruoc")

        val soTiepTheo: Int = soTruoc + soHienTai

        soTruoc = soHienTai
        soHienTai = soTiepTheo
    }
}