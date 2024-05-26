package app.staff.administration;

import org.springframework.beans.factory.annotation.Autowired;

public class Director {
    @Autowired
    private MaintananceSupervisor maintananceSupervisor;
    @Autowired
    private PreschoolEducationDirector preschoolEducationDirector;
    public MaintananceSupervisor getMaintananceSupervisor() {
        return maintananceSupervisor;
    }

    public PreschoolEducationDirector getPreschoolEducationDirector() {
        return preschoolEducationDirector;
    }

    public void setMaintananceSupervisor(MaintananceSupervisor maintananceSupervisor) {
        this.maintananceSupervisor = maintananceSupervisor;
    }

    public void setPreschoolEducationDirector(PreschoolEducationDirector preschoolEducationDirector) {
        this.preschoolEducationDirector = preschoolEducationDirector;
    }
    public void manage()
    {
        maintananceSupervisor.work();
        preschoolEducationDirector.work();
    }

}
