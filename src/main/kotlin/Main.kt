import model.Person

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

        3: Câu điều kiện (if else)

         Biểu thức so sánh trả về giá trị kiểu Boolean
         1. Lớn hơn: a > b
         2. Bé hơn: a < b
         3. Bằng hơn: a == b
         4. Lớn hơn bằng: a >= b <=>(a > b || a == b)
         5. Bé hơn bằng: a <= b <=>(a < b || a == b)

         Toán tử logic
         1. && Thoả tất cả điều kiện mới trả về true
         2. || Tất cả điều kiện là false thì mới trả về false
         3. ! Phủ định của điều kiện

        val a = 5
        val b = 10

        if (a > b) {
            print("A lon hon B")
        } else if (a < b) {
            print("A be hon B")
        } else {
            print("A bang B")
        }

         Vi du: Tính chỉ số BMI

        val height = 1.75f // Đơn vị tính là m
        val weight = 70.5f // Đơn vị tính là kg
        val bmi = (weight / (height * height))

         Output: Thuộc phân loại nào
         Code convention
         https://en.wikipedia.org/wiki/List_of_Unicode_characters
         if (bmi < 18.5) {
            println("Cân nặng thấp (gầy)")
         } else if (bmi <= 24.9) {
            println("Bình thường")
         } else if (bmi <= 29.9) {
            println("Tiền béo phì \u01C0")
        }

        Toan tu 3 ngoi
        val message = if (bmi < 18.5) {
            "Cân nặng thấp (gầy)"
        } else if (bmi <= 24.9) {
            "Bình thường"
        } else {
            "Khong xac dinh"
        }

        4: Câu điều kiện (when giống với switch case)
        val month = 3
        val message = when (month) {
            in 1..3 -> {
               "Quy 1"
            }
            in 4..6 -> {
                "Quy 2"
            }
            in 7..9 -> {
                "Quy 3"
            }
            in 10..12 -> {
                "Quy 4"
            }
            else ->"Khong xac dinh"
        }

        5: Vòng lặp for (Duyệt dữ liệu trong 1 khoảng nào đó)
         for (value in 100 downTo 1) {
             1: Chỉ in ra số chẳn
             Solution: Số chia hết cho 2
             if (value % 2 == 0) {
                println(value)
            }

             2: Chỉ in ra số lẻ
             if (value % 2 == 1) {
                println(value)
            }

             3: Chỉ in ra số chia 3 dư 1
             if (value % 3 == 1) {
                println(value)
             }

             println(value)
        }

        Kiểm tra số nguyên tố
        var number = 408
        var isPrime = true

        if (number < 2) {
            println("Khong phai la so nguyen to")
        } else {
            for (value in 2 ..< number) {
                if (number % value == 0) {
                    // Uoc thu 3 xuat hien
                    isPrime = false
                }
            }

            if (isPrime) {
                println("La so nguyen to")
            } else {
                println("Khong phai la so nguyen to")
            }
        }

        6: Ham lap while
        var index = 0
        while (index <= 10) {
            in tat ca cac so so
            chi bo qua neu index = 2
            val tmpIndex = index
            index += 1
            if (tmpIndex == 2) {
                continue
            }
            println(tmpIndex)
        }

        Chuyen sang for
        for (value in 0..10) {
            if (value == 2) continue
            println(value)
        }
     */

    // Class va object (instance)
    // Coi thêm giải thích về Solid

    // Khoi tao object
    var teo: Person = Person()
    teo.name = "Nguyen Van Teo"
    teo.age = 3
}
