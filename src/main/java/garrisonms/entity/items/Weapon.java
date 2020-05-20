package garrisonms.entity.items;

import garrisonms.entity.Item;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Weapon extends Item {

    @Column
    private Integer damage;

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "damage=" + damage +
                '}';
    }
}