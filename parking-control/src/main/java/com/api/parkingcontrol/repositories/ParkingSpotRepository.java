package com.api.parkingcontrol.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    boolean existsByLicensePlateCar(String LicensePlateCar);

    boolean existsByParkingSpotNumber(String ParkingSpotNumber);

    boolean existsByApartmentAndBlock(String apartment, String block);

    ParkingSpotModel findByApartment(String apartment);

    List<ParkingSpotModel> findAll();

    List<ParkingSpotModel> findByModelCar(String modelCar);

}
