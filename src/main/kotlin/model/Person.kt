package model

open class Person(
    private var name: String,
    private var age: Int
) {

    // access modifier: Pham vi truy cap

    // Getter va setter
//    var height: Float = 0f
//        set(value) {
//            field = value + 1
//        }
//
//        get() {
//            return field - 3
//        }

    // getter va setter
//    fun getName(): String {
//        return name
//    }
//
//    fun setName(name: String) {
//        this.name = name
//    }
//
//    fun getAge(): Int {
//        return age
//    }
//
//    fun setAge(age: Int) {
//        this.age = age
//    }
//
//    fun getAddress(): String? {
//        return address
//    }
//
//    fun setAddress(address: String) {
//        this.address = address
//    }


    // Thuoc tinh
    // var name: String = ""
    // var age: Int = 0

    // Phuong thuc khoi tao (constructor)
    // De rang buoc cac tham so cho viec khoi tao

    // Second constructor

//    var height: Float = 0f
//
//    constructor(
//        name: String,
//        age: Int,
//        address: String?,
//        height: Float,
//    ): this(name, age, address) {
//        this.height = height
//    }

    // Tham trị: Khi truyền dữ liệu chỉ truyền giá trị
    // Sử dụng kiêu dữ liệu nguyên thuỷ: String, Boolean, Int, Float..

    // Example:
    // var a = 5
    // var b = a
    // Khi a gán cho b, a chỉ gán phần giá trị

    // Tham chiếu: Khi truyền dữ liệu sẽ truyền địa chỉ
    // Sử dụng kiểu Object

    // Example:
    // var teo = Person()
    // var ti = teo
    // Khi teo gán cho ti, teo gán phần địa chỉ cho ti
    // => teo va ti cùng 1 địa chỉ

    // Hanh vi

    open fun printInfo() {
        println("Name: $name")
        println("Age: $age")
    }


    fun printSomething() {
        println("Something 1")
    }

    fun printSomething(work: String) {
        println(work)
    }
}