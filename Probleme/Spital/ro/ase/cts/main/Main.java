package ro.ase.cts.main;

import ro.ase.cts.pacienti.clase.Pacient;
import ro.ase.cts.pacienti.builder.PacientBuilder;
import ro.ase.cts.personal.Personal;
import ro.ase.cts.personal.factory.PersonalSpitalFactory;
import ro.ase.cts.personal.medical.factory.PersonalMedicalFactory;
import ro.ase.cts.personal.medical.factory.TipPersonalMedical;
import ro.ase.cts.retete.Reteta;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // A.1
        Pacient pacient = new PacientBuilder()
                .setNume("Andrei")
                .setPrenume("Mihnea")
                .setPapuciCamera(true)
                .build();

        System.out.println(pacient);

        // A.2 si A.3
        PersonalSpitalFactory factory = new PersonalMedicalFactory(TipPersonalMedical.Medic);
        Personal medic = factory.createPersonal("Dr. Andrei");

        // A.4
        Reteta reteta = new Reteta("Paracetamol 200mg");
        Reteta retata2 = (Reteta) reteta.copiaza();
        retata2.setNume("Paracetamol 250mg");

        
    }
}
