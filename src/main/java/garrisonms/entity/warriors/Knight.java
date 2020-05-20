package garrisonms.entity.warriors;

import garrisonms.entity.Warrior;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Knight extends Warrior {

    @Column(name = "squire_count")
    private Integer squireCount;

    public Integer getSquireCount() {
        return squireCount;
    }

    public void setSquireCount(Integer squireCount) {
        this.squireCount = squireCount;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "squireCount=" + squireCount +
                '}';
    }
}