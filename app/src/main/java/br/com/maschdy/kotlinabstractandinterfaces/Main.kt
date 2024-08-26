package br.com.maschdy.kotlinabstractandinterfaces

import br.com.maschdy.kotlinabstractandinterfaces.models.interfaces.VehicleInterface

fun main() {
    val factory = VehicleFactory()
    val vehicleList = mutableListOf<VehicleInterface>()

    val car = factory.createAnVehicleFromInterface(VehicleType.CAR, "Corsa", 2)
    val motorcycle = factory.createAnVehicleFromInterface(VehicleType.MOTORCYCLE, "Ducati", 5)

    vehicleList.add(car)
    vehicleList.add(motorcycle)

    vehicleList.forEach {
        it.incrementVelocity()

        println("Veículo ${it.model} está com a velocidade de ${it.actualVelocity()}")
    }
}