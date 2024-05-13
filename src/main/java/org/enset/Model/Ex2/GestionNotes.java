package org.enset.Model.Ex2;

import java.util.HashMap;
import java.util.Map;

public class GestionNotes {
    public static void main(String[] args) {
        // Création du map pour stocker les notes des étudiants
        Map<String, Double> notes = new HashMap<>();

        // Insérer des notes des étudiants
        notes.put("Alice", 15.5);
        notes.put("Bob", 18.0);
        notes.put("Charlie", 16.75);
        notes.put("David", 14.25);
        notes.put("Eve", 17.5);

        // Afficher la liste des notes après l'insertion
        System.out.println("Liste des notes après l'insertion :");
        afficherNotes(notes);

        // Augmenter la note d'un étudiant
        String etudiant = "Bob";
        if (notes.containsKey(etudiant)) {
            double nouvelleNote = notes.get(etudiant) + 1.0;
            notes.put(etudiant, nouvelleNote);
            System.out.println("\nNote de " + etudiant + " augmentée à " + nouvelleNote);
        } else {
            System.out.println("Étudiant non trouvé.");
        }

        // Afficher la liste des notes après l'augmentation
        System.out.println("\nListe des notes après l'augmentation :");
        afficherNotes(notes);

        // Supprimer la note d'un étudiant
        etudiant = "David";
        if (notes.containsKey(etudiant)) {
            notes.remove(etudiant);
            System.out.println("\nNote de " + etudiant + " supprimée.");
        } else {
            System.out.println("Étudiant non trouvé.");
        }

        // Afficher la liste des notes après la suppression
        System.out.println("\nListe des notes après la suppression :");
        afficherNotes(notes);

        // Afficher la taille du map
        System.out.println("\nTaille du map : " + notes.size());

        // Calculer la note moyenne, max et min
        double somme = 0.0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        boolean aNote20 = false;
        for (double note : notes.values()) {
            somme += note;
            max = Math.max(max, note);
            min = Math.min(min, note);
            if (note == 20.0) {
                aNote20 = true;
            }
        }
        double moyenne = somme / notes.size();
        System.out.println("Note moyenne : " + moyenne);
        System.out.println("Note maximale : " + max);
        System.out.println("Note minimale : " + min);
        System.out.println("Une note égale à 20 : " + aNote20);
    }

    // Méthode pour afficher les notes
    private static void afficherNotes(Map<String, Double> notes) {
        notes.forEach((etudiant, note) -> System.out.println(etudiant + " : " + note));
    }
}
