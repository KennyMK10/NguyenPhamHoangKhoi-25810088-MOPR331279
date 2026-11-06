//Nguyễn Phạm Hoàng Khôi - 25810088
fun main() {
    val canNang: Double = 80.0
    val chieuCao: Double = 1.85

    val bmi: Double = canNang / (chieuCao * chieuCao)

    if (bmi < 18.5) {
        println("Phân loại: Gầy")
    } else if (bmi < 23.0) {
        println("Phân loại: Bình thường")
    } else if (bmi < 25.0) {
        println("Phân loại: Thừa cân")
    } else {
        println("Phân loại: Béo phì")
    }

    println("Chỉ số BMI: $bmi")
}