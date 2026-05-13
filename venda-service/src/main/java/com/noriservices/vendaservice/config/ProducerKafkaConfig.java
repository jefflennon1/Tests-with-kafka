package com.noriservices.vendaservice.config;


import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;


/*****
 * Author: jefflennon1
 *
 * Essa minha classe define configurações simples de producer para o broker que criei manualmente.
 *
 * This is my java class where I decided some configurations for the my local broker kafka.
 *
 * *****/
@Configuration
public class ProducerKafkaConfig {

    @Bean
    public ProducerFactory<String, String> customProducerFactory() {
        Map<String, Object> config = new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092"); /// aqui é o local onde meu broker vai ficar rodando
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return new DefaultKafkaProducerFactory<>(config);
    }

    @Bean
    public KafkaTemplate<String, String> customKafkaTemplate() {
        return new KafkaTemplate<>(customProducerFactory());
    }
}
