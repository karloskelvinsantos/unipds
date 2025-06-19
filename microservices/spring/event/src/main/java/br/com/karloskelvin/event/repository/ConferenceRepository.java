package br.com.karloskelvin.event.repository;

import br.com.karloskelvin.event.model.Conference;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRepository extends ListCrudRepository<Conference, Integer> {
}
