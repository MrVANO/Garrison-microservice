package garrisonms.entity.items.weapon;

import garrisonms.entity.items.Weapon;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Sword extends Weapon {

    @Column
    private Integer length;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "length=" + length +
                '}';
    }
}