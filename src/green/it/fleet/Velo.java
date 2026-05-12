/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package green.it.fleet;

/**
 *
 * @author MCHAUMES
 */
public class Velo {
    private String modele;
    private int niveauBatterie;
    private int capacite;
    private boolean estLoue;

    public Velo(String modele) {
        this.modele = modele;
        this.niveauBatterie = 100;
        this.capacite = 300;
        this.estLoue = false;
    }

    // Getters et Setters de base
    public String getModele() { return modele; }
    public void setCapacite(int capacite){
        if (capacite < 300 || capacite > 1000){
            return;
        }
        this.capacite = capacite;
    }
    private float calculDistance(){
        return (capacite * niveauBatterie / 100) / 5;
    }
    
    public int getNiveauBatterie() { return niveauBatterie; }
    public void setNiveauBatterie(int niveauBatterie) {
        if (niveauBatterie < 0 || niveauBatterie > 100){
            return;
        }
        this.niveauBatterie = niveauBatterie;
    }

    public boolean isEstLoue() { return estLoue; }
    public void setEstLoue(boolean estLoue) { this.estLoue = estLoue; }

    public void afficherInfos() {
        String statut = estLoue ? "Loué" : "Disponible";
        float distance = calculDistance();
        System.out.println("Velo " + modele + " | Batterie: " + niveauBatterie + "% | Statut: " + statut +
                " | Distance restante : " + distance + "Km");
    }
}
