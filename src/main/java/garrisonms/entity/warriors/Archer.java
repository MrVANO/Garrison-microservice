package garrisonms.entity.warriors;

import garrisonms.entity.Warrior;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Archer extends Warrior {

    @Column(name = "quiver_capacity")
    private Integer quiverCapacity;

    public Integer getQuiverCapacity() {
        return quiverCapacity;
    }

    public void setQuiverCapacity(Integer quiverCapacity) {
        this.quiverCapacity = quiverCapacity;
    }

    @Override
    public String toString() {
        return "Archer{" +
                "quiverCapacity=" + quiverCapacity +
                '}';
    }
}