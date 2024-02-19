package model

class PizzaStore {

    fun orderPizza(pizza: Pizza) {
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
    }
}