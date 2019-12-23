package ru.living.livingArtifact.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.living.livingArtifact.repository.ComplexRepository;
import ru.living.livingArtifact.dto.ApartmentRepoDTO;
import ru.living.livingArtifact.dto.ComplexReportDTO;
import ru.living.livingArtifact.services.ComplexService;
import javax.transaction.Transactional;
import java.util.*;

@Service("complexServiceImpl")
@Transactional
public class ComplexServiceGetStats implements ComplexService {

    @Autowired
    ComplexRepository complexRepository;

    @Override
    public Collection<ComplexReportDTO> getStats() {
        List<ApartmentRepoDTO> arDTO = complexRepository.getStats();

        Map<String, ComplexReportDTO> result = new HashMap<>();

        for (ApartmentRepoDTO a : arDTO) {
            int countApartment = (int) a.getCountApartment();
            ComplexReportDTO crDTO = result.getOrDefault(a.getName(), new ComplexReportDTO(a.getName(), 0,0,0,0,0));

            switch (a.getCountRooms()) {
                case (0):
                    crDTO.setStudioApartmentCount(crDTO.getStudioApartmentCount() + countApartment);
                    break;
                case (1):
                    crDTO.setOneRoomApartmentCount(crDTO.getOneRoomApartmentCount() + countApartment);
                    break;
                case (2):
                    crDTO.setTwoRoomApartmentCount(crDTO.getTwoRoomApartmentCount() + countApartment);
                    break;
                case (3):
                    crDTO.setThreeRoomApartmentCount(crDTO.getThreeRoomApartmentCount() + countApartment);
                    break;
                default:
                    crDTO.setFourRoomApartmentCount(crDTO.getFourRoomApartmentCount() + countApartment);
                    break;
            }
            result.put(a.getName(), crDTO);
        }

        return result.values();
    }

}
