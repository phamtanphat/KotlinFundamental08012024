package model

class Parent(
    name: String,
    age: Int,
    var work: String
): Person(name, age) {

}