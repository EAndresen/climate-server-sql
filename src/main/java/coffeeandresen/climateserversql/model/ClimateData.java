package coffeeandresen.climateserversql.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class ClimateData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer sensorId;
    private String date;
    private Float temperature;
    private Float humidity;
    private String location;
}
