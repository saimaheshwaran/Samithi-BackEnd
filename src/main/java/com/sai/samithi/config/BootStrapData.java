package com.sai.samithi.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        loadEntities();
    }

    void loadEntities() {

    }
}
