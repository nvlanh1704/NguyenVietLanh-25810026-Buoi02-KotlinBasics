// Nguyen Viet Lanh - 25810026

fun main() {
    val canNang: Double = 78.0
    val chieuCao: Double = 1.69

    val bmi: Double = canNang / (chieuCao * chieuCao)

    val phanLoai: String

    if (bmi < 18.5) {
        phanLoai = "Gầy"
    } else if (bmi < 25.0) {
        phanLoai = "Bình thường"
    } else if (bmi < 30.0) {
        phanLoai = "Thừa cân"
    } else {
        phanLoai = "Béo phì"
    }

    println("Chỉ số BMI: $bmi")
    println("Phân loại: $phanLoai")
}
