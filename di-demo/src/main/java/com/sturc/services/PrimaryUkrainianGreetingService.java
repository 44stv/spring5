package com.sturc.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ua")
@Primary
public class PrimaryUkrainianGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Вітаю.";
    }
}
