interface VehicleFactory {
    fun createVehicle(type: String): Any?
}

class AircraftFactory : VehicleFactory {
    override fun createVehicle(type: String): Aircraft? {
        return when (type) {
            "Boeing737" -> Boeing737()
            "Boeing777" -> Boeing777()
            else -> null
        }
    }
}

class CarFactory : VehicleFactory {
    override fun createVehicle(type: String): Car? {
        return when (type) {
            "Audi" -> Audi()
            "Maserati" -> Maserati()
            else -> null
        }
    }
}