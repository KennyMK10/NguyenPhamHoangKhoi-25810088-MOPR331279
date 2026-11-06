//Nguyễn Phạm Hoàng Khôi - 25810088
fun main() {
    val danhSachSach = mutableListOf(
        "Lập trình Kotlin",
        "Cơ sở dữ liệu",
        "Lập trình Java"
    )

    println("Danh sách sách ban đầu:")
    println(danhSachSach)

    danhSachSach.add("Lập trình Python")
    danhSachSach.add("Cấu trúc dữ liệu")

    danhSachSach.remove("Cơ sở dữ liệu")

    danhSachSach.sort()

    println("Danh sách sách sau khi xử lý:")
    println(danhSachSach)
}