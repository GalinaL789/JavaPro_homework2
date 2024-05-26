package app.config;

import app.staff.administration.Director;
import app.staff.administration.MaintananceSupervisor;
import app.staff.administration.PreschoolEducationDirector;
import app.staff.sotrudniki.Cooker;
import app.staff.sotrudniki.Nanny;
import app.staff.sotrudniki.PreschoolTeacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
    @Bean
    public Director director() {
        return new Director();
    }
    @Bean
    public MaintananceSupervisor maintanance_supervisor() {
        return new MaintananceSupervisor();
    }
    @Bean
    public PreschoolEducationDirector preschool_education_director() {
        return new PreschoolEducationDirector();
    }
    @Bean
    public Cooker coocker()
    {
        return new Cooker();
    }
    @Bean
    public PreschoolTeacher teacher()
    {
        return new PreschoolTeacher();
    }
    @Bean
    public Nanny nanny()
    {
        return new Nanny();
    }
}
