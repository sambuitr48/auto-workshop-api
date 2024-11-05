package co.sam.autoworkshop.autoworkshopapi.repository;

import co.sam.autoworkshop.autoworkshopapi.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepository extends MongoRepository<Vehicle, String> {
}
