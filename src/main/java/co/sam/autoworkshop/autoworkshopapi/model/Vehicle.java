package co.sam.autoworkshop.autoworkshopapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "vehiculos")
public class Vehicle {
    @Id
    private String id;
    private String marca;
    private String modelo;
    private String propietario;
    private String estado;
}
