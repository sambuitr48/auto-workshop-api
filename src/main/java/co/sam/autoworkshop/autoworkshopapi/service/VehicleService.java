package co.sam.autoworkshop.autoworkshopapi.service;

import co.sam.autoworkshop.autoworkshopapi.model.Vehicle;
import co.sam.autoworkshop.autoworkshopapi.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository;
    @Autowired
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> listarVehiculos() {
        return vehicleRepository.findAll();
    }

    public Optional<Vehicle> obtenerVehiculoPorId(String id) {
        return vehicleRepository.findById(id);
    }

    public Vehicle guardarVehiculo(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public void eliminarVehiculo(String id) {
        vehicleRepository.deleteById(id);
    }


}
