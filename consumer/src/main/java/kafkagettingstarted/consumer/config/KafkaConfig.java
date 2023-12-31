package kafkagettingstarted.consumer.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    Logger logger = LoggerFactory.getLogger(KafkaConfig.class);

    @KafkaListener(topics = AppConstants.LOCATION_TOPIC, groupId = AppConstants.GROUP_ID)
    public void updateLocation(String location) {
        logger.info("fetched location {}", location);
    }
}
