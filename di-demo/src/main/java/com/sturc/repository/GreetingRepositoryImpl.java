package com.sturc.repository;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello.";
    }

    @Override
    public String getUkrainianGreeting() {
        return "Вітаю.";
    }
}
