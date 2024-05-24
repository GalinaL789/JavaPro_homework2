package app.config;

import app.staff.administration.Director;
import app.staff.administration.Maintanance_supervisor;
import app.staff.administration.Preschool_education_director;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
    @Bean
    public Director director() {
        return new Director();
    }
    @Bean
    public Maintanance_supervisor maintanance_supervisor() {
        return new Maintanance_supervisor();
    }
    @Bean
    public Preschool_education_director preschool_education_director() {
        return new Preschool_education_director();
    }

}
