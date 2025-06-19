package br.com.karloskelvin.event.controller;

import br.com.karloskelvin.event.model.Conference;
import br.com.karloskelvin.event.service.ConferenceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/conferences")
public class ConferenceController {

    private final ConferenceService conferenceService;

    public ConferenceController(ConferenceService conferenceService) {
        this.conferenceService = conferenceService;
    }

    @PostMapping
    public ResponseEntity<Conference> addConference(@RequestBody Conference conference) {
        return ResponseEntity.status(201).body(conferenceService.addConference(conference));
    }

    @GetMapping("/{conferenceId}")
    public ResponseEntity<Conference> findById(@PathVariable Integer conferenceId) {
        return ResponseEntity.ok(conferenceService.findById(conferenceId));
    }

    @GetMapping
    public ResponseEntity<List<Conference>> findAll() {
        return ResponseEntity.ok(conferenceService.findAll());
    }

}
