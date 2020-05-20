package garrisonms.entity.warriors;

import garrisonms.entity.Warrior;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Wizard extends Warrior {

    @Column(name = "mana_capacity")
    private Integer manaCapacity;

    public Integer getManaCapacity() {
        return manaCapacity;
    }

    public void setManaCapacity(Integer manaCapacity) {
        this.manaCapacity = manaCapacity;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "manaCapacity=" + manaCapacity +
                '}';
    }
}