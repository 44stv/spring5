package com.sturc.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService  implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - injected by the getter";
    }
}
