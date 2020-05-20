package garrisonms.entity;

import javax.persistence.*;

@Entity
public class Characteristics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Integer agility;
    @Column
    private Integer stamina;
    @Column
    private Integer strength;

    @OneToOne
    @JoinColumn(name = "warrior_id", referencedColumnName = "id")
    private Warrior warrior;

    public Characteristics() {
        super();
    }

    public Characteristics(Integer agility, Integer stamina, Integer strength, Warrior warrior) {
        this.agility = agility;
        this.stamina = stamina;
        this.strength = strength;
        this.warrior = warrior;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }
}