package ariefsaferman.jwork.controller;

import ariefsaferman.jwork.*;
import ariefsaferman.jwork.database_postgre.DatabaseRecruiterPostgre;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RequestMapping("/recruiter")
@RestController
public class RecruiterController {

    @RequestMapping("")
    public ArrayList<Recruiter> getAllRecruiter() {
        return DatabaseRecruiterPostgre.getRecruiterDatabase();
    }

    @RequestMapping("/{id}")
    public Recruiter getRecruiterById(@PathVariable int id) {
//        Recruiter recruiter = null;
//        try {
//            recruiter = DatabaseRecruiter.getRecruiterById(id);
//        } catch (RecruiterNotFoundException e) {
//            e.getMessage();
//        }
//
//        return recruiter;
        return DatabaseRecruiterPostgre.getRecruiterById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value="name") String name,
                                  @RequestParam(value="email") String email,
                                  @RequestParam(value="phoneNumber") String phoneNumber,
                                  @RequestParam(value="province") String province,
                                  @RequestParam(value="city") String city,
                                  @RequestParam(value="description") String description)
    {
//        Recruiter recruiter = new Recruiter(DatabaseRecruiter.getLastId()+1, name, email, phoneNumber, new Location(province, city, description));
//
//        try{
//            DatabaseRecruiter.addRecruiter(recruiter);
//        } catch (Exception e) {
//            e.getMessage();
//            return null;
//        }
//        return recruiter;
        int id = 0;
        Location location = new Location(province, city, description);
        Recruiter recruiter = new Recruiter(id+1, name, email, phoneNumber, location);
        return DatabaseRecruiterPostgre.addRecruiter(recruiter);
    }
}
