package garrisonms.service;

import garrisonms.entity.Characteristics;
import garrisonms.entity.Item;
import garrisonms.entity.Warrior;
import garrisonms.entity.warriors.*;
import garrisonms.repository.CharacteristicsRepository;
import garrisonms.repository.ItemRepository;
import garrisonms.repository.WarriorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class WarriorService {

    @Autowired
    DataSource dataSource;

    private WarriorRepository warriorRepository;
    private CharacteristicsRepository characteristicsRepository;
    private ItemRepository itemRepository;

    public WarriorService(WarriorRepository warriorRepository, CharacteristicsRepository characteristicsRepository, ItemRepository itemRepository) {
        this.warriorRepository = warriorRepository;
        this.characteristicsRepository = characteristicsRepository;
        this.itemRepository = itemRepository;
    }

    public Long createArcher(Long castleId, String name) {
        Archer archer = new Archer();
        initWarrior(archer, name, WarriorType.ARCHER, new Characteristics(3, 1, 1, archer), castleId);
        archer.setQuiverCapacity(30);
        archer = warriorRepository.saveAndFlush(archer);
        return archer.getId();
    }

    public Long createKnight(Long castleId, String name) {
        Knight knight = new Knight();
        initWarrior(knight, name, WarriorType.KNIGHT, new Characteristics(1, 1, 3, knight), castleId);
        knight.setSquireCount(2);
        knight = warriorRepository.saveAndFlush(knight);
        return knight.getId();
    }

    public Long createWizzard(Long castleId, String name) {
        Wizard wizard = new Wizard();
        initWarrior(wizard, name, WarriorType.WIZARD, new Characteristics(2, 2, 1, wizard), castleId);
        wizard.setManaCapacity(50);
        wizard = warriorRepository.saveAndFlush(wizard);
        return wizard.getId();
    }

    public void giveItem(Long wariorId, Long itemId) {
        Warrior warrior = warriorRepository.findById(wariorId).get();
        Item item = itemRepository.findById(itemId).get();
        warrior.getItems().add(item);
        warriorRepository.save(warrior);
    }

    private void initWarrior(Warrior warrior, String name, WarriorType type, Characteristics characteristics, Long castleId) {
        warrior.setCount(1);
        warrior.setLevel(1);
        warrior.setName(name);
        warrior.setRank(Rank.valueOf(1).getLabel());
        warrior.setType(type.getValue());
        warrior.setCharacteristics(characteristics);
        warrior.setCastleId(castleId);
    }
}