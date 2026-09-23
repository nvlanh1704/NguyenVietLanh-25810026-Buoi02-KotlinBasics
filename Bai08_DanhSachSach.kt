// Nguyen Viet Lanh - 25810026


fun main() {

    val danhSachSach = mutableListOf(
        "Doraemon",
        "Conan",
        "One Piece",
        "Bảy Viên Ngọc Rồng",
        "Marvel"
    )

    println("Danh sách ban đầu:")
    println(danhSachSach)

    // Thêm 2 cuốn sách
    danhSachSach.add("Dc")
    danhSachSach.add("Đấu La Đại Lục")

    // Xóa một cuốn sách theo tên
    danhSachSach.remove("Doraemon")

    // Sắp xếp theo thứ tự chữ cái
    danhSachSach.sort()

    println()
    println("Danh sách sau khi xử lý:")
    println(danhSachSach)
}
