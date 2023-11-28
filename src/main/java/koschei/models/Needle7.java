package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {


    private Deth8 death;
    @Autowired
    public Needle7(Deth8 deth8) {
        this.death = deth8;
    }
    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + "";
    }
}
