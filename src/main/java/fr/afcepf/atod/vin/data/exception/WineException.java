/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.afcepf.atod.vin.data.exception;

/**
 * Exceptions personnalisees pour notre projet.
 * @author ronan
 */
public class WineException extends Exception {
    /**
     * Identifiant de sérialisation.
     */
    private static final long serialVersionUID = 1L;
    /**
     * erreur generique dans l'enumeration.
     */
    private WineErrorCode erreurVin;
    /**
     * Constructeur avec message.
     * @param message message
     */
    public WineException(String message) {
        super(message);
    }
    /**
     * Constructeur avec code erreur et message.
     * @param paramErreurVin code erreur
     * @param message message
     */
    public WineException(WineErrorCode paramErreurVin, String message) {
        super(message);
        erreurVin = paramErreurVin;
    }
    /**
     * Code erreur accesseur.
     * @return erreurVin code d'erreur
     */
    public WineErrorCode getErreurVin() {
        return erreurVin;
    }
    /**
     * Code erreur mutateur.
     * @param paramErreurVin code erreur
     */
    public void setErreurVin(WineErrorCode paramErreurVin) {
        erreurVin = paramErreurVin;
    }
}
