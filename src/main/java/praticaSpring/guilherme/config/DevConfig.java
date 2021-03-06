package praticaSpring.guilherme.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import praticaSpring.guilherme.services.DBservice;

import java.text.ParseException;

    @Configuration
    @Profile("dev")
    public class DevConfig {

        @Autowired
        private DBservice dbservice;

        @Bean
        public boolean instantiateDatabase() throws ParseException {
            dbservice.instantiateTestDatabase();
            return true;
        }
    }

