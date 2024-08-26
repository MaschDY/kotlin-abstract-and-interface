package br.com.maschdy.kotlinabstractandinterfaces

import br.com.maschdy.kotlinabstractandinterfaces.models.abstracts.CarFromAbstract
import br.com.maschdy.kotlinabstractandinterfaces.models.abstracts.MotorcycleFromAbstract
import br.com.maschdy.kotlinabstractandinterfaces.models.abstracts.VehicleAbstract
import br.com.maschdy.kotlinabstractandinterfaces.models.interfaces.CarFromInterface
import br.com.maschdy.kotlinabstractandinterfaces.models.interfaces.MotorcycleFromInterface
import br.com.maschdy.kotlinabstractandinterfaces.models.interfaces.VehicleInterface

class VehicleFactory {
    fun createAnVehicleFromAbstract(
        type: VehicleType,
        model: String,
        acceleration: Long
    ): VehicleAbstract {
        return when (type) {
            VehicleType.CAR -> CarFromAbstract(model, acceleration)
            VehicleType.MOTORCYCLE -> MotorcycleFromAbstract(model)
        }
    }

    fun createAnVehicleFromInterface(
        type: VehicleType,
        model: String,
        acceleration: Long
    ): VehicleInterface {
        return when (type) {
            VehicleType.CAR -> CarFromInterface(model, acceleration)
            VehicleType.MOTORCYCLE -> MotorcycleFromInterface(model)
        }
    }
}

enum class VehicleType {
    CAR,
    MOTORCYCLE
}
