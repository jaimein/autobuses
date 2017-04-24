/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q12transporte;

/**
 *
 * @author jaime
 */
public class Matricula {

    private String letras;
    private long numero;

    /**
     * @return the letras
     */
    public String getLetras() {
        return letras;
    }

    /**
     * @param letras the letras to set
     */
    public void setLetras(String letras) {
        this.letras = letras;
    }

    /**
     * @return the numero
     */
    public long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Matricula(String letras, long numero) {
        this.letras = letras;
        this.numero = numero;
    }
    
    
}
