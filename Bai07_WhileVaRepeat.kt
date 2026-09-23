// Nguyen Viet Lanh - 25810026

fun main() {

    // Dùng while khi chưa chính xác số lần lặp,
    // còn repeat phù hợp khi biết lần lặp cố định.

    var so = 10

    while (so >= 1) {
        println(so)
        so--
    }

    println("-----")

    repeat(5) {
        println("cố định năm lần liên tiếp")
    }
}
