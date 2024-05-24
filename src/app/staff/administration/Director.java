package app.staff.administration;

import org.springframework.beans.factory.annotation.Autowired;

public class Director {
    @Autowired
    private Maintanance_supervisor maintanance_supervisor;
    @Autowired
    private Preschool_education_director preschool_education_director;
    public Maintanance_supervisor getMaintanance_supervisor() {
        return maintanance_supervisor;
    }

    public Preschool_education_director getPreschool_education_director() {
        return preschool_education_director;
    }

    public void setMaintanance_supervisor(Maintanance_supervisor maintanance_supervisor) {
        this.maintanance_supervisor = maintanance_supervisor;
    }

    public void setPreschool_education_director(Preschool_education_director preschool_education_director) {
        this.preschool_education_director = preschool_education_director;
    }
    public void manage()
    {
        maintanance_supervisor.work();
        preschool_education_director.work();
    }

}
