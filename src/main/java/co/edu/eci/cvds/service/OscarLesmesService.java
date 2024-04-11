package co.edu.eci.cvds.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.eci.cvds.model.OscarLesmes;
import co.edu.eci.cvds.repository.OscarLesmesRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OscarLesmesService {
    
    @Autowired
    private OscarLesmesRepository oscarLesmesRepository;
    
    public List<OscarLesmes> getAllAnswers() {
        return oscarLesmesRepository.findAll();
    }
}
