fun xuLyTenKhachHang(tenKhachHang: String?) {

    val doDai: Int? = tenKhachHang?.length

    println("Độ dài tên: $doDai")

    val tenHienThi: String = tenKhachHang ?: "Khách vãng lai"

    println("Tên khách hàng: $tenHienThi")

    val tenChacChan: String? = "Nguyễn Văn An"

    val doDaiTen: Int = tenChacChan!!.length

    println("Độ dài tên chắc chắn: $doDaiTen")
}

fun main() {
    println("=== Khách hàng có tên ===")
    xuLyTenKhachHang("Nguyễn Văn An")

    println("=== Khách hàng không có tên ===")
    xuLyTenKhachHang(null)
}