package garrisonms.controller;

import garrisonms.entity.ro.GiveItemRequest;
import garrisonms.entity.ro.WarriorRo;
import garrisonms.service.WarriorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/warrior")
public class WarriorController {

    @Autowired
    public WarriorService warriorService;

    @ResponseBody
    @RequestMapping(value = "/createArcher", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long createArcher(@RequestBody WarriorRo warrior) {
        return warriorService.createArcher(warrior.getCastleId(), warrior.getName());
    }

    @ResponseBody
    @RequestMapping(value = "/createKnight", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long createKnight(@RequestBody WarriorRo warrior) {
        return warriorService.createKnight(warrior.getCastleId(), warrior.getName());
    }

    @ResponseBody
    @RequestMapping(value = "/createWizard", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long createWizard(@RequestBody WarriorRo warrior) {
        return warriorService.createWizzard(warrior.getCastleId(), warrior.getName());
    }

    @ResponseStatus(code = HttpStatus.OK)
    @RequestMapping(value = "/giveItem", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void giveItem(@RequestBody GiveItemRequest giveItemRequest) {
        warriorService.giveItem(giveItemRequest.getWariorId(), giveItemRequest.getItemId());
    }
}