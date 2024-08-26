package br.com.maschdy.kotlinabstractandinterfaces.models.interfaces

class MotorcycleFromInterface(
    override val model: String,
    override val acceleration: Long = 5,
    override var velocity: Long = 0
) : VehicleInterface {
    override fun incrementVelocity() {
        velocity += acceleration
    }

    override fun decrementVelocity() {
        velocity = if (velocity >= acceleration) {
            velocity - acceleration
        } else {
            0
        }
    }

    override fun actualVelocity(): Long {
        return velocity
    }
}
