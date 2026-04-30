package ro.ase.cts.main;

import ro.ase.cts.a10.ModulInternariFlyweight;
import ro.ase.cts.a11.ModulPlataStrategy;
import ro.ase.cts.a12.ModulNotificariObserver;
import ro.ase.cts.a13.ModulPacientState;
import ro.ase.cts.a14.ModulInternareTemplate;
import ro.ase.cts.a15.ModulTriajCommand;
import ro.ase.cts.a5.ModulFarmacieAdapter;
import ro.ase.cts.a6.ModulInternareFacade;
import ro.ase.cts.a7.ModulRezultateDecorator;
import ro.ase.cts.a8.ModulDepartamenteComposite;
import ro.ase.cts.a9.ModulInternareProxy;
import ro.ase.cts.pacienti.clase.Pacient;
import ro.ase.cts.pacienti.builder.PacientBuilder;
import ro.ase.cts.personal.Personal;
import ro.ase.cts.personal.factory.PersonalSpitalFactory;
import ro.ase.cts.personal.medical.factory.PersonalMedicalFactory;
import ro.ase.cts.personal.medical.factory.TipPersonalMedical;
import ro.ase.cts.retete.Reteta;

import java.util.Arrays;

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

        // A.5 - Adapter
        ModulFarmacieAdapter.MedicamentSpital medicamentAdapter =
                new ModulFarmacieAdapter.AdapterMedicamentFarmacie(new ModulFarmacieAdapter.MedicamentFarmacie());
        medicamentAdapter.achizitioneazaMedicament();

        // A.6 - Facade
        ModulInternareFacade.InternareFacade internareFacade = new ModulInternareFacade.InternareFacade();
        boolean internabil = internareFacade.poateFiInternat(
                new ModulInternareFacade.Pacient("Ionescu", true),
                new ModulInternareFacade.Medic(),
                new ModulInternareFacade.Salon(Arrays.asList(1, 2))
        );
        System.out.println("Poate fi internat: " + internabil);

        // A.7 - Decorator
        ModulRezultateDecorator.Rezultate rezultate =
                new ModulRezultateDecorator.RezultateOnlineDecorator(new ModulRezultateDecorator.RezultatePrintate());
        rezultate.afiseazaRezultate("Popescu");

        // A.8 - Composite
        ModulDepartamenteComposite.Departament departament = new ModulDepartamenteComposite.Departament("Medical");
        departament.adauga(new ModulDepartamenteComposite.Sectie("Cardiologie"));
        departament.adauga(new ModulDepartamenteComposite.Sectie("Pediatrie"));
        departament.afiseaza("");

        // A.9 - Proxy
        ModulInternareProxy.ServiciuInternare serviciuInternare =
                new ModulInternareProxy.InternareAsiguratiProxy(new ModulInternareProxy.InternareSpital());
        serviciuInternare.interneaza("Marin", false);
        serviciuInternare.interneaza("Vasile", true);

        // A.10 - Flyweight
        ModulInternariFlyweight.FabricaPacienti fabricaPacienti = new ModulInternariFlyweight.FabricaPacienti();
        ModulInternariFlyweight.PacientFlyweight pacientFlyweight =
                fabricaPacienti.getPacient("1234567890123", "Georgescu", "0700000000", "Bucuresti");
        pacientFlyweight.afiseazaInternare(new ModulInternariFlyweight.DateInternare(12, 3, 5));
        pacientFlyweight.afiseazaInternare(new ModulInternariFlyweight.DateInternare(8, 1, 2));

        // A.11 - Strategy
        ModulPlataStrategy.PlataPacient plataPacient = new ModulPlataStrategy.PlataPacient();
        plataPacient.setModPlata(new ModulPlataStrategy.PlataCard());
        plataPacient.efectueazaPlata(350.0);
        plataPacient.setModPlata(new ModulPlataStrategy.PlataCash());
        plataPacient.efectueazaPlata(150.0);

        // A.12 - Observer
        ModulNotificariObserver.Spital spital = new ModulNotificariObserver.Spital();
        spital.aboneaza(new ModulNotificariObserver.PacientAbonat("Ana"));
        spital.aboneaza(new ModulNotificariObserver.PacientAbonat("Mihai"));
        spital.anuntaEpidemie("Virus-X");

        // A.13 - State
        ModulPacientState.PacientContext pacientState = new ModulPacientState.PacientContext("Dumitru");
        pacientState.schimbaStare(new ModulPacientState.SubObservatie());
        pacientState.schimbaStare(new ModulPacientState.Externat());

        // A.14 - Template
        ModulInternareTemplate.InternareTemplate internareTemplate = new ModulInternareTemplate.InternareStandard();
        internareTemplate.interneazaPacient("Stan");

        // A.15 - Command
        ModulTriajCommand.OperatorPrimire operator = new ModulTriajCommand.OperatorPrimire();
        ModulTriajCommand.Medic medicUrgenta = new ModulTriajCommand.Medic("Ionescu");
        operator.trimiteComanda(new ModulTriajCommand.ComandaInternare(medicUrgenta, "Pacient A"));
        operator.trimiteComanda(new ModulTriajCommand.ComandaTratareUrgenta(medicUrgenta, "Pacient B"));
        operator.proceseazaComenzi();
    }
}
