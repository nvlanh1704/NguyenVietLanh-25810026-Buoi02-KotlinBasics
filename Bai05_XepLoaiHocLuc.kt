// Nguyen Viet Lanh - 25810026

fun main() {
    val diem: Double = 7.55

    val xepLoai = when (diem) {
        in 9.0..10.0 -> "Xuất sắc"
        in 8.0..8.99 -> "Giỏi"
        in 6.5..7.99 -> "Khá"
        in 5.0..6.49 -> "Trung bình"
        in 0.0..4.99 -> "Yếu"
        else -> "Điểm không hợp lệ"
    }

    println("Điểm: $diem")
    println("Xếp loại: $xepLoai")
}
