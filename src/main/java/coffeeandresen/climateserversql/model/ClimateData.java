package coffeeandresen.climateserversql.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ClimateData {

    @Id
    private Integer id;
    private String date;
    private Float temperature;
    private Float humidity;
    private String location;
}
