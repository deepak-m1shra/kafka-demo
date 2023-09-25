package kafkagettingstarted.producer.service;

import kafkagettingstarted.producer.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private final Logger logger = LoggerFactory.getLogger(KafkaService.class);
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public boolean updateLocation(String location) {
        kafkaTemplate.send(AppConstants.LOCATION_TOPIC, location);
        logger.info("Location updated :: ");
        return true;
    }
}
