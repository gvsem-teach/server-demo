package ru.gsemenov.serverdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import ru.gsemenov.serverdemo.api.GeneralApiDelegate;

@Component
public class GeneralController implements GeneralApiDelegate {

    @Override
    public ResponseEntity<String> ping() throws Exception {
        return ResponseEntity.ok("pong");
    }

}
