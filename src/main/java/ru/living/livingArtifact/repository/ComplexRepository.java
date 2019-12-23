package ru.living.livingArtifact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.living.livingArtifact.dto.ApartmentRepoDTO;
import ru.living.livingArtifact.entity.Complex;
import java.util.List;

@Repository
public interface ComplexRepository extends JpaRepository<Complex, Long> {

    @Query("SELECT new ru.living.livingArtifact.dto.ApartmentRepoDTO(c.name, count(c.id), a.roomsCnt) FROM Apartment a JOIN a.complex c GROUP BY c.name, a.roomsCnt")
    List<ApartmentRepoDTO> getStats();

}
