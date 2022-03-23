interface Car : Vehicle {
    fun drive();
}

class Audi : Car {
    override fun drive() {
        println("Drive Audi!")
    }

    override fun showVehicleDomain() {
        println("TYPE: GROUND")
    }
}

class Maserati : Car {
    override fun drive() {
        println("Drive Maserati!")
    }

    override fun showVehicleDomain() {
        println("TYPE: GROUND")
    }
}

//class CarFactory {
//    fun create(type: String): Car? {
//        return when (type) {
//            "Audi" -> Audi()
//            "Maserati" -> Maserati()
//            else -> null
//        }
//    }
//}
