package app.code;

import app.staff.administration.Director;
import app.staff.administration.Maintanance_supervisor;
import app.staff.administration.Preschool_education_director;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    public static void main(String[] args) {
        //Director director = new Director();
        //Maintanance_supervisor maintanance_supervisor = new Maintanance_supervisor();
       // Preschool_education_director preschool_education_director = new Preschool_education_director();
       // director.setMaintanance_supervisor(maintanance_supervisor);
       // director.setPreschool_education_director(preschool_education_director);
       // director.manage();
        AbstractApplicationContext context
                = new AnnotationConfigApplicationContext("app.config");
        Director director = context.getBean(Director.class);
        director.manage();

    }
}
