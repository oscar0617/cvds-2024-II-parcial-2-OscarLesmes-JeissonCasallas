package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.JeissonCasallasModel;
import co.edu.eci.cvds.repository.JeissonCasallasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JeissonCasallasService {
    private final JeissonCasallasRepository jeissoncasallasrepository;

    @Autowired
    public JeissonCasallasService(JeissonCasallasRepository jeissoncasallasrepository){
        this.jeissoncasallasrepository= jeissoncasallasrepository;
    }

    public JeissonCasallasModel getJeissonCasallas(int pregunta) {
        return jeissoncasallasrepository.findByPregunta(pregunta).get(1);
    }

    public List<JeissonCasallasModel> getAllPreguntas() {
        return jeissoncasallasrepository.findAll();
    }
}   