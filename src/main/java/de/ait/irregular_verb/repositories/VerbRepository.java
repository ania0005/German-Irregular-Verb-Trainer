package de.ait.irregular_verb.repositories;

import de.ait.irregular_verb.entity.Verb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerbRepository extends JpaRepository<Verb, Long> {
}

