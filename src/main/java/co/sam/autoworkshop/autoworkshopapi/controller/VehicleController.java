package co.sam.autoworkshop.autoworkshopapi.controller;

import co.sam.autoworkshop.autoworkshopapi.model.Vehicle;
import co.sam.autoworkshop.autoworkshopapi.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class VehicleController {
    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public List<Vehicle> listarVehiculos() {
        return vehicleService.listarVehiculos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> obtenerVehiculoPorId(@PathVariable String id) {
        return vehicleService.obtenerVehiculoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Vehicle guardarVehiculo(@RequestBody Vehicle vehicle) {
        return vehicleService.guardarVehiculo(vehicle);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarVehiculo(@PathVariable String id) {
        vehicleService.eliminarVehiculo(id);
        return ResponseEntity.noContent().build();
    }
}

