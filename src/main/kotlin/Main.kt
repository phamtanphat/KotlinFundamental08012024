fun main() {
    /*
         1: Khai báo biến
         Từ khoá khai báo biến: var , val

         var: sử dụng cho biến có thể thay đổi giá trị (mutable)
         var name: String = "Phạm Tấn Phát"
         name = "Phạm Tấn Phát Dạy Android"

         val: sử dụng cho biến không được gán lại giá trị (immutable)
         val phone: String = "0352408366"
         phone = "abc"

         Phương thức in
         print(name)

        2: Kiểu dữ liệu
        Basic type: Kiểu dữ liệu cơ bản
        Reference type: Kiêu dữ liệu vùng nhớ

        var name: String = "Phạm Tấn Phát"
        var age: Int = 29
        var height: Float = 1.75f
        var weight: Double = 70.5
        var isMale: Boolean = true

        Quy tắc đặt tên
        1:Camelcase (Biến, phương thức):
           a.Nếu == 1 từ: name, age, address
           b.Nếu >= 2 từ: doSomething, displayMap, makeDisplayOnView
        2.Pascalcase (Class và tên File): Person, Animal, CategoryClass, UserClass
        3.Underscore (file thuộc web hoặc backend): refresh_token, button_navigate

        3: Câu điều kiện

     */
    // Biểu thức so sánh trả về giá trị kiểu Boolean
    // 1. Lớn hơn: a > b
    // 2. Bé hơn: a < b
    // 3. Bằng hơn: a == b
    // 4. Lớn hơn bằng: a >= b <=>(a > b || a == b)
    // 5. Bé hơn bằng: a <= b <=>(a < b || a == b)

    // Toán tử logic
    // 1. && Thoả tất cả điều kiện mới trả về true
    // 2. || Tất cả điều kiện là false thì mới trả về false
    // 3. ! Phủ định của điều kiện

    val a = 5
    val b = 10

    if (a > b) {
        print("A lon hon B")
    } else if (a < b) {
        print("A be hon B")
    } else {
        print("A bang B")
    }

}
