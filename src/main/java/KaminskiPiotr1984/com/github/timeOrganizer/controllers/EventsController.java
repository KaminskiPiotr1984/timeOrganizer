package KaminskiPiotr1984.com.github.timeOrganizer.controllers;


import KaminskiPiotr1984.com.github.timeOrganizer.domain.entities.Event;
import KaminskiPiotr1984.com.github.timeOrganizer.domain.entities.User;
import KaminskiPiotr1984.com.github.timeOrganizer.domain.repositories.EventsRepository;
import KaminskiPiotr1984.com.github.timeOrganizer.domain.repositories.UserRepository;
import KaminskiPiotr1984.com.github.timeOrganizer.dtos.EventDTO;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.security.Principal;

@Controller
@RequestMapping("/event")
@Slf4j
public class EventsController {

    private EventsRepository eventsRepository;
    private UserRepository userRepository;


    public EventsController(EventsRepository eventsRepository, UserRepository userRepository) {
        this.eventsRepository = eventsRepository;
        this.userRepository = userRepository;
    }



    @GetMapping("/create")
    public String prepareAddUser(Model model) {
        model.addAttribute("event", new EventDTO());
        return "event/create";
    }

    @PostMapping("/create")
    public String processAddUser(@ModelAttribute("event") @Valid EventDTO eventDTO, BindingResult result, Principal principal) {
        if (result.hasErrors()) {
            return "event/create";
        }
        ModelMapper mapper = new ModelMapper();
        Event eventEntity = mapper.map(eventDTO, Event.class);
        User user = userRepository.getByUsername(principal.getName());
        eventEntity.setUser(user);
        eventsRepository.save(eventEntity);
        return "redirect:/user";
    }

    @GetMapping("/userEvents")
    public String showAllUserEvents(Model model){
        model.addAttribute("events", eventsRepository.findAll());
        return "event/userEvents";
    }




}
