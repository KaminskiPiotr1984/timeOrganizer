package KaminskiPiotr1984.com.github.timeOrganizer.controllers;


import KaminskiPiotr1984.com.github.timeOrganizer.domain.entities.RandomData;
import KaminskiPiotr1984.com.github.timeOrganizer.domain.repositories.RandomRepository;
import KaminskiPiotr1984.com.github.timeOrganizer.dtos.RandomDataCreateDTO;
import KaminskiPiotr1984.com.github.timeOrganizer.services.CreateRandomDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/random")
public class RandomController {


    private final CreateRandomDataService createRandomDataService;

    public RandomController(CreateRandomDataService createRandomDataService) {
        this.createRandomDataService = createRandomDataService;
    }

    @GetMapping
    public String prepareAddRandom(Model model) {
        model.addAttribute("randomData", new RandomDataCreateDTO());
        return "random/create";
    }

    @PostMapping
    public String processAddRandom(@ModelAttribute("registrationDataCreate") @Valid RandomDataCreateDTO randomDataCreate, BindingResult result) {
        if (result.hasErrors()) {
            return "random/create";

        }
        createRandomDataService.createRandomData(randomDataCreate);
        return "redirect:/";
    }





}
