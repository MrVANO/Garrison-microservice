package garrisonms.entity.items.weapon;

import garrisonms.entity.items.Weapon;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Bow extends Weapon {

    @Column
    private Integer range;

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Bow{" +
                "range=" + range +
                '}';
    }
}