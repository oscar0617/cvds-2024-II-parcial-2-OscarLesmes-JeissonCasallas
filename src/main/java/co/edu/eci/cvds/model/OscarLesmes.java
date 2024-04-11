package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OSCAR_LESMES")
public class OscarLesmes {
    @Id
    @Column(name = "NUMERO_PREGUNTA")
    private int numeroPregunta;
    @Column(name = "LETRA")
    private String letra;
    @Column(name = "ARGUMENTO")
    private String argumento;

    public OscarLesmes(){
    }

    /*
     * Constructor for OscarLesmes
     * @param numeroPregunta
     * @param letraRespuesta
     * @param argumento
     */
    public OscarLesmes(int numeroPregunta, String letra, String argumento){
        this.numeroPregunta = numeroPregunta;
        this.letra = letra;
        this.argumento = argumento;
    }

    public void setNumeroPregunta(int numeroPregunta){
        this.numeroPregunta = numeroPregunta;
    }

    public int getNumeroPregunta(){
        return numeroPregunta;
    }

    public void setLetra(String letra){
        this.letra = letra;
    }

    public String getletra(){
        return letra;
    }

    public void setArgumento(String argumento){
        this.argumento = argumento;
    }

    public String getArgumento(){
        return argumento;
    }
}
