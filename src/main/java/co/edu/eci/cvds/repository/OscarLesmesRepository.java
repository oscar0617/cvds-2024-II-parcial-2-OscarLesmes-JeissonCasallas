package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.OscarLesmes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OscarLesmesRepository extends JpaRepository<OscarLesmes, Integer> {
    public List<OscarLesmes> findByNumeroPregunta(int numeroPregunta);
}
