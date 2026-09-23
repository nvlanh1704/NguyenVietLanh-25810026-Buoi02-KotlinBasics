// Nguyen Viet Lanh - 25810026

fun main() {
    val soDuBanDau: Double = 5000000.0

    // Dùng var vì số dư hiện tại sẽ thay đổi
    var soDuHienTai: Double = soDuBanDau

    soDuHienTai += 2000000.0

    println("Sau khi gửi 2 triệu: $soDuHienTai VND")

    soDuHienTai -= 1500000.0

    println("Sau khi rút 1,5 triệu: $soDuHienTai VND")

    println("Số dư ban đầu: $soDuBanDau VND")
}
