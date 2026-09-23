// Nguyen Viet Lanh - 25810026

fun main() {
    val soLuong: Int = 5
    val donGia: Double = 100000.0

    val tienHang: Double = soLuong * donGia

    val thue: Double = tienHang * 0.08
    val tongTien: Double = tienHang + thue

    println("Tiền hàng: $tienHang ")
    println("Thuế 8%: $thue ")
    println("Tổng tiền phải trả: $tongTien")
}
