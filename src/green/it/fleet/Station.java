/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package green.it.fleet;

import java.util.ArrayList;

/**
 *
 * @author MCHAUMES
 */
public class Station {
    private String nom;
    private ArrayList<Velo> inventaire;

    public Station(String nom) {
        this.nom = nom;
        this.inventaire = new ArrayList<>();
    }

    public void ajouterVelo(Velo v) {
        inventaire.add(v);
    }

    public void afficherEtatStation() {
        System.out.println("\n--- Etat de la station : " + nom + " ---");
        for (Velo v : inventaire) {
            v.afficherInfos();
        }
    }
}
