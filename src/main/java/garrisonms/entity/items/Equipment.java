package garrisonms.entity.items;

import garrisonms.entity.Item;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Equipment extends Item {

    @Column
    private Integer defence;
    @Column
    private Integer weight;

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "defence=" + defence +
                ", weight=" + weight +
                '}';
    }
}