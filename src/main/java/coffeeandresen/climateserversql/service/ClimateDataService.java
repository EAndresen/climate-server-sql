package coffeeandresen.climateserversql.service;

import coffeeandresen.climateserversql.model.ClimateData;
import coffeeandresen.climateserversql.repository.ClimateDataRepository;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Service
public class ClimateDataService {

    private final ClimateDataRepository climateDataRepository;

    public ClimateDataService(ClimateDataRepository climateDataRepository) {
        this.climateDataRepository = climateDataRepository;
    }

    public void saveClimateData(ClimateData climateData) {
        climateData.setDate(getCurrentTime());
        climateDataRepository.save(climateData);
    }

    private String getCurrentTime() {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(timeZone);
        return dateFormat.format(new Date());
    }
}
