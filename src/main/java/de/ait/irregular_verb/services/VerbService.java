package de.ait.irregular_verb.services;

import de.ait.irregular_verb.entity.Verb;
import de.ait.irregular_verb.repositories.VerbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class VerbService {

    private final VerbRepository verbRepository;
    private final Random random;

    @Autowired
    public VerbService(VerbRepository verbRepository) {
        this.verbRepository = verbRepository;
        this.random = new Random();
    }

    public List<Verb> getAllVerbs() {
        return verbRepository.findAll();
    }

    public Optional<Verb> getRandomVerb() {
        List<Verb> verbs = verbRepository.findAll();
        if (verbs.isEmpty()) {
            return Optional.empty();
        }
        int randomIndex = random.nextInt(verbs.size());
        return Optional.of(verbs.get(randomIndex));
    }

    public Verb saveVerb(Verb verb) {
        return verbRepository.save(verb);
    }

    public void deleteVerb(Long id) {
        verbRepository.deleteById(id);
    }
}

