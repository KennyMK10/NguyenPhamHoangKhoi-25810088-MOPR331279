//Nguyễn Phạm Hoàng Khôi - 25810088
fun main() {
    val diem = arrayOf(
        8.5, 7.0, 9.0, 6.5, 8.0,
        5.5, 9.5, 7.5, 6.0, 10.0
    )

    var tongDiem: Double = 0.0

    for (i in diem.indices) {
        tongDiem += diem[i]
    }

    val diemTrungBinh = tongDiem / diem.size

    var diemCaoNhat = diem[0]
    var diemThapNhat = diem[0]

    for (i in diem.indices) {
        if (diem[i] > diemCaoNhat) {
            diemCaoNhat = diem[i]
        }

        if (diem[i] < diemThapNhat) {
            diemThapNhat = diem[i]
        }
    }

    println("Điểm trung bình: $diemTrungBinh")
    println("Điểm cao nhất: $diemCaoNhat")
    println("Điểm thấp nhất: $diemThapNhat")
}
