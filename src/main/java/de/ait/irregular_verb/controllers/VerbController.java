package de.ait.irregular_verb.controllers;

import de.ait.irregular_verb.entity.Verb;
import de.ait.irregular_verb.services.VerbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/verbs")
public class VerbController {

    private final VerbService verbService;

    @Autowired
    public VerbController(VerbService verbService) {
        this.verbService = verbService;
    }

    @GetMapping
    public List<Verb> getAllVerbs() {
        return verbService.getAllVerbs();
    }

    @GetMapping("/random")
    public Optional<Verb> getRandomVerb() {
        return verbService.getRandomVerb();
    }

    @PostMapping
    public Verb addVerb(@RequestBody Verb verb) {
        return verbService.saveVerb(verb);
    }

    @DeleteMapping("/{id}")
    public void deleteVerb(@PathVariable Long id) {
        verbService.deleteVerb(id);
    }
}

