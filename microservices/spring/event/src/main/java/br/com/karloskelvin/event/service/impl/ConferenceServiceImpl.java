package br.com.karloskelvin.event.service.impl;

import br.com.karloskelvin.event.exception.NotFoundException;
import br.com.karloskelvin.event.model.Conference;
import br.com.karloskelvin.event.repository.ConferenceRepository;
import br.com.karloskelvin.event.service.ConferenceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceServiceImpl implements ConferenceService {

    private final ConferenceRepository conferenceRepository;

    public ConferenceServiceImpl(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;
    }

    @Override
    public List<Conference> findAll() {
        return conferenceRepository.findAll();
    }

    @Override
    public Conference findById(Integer id) {
        return conferenceRepository.findById(id).orElseThrow(() -> new NotFoundException("Conference not found"));
    }

    @Override
    public Conference addConference(Conference conference) {
        return conferenceRepository.save(conference);
    }
}
