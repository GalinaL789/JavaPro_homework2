package app.code;

import app.staff.administration.Director;
import app.staff.administration.MaintananceSupervisor;
import app.staff.administration.PreschoolEducationDirector;
import app.staff.sotrudniki.Cooker;
import app.staff.sotrudniki.Nanny;
import app.staff.sotrudniki.PreschoolTeacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();
        MaintananceSupervisor maintananceSupervisor = new MaintananceSupervisor();
        PreschoolEducationDirector preschoolEducationDirector = new PreschoolEducationDirector();
        Nanny nanny=new Nanny();
        Cooker cooker=new Cooker();
        PreschoolTeacher teacher =new PreschoolTeacher();
        preschoolEducationDirector.setTeacher(teacher);
       director.setMaintananceSupervisor(maintananceSupervisor);
       director.setPreschoolEducationDirector(preschoolEducationDirector);
        maintananceSupervisor.setCooker(cooker);
        preschoolEducationDirector.setNanny(nanny);
        director.manage();
       // AbstractApplicationContext context
       //         = new AnnotationConfigApplicationContext("app.config");
       // Director director = context.getBean(Director.class);
      //  director.manage();

    }
}
