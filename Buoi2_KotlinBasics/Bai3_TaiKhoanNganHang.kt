fun main() {
    val soDuBanDau: Int = 5000000
    
    println("Số dư ban đầu: $soDuBanDau VND")

    var soDuHienTai: Int = soDuBanDau

    soDuHienTai = soDuHienTai + 2000000

    println("Số dư sau khi gửi tiền: $soDuHienTai VND")

    soDuHienTai = soDuHienTai - 1500000

    println("Số dư sau khi rút tiền: $soDuHienTai VND")
}