package ru.living.livingArtifact.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.living.livingArtifact.dto.ComplexReportDTO;
import ru.living.livingArtifact.services.impl.ComplexServiceGetStats;
import java.util.Collection;

@RestController
public class ComplexRestController {

    @Autowired
    private ComplexServiceGetStats complexServiceGetStats;

    @GetMapping("/stats")
    public ResponseEntity<Collection<ComplexReportDTO>> getStats() {
        return new ResponseEntity<>(complexServiceGetStats.getStats(), HttpStatus.OK);
    }

}
