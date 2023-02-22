package com.ayusuf.idearefinerydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    String kafkaTopic = "topic1";

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/send")
    public String send() {
        kafkaTemplate.send(kafkaTopic, "Test");
        return "Sent Test";
    }

}
