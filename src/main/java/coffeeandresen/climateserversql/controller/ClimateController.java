package coffeeandresen.climateserversql.controller;

import coffeeandresen.climateserversql.model.ClimateData;
import coffeeandresen.climateserversql.service.ClimateDataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/climate")
public class ClimateController {

    private final ClimateDataService climateDataService;

    public ClimateController(ClimateDataService climateDataService) {
        this.climateDataService = climateDataService;
    }

    @PostMapping(path = "/add")
    public @ResponseBody String addNewClimateData (@RequestBody ClimateData climateData) {
        climateDataService.saveClimateData(climateData);
        return "Saved";
    }
}
