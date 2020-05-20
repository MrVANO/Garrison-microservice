package garrisonms.entity.items.equipment;


import garrisonms.entity.items.Equipment;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "full_set")
public class FullSet extends Equipment {

    @Column(name = "group_bonus")
    private Float groupBonus;

    public Float getGroupBonus() {
        return groupBonus;
    }

    public void setGroupBonus(Float groupBonus) {
        this.groupBonus = groupBonus;
    }

    @Override
    public String toString() {
        return "FullSet{" +
                "groupBonus=" + groupBonus +
                '}';
    }
}
