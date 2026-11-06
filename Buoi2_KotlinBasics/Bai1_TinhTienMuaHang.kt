fun main() {
    val soLuong: Int = 5
    val donGia: Double = 10000.0

    val soLuongDouble: Double = soLuong.toDouble()

    val tienHang: Double = soLuongDouble * donGia

    val tienThue: Double = tienHang * 0.08

    val tongTien: Double = tienHang + tienThue

    println("Số lượng sản phẩm: $soLuong")
    println("Đơn giá: $donGia VND")
    println("Tiền hàng: $tienHang VND")
    println("Thuế VAT (8%): $tienThue VND")
    println("Tổng số tiền phải trả: $tongTien VND")
}