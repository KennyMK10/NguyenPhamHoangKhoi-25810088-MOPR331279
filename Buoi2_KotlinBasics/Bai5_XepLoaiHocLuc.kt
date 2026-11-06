//Nguyễn Phạm Hoàng Khôi - 25810088
fun main() {
    val diem: Double = 8.7

    val xepLoai = when {
        diem in 8.5..10.0 -> "Xuất sắc"
        diem in 8.0..<8.5 -> "Giỏi"
        diem in 6.5..<8.0 -> "Khá"
        diem in 5.0..<6.5 -> "Trung bình"
        diem in 0.0..<5.0 -> "Yếu"
        else -> "Điểm không hợp lệ"
    }

    println("Điểm trung bình: $diem")
    println("Xếp loại học lực: $xepLoai")
}