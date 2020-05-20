package garrisonms.entity.items.weapon;

import garrisonms.entity.items.Weapon;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Stick extends Weapon {

    @Column(name = "damage_multiplicator")
    private Float damageMultiplicator;

    public Float getDamageMultiplicator() {
        return damageMultiplicator;
    }

    public void setDamageMultiplicator(Float damageMultiplicator) {
        this.damageMultiplicator = damageMultiplicator;
    }

    @Override
    public String toString() {
        return "Stick{" +
                "damageMultiplicator=" + damageMultiplicator +
                '}';
    }
}