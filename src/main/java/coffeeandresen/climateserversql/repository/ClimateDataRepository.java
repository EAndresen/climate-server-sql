package coffeeandresen.climateserversql.repository;

import coffeeandresen.climateserversql.model.ClimateData;
import org.springframework.data.repository.CrudRepository;

public interface ClimateDataRepository extends CrudRepository<ClimateData, Integer> {
}
