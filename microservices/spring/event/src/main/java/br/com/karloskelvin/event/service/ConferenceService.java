package br.com.karloskelvin.event.service;

import br.com.karloskelvin.event.model.Conference;

import java.util.List;

public interface ConferenceService {
    List<Conference> findAll();
    Conference findById(Integer id);
    Conference addConference(Conference conference);
}
