package app.staff.administration;

import app.staff.sotrudniki.Nanny;
import app.staff.sotrudniki.PreschoolTeacher;
import org.springframework.beans.factory.annotation.Autowired;

public class PreschoolEducationDirector {
    @Autowired
    private PreschoolTeacher teacher;
    @Autowired
    private Nanny nanny;
    public void work()
    {

        System.out.println("I am making the order to the teacher and nanny");
        teacher.work();
        nanny.work();
    }

    public void setTeacher(PreschoolTeacher teacher) {
        this.teacher = teacher;
    }

    public void setNanny(Nanny nanny) {
        this.nanny = nanny;
    }
}
