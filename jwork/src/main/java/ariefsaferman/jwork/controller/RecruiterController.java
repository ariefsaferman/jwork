package ariefsaferman.jwork.controller;

import ariefsaferman.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

import static ariefsaferman.jwork.DatabaseRecruiter.getRecruiterDatabase;

@RequestMapping("/recruiter")
@RestController
public class RecruiterController {

    @RequestMapping("")
    public ArrayList<Recruiter> getAllRecruiter() {
        return getRecruiterDatabase();
    }

    @RequestMapping("/{id}")
    public Recruiter getRecruiterById(@PathVariable int id) {
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(id);
        } catch (RecruiterNotFoundException e) {
            e.getMessage();
        }

        return recruiter;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value="name") String name,
                                  @RequestParam(value="email") String email,
                                  @RequestParam(value="phoneNumber") String phoneNumber,
                                  @RequestParam(value="province") String province,
                                  @RequestParam(value="description") String description,
                                  @RequestParam(value="city") String city)
    {
        Recruiter recruiter = new Recruiter(DatabaseRecruiter.getLastId()+1, name, email, phoneNumber, new Location(province, city, description));

        try{
            DatabaseRecruiter.addRecruiter(recruiter);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return recruiter;
    }
}
