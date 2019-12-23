package ru.living.livingArtifact.services;

import ru.living.livingArtifact.dto.ComplexReportDTO;
import java.util.Collection;

public interface ComplexService {

    Collection<ComplexReportDTO> getStats();

}
