interface Aircraft : Vehicle {
    fun fly()
}

class Boeing737 : Aircraft {


    override fun showVehicleDomain() {
        println("TYPE: AERIAL")
    }

    override fun fly() {
        println("Fly Boeing737!")
    }
}

class Boeing777 : Aircraft {
    override fun fly() {
        println("Fly Boeing777!")
    }

    override fun showVehicleDomain() {
        println("TYPE: AERIAL")
    }
}

//class AircraftFactory {
//    fun create(type: String): Vehicle? {
//        return when (type) {
//            "Boeing737" -> Boeing737()
//            "Boeing777" -> Boeing777()
//            else -> null
//        }
//    }
//}