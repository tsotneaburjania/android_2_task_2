fun main(args: Array<String>) {
    val aircraftFactory = AircraftFactory()
    val carFactory = CarFactory();

    val aircraft = aircraftFactory.createVehicle("Boeing737")
    aircraft?.showVehicleDomain()
    aircraft?.fly()

    val car = carFactory.createVehicle("Audi")
    aircraft?.showVehicleDomain()
    car?.drive()
}