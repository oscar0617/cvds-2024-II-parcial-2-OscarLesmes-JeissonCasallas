package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.JeissonCasallasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JeissonCasallasRepository extends JpaRepository<JeissonCasallasModel, Integer> {
    public List<JeissonCasallasModel> findByPregunta(int pregunta);

}