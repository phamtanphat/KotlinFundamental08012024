package model

class Person(
    var name: String,
    var age: Int,
    var address: String? = null
) {
    // Thuoc tinh
    // var name: String = ""
    // var age: Int = 0

    // Phuong thuc khoi tao (constructor)
    // De rang buoc cac tham so cho viec khoi tao

    // Second constructor

    var height: Float = 0f

    constructor(
        name: String,
        age: Int,
        address: String?,
        height: Float,
    ): this(name, age, address) {
        this.height = height
    }

    // Tham tri: Khi truyền dữ liệu chỉ truyền giá trị
    // Tham chieu: Khi truyền dữ liệu sẽ truyền địa chỉ

    // Hanh vi

}