package ariefsaferman.jwork.controller;

import ariefsaferman.jwork.*;
import ariefsaferman.jwork.database_postgre.DatabaseBonusPostgre;
import ariefsaferman.jwork.exception.ReferralCodeAlreadyExistsException;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RequestMapping("/bonus")
@RestController
public class BonusController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Bonus> getAllBonus() {
        return DatabaseBonusPostgre.getDatabaseBonus();
    }

    @RequestMapping("/{referralCode}")
    public Bonus getBonusByReferralCode(
            @PathVariable String referralCode){
        return DatabaseBonusPostgre.getBonusByReferralCode(referralCode);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(
            @RequestParam(value = "referralCode") String referralCode,
            @RequestParam(value = "extraFee") int extraFee,
            @RequestParam(value = "minTotalFee") int minTotalFee,
            @RequestParam(value = "active") boolean active

    ) throws ReferralCodeAlreadyExistsException {
//        Bonus bonus = new Bonus(DatabaseBonus.getLastId() + 1, referralCode, extraFee, minTotalFee, active);
//        try {
//            DatabaseBonus.addBonus(bonus);
//        } catch (ReferralCodeAlreadyExistsException e) {
//            e.getMessage();
//            return null;
//        }
//        return bonus;
        return DatabaseBonusPostgre.addBonus(referralCode, extraFee,minTotalFee,active);
    }
}
