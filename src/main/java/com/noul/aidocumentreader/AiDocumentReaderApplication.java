package com.noul.aidocumentreader;

import com.noul.aidocumentreader.functions.WeatherConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(WeatherConfigProperties.class)
@SpringBootApplication
public class AiDocumentReaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiDocumentReaderApplication.class, args);
    }

}
