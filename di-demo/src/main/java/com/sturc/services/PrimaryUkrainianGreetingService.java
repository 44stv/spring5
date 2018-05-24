package com.sturc.services;

import com.sturc.repository.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ua")
@Primary
public class PrimaryUkrainianGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryUkrainianGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getUkrainianGreeting();
    }
}
