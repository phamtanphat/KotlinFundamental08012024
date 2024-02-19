package model

class PizzaMeat: Pizza() {
    override fun prepare() {
        println("PizzaMeat prepare")
    }

    override fun bake() {
        println("PizzaMeat bake")
    }

    override fun cut() {
        println("PizzaMeat cut")
    }

    override fun box() {
        println("PizzaMeat box")
    }
}
