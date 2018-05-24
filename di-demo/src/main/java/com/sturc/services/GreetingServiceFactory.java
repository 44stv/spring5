package com.sturc.services;

import com.sturc.repository.GreetingRepository;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang){
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "ua":
                return new PrimaryUkrainianGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
