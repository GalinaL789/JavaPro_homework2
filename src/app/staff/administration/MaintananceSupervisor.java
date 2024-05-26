package app.staff.administration;

import app.staff.sotrudniki.Cooker;
import org.springframework.beans.factory.annotation.Autowired;

public class MaintananceSupervisor {
    @Autowired
    private Cooker cooker;

    public void setCooker(Cooker cooker) {
        this.cooker = cooker;
    }

    public void work()

    {
        System.out.println("I take care of houshold. Cooker prepare the lunch, please");
        cooker.work();
    }

}
