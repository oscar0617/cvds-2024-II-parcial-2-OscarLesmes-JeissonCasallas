package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "JEISSON_CASALLAS")
public class JeissonCasallasModel {
    @Id
    @Column(name = "PREGUNTA")
    private int pregunta;
    @Column(name = "LETRA")
    private String letra;
    @Column(name="RAZON")
    private String razon;


    public JeissonCasallasModel(){
    }
    
    public JeissonCasallasModel(int pregunta, String letra, String razon){
        this.pregunta=pregunta;
        this.letra=letra;
        this.razon=razon;
    }

    public int getPregunta(){
        return pregunta;

    }
    public void setPregunta(int pregunta){
        this.pregunta=pregunta;
    }
    public String getLetra(){
        return letra;
    }
    public void setLetra(String letra){
        this.letra=letra;
    }
    public String getRazon(){
        return razon;
    }
    public void setRazon(String razon){
        this.razon=razon;
    }
}