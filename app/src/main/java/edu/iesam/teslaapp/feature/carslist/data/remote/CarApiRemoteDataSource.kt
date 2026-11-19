package edu.iesam.teslaapp.feature.carslist.data.remote

import edu.iesam.teslaapp.feature.carslist.domain.Car

class CarApiRemoteDataSource {


    fun getAll(): List<Car> {
        return listOf(
            Car("1", "Merdedes-AMG", "GT 63 S 4-Door Coupé", "4.0L V8 Biturbo (639 CV)", "€198.500EUR"),
            Car("2","Marca2","Modelo2","Precio2", "Motor2")
        )
    }

}