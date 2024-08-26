package br.com.maschdy.kotlinabstractandinterfaces.models.interfaces

interface VehicleInterface {
    val model: String
    val acceleration: Long
    var velocity: Long

    fun incrementVelocity()
    fun decrementVelocity()
    fun actualVelocity(): Long
}