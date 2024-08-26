package br.com.maschdy.kotlinabstractandinterfaces.models.abstracts

abstract class VehicleAbstract(val model: String, val acceleration: Long) {
    private var velocity: Long = 0

    fun incrementVelocity() {
        velocity += acceleration
    }

    fun decrementVelocity() {
        velocity = if (velocity >= acceleration) {
            velocity - acceleration
        } else {
            0
        }
    }

    fun actualVelocity(): Long {
        return velocity
    }
}
