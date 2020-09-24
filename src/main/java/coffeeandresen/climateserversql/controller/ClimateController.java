package coffeeandresen.climateserversql.controller;

import coffeeandresen.climateserversql.model.ClimateData;
import coffeeandresen.climateserversql.service.ClimateDataService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/climate")
public class ClimateController {

    private final ClimateDataService climateDataService;

    public ClimateController(ClimateDataService climateDataService) {
        this.climateDataService = climateDataService;
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @PostMapping(path = "/add")
    public void addNewClimateData (@RequestBody ClimateData climateData) {
        climateDataService.saveClimateData(climateData);
    }
}
