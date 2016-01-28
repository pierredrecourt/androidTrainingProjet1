package com.pedroprojets.trainingprojet1;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    // Première méthode appelée. Aussi appelée aprés qu'une App ait été tuée par le système
    // Bundle au 1er lancement de l'app / aprés qu'elle ait été quittée normalement = NULL
    // Bundle au retour de l'app aprés perte de focus ou redémarrage = Possibilité de données sauvegardées
    protected void onCreate(Bundle savedInstanceState) {
        // L'instruction 'super' indique qu'on fait appel à une méthode ou à un attribut de la superclasse
        // de la méthode, aka Classe parente (Activity pour notre exemple)
        // On appelle donc ici la méthode onCreate d'Activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
