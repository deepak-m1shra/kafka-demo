package kafkagettingstarted.producer.controller;

import kafkagettingstarted.producer.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping
    public ResponseEntity<?> updateLocation() {
        String location = getLocation();
        kafkaService.updateLocation(location);
        return new ResponseEntity<>(Map.of("location", location), HttpStatus.OK);
    }

    public String getLocation() {
        return getRandomCoordinate() + ", " + getRandomCoordinate();
    }

    String getRandomCoordinate() {
        return String.valueOf(Math.round(Math.random() * 100));
    }
}
