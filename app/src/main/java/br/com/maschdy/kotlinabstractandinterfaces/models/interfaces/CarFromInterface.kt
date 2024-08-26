package br.com.maschdy.kotlinabstractandinterfaces.models.interfaces

class CarFromInterface(
    override val model: String,
    override val acceleration: Long,
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
