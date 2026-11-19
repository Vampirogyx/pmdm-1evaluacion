package edu.iesam.teslaapp.feature.carslist.domain

interface CarDataRepository {

    fun add(car: Car)

    fun findById(id: String): Car?

    fun findAll(): List<Car>

    fun deleteById(id: String)

}