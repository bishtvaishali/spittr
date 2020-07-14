package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.data.SpittleRepoImpl;
import spittr.data.SpittleRepository;


@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepoImpl spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    /**
     * A list of Spittle objects is stored in the model with a key of spittleList
     * and given to the view whose name is spittles
     */
    @RequestMapping(method= RequestMethod.GET)
    public String spittles(Model model) {
        model.addAttribute("spittleList",
                spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        return "spittles";
    }
/**
 * if the view name is not returned, it will extracted from
 * its path name. For ex: in this case view name will be "spittles"
 */
//    public List<Spittle> spittles() {
//        return spittleRepository.findSpittles(Long.MAX_VALUE, 20));
//    }

}