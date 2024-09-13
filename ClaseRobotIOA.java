package RobotDGH;

public class ClaseRobotIOA {
    // Clase CabezaIAO
class CabezaIAO {
    private int ojos = 2;

    public String descripcion() {
        return "Cabeza con " + ojos + " ojos";
    }
}

// Clase ManosIAO
class ManosIAO {
    private int dedos = 5;

    public String descripcion() {
        return "Manos con " + dedos + " dedos";
    }
}

// Clase PiernasIAO
class PiernasIAO {
    private String ruedas = "ruedas";

    public String descripcion() {
        return "Piernas con " + ruedas;
    }
}

// Clase TorsoIAO
class TorsoIAO {
    private String motor = "motor eléctrico";

    public String descripcion() {
        return "Torso con " + motor;
    }
}

// Clase RobotIAO (composición de partes)
class RobotIAO {
    private CabezaIAO cabeza;
    private ManosIAO manos;
    private PiernasIAO piernas;
    private TorsoIAO torso;

    public RobotIAO(CabezaIAO cabeza, ManosIAO manos, PiernasIAO piernas, TorsoIAO torso) {
        this.cabeza = cabeza;
        this.manos = manos;
        this.piernas = piernas;
        this.torso = torso;
    }

    public String presentar() {
        return cabeza.descripcion() + ", " + manos.descripcion() + ", " + piernas.descripcion() + ", " + torso.descripcion();
    }
}

// Clase OutfitIAO
class OutfitIAO {
    protected String tipo;

    public OutfitIAO(String tipo) {
        this.tipo = tipo;
    }

    public String aplicar() {
        return "El robot está usando un outfit de tipo " + tipo;
    }
}

// Clase OutfitDeportivoIAO que hereda de OutfitIAO
class OutfitDeportivoIAO extends OutfitIAO {
    public OutfitDeportivoIAO() {
        super("Deportivo");
    }
}

// Clase OutfitFormalIAO que hereda de OutfitIAO
class OutfitFormalIAO extends OutfitIAO {
    public OutfitFormalIAO() {
        super("Formal");
    }
}

// Clase principal para ejecutar el código
public class MainIAO {
    public static void main(String[] args) {
        // Creamos las partes del robot
        CabezaIAO cabeza = new CabezaIAO();
        ManosIAO manos = new ManosIAO();
        PiernasIAO piernas = new PiernasIAO();
        TorsoIAO torso = new TorsoIAO();

        // Componemos el robot
        RobotIAO robot = new RobotIAO(cabeza, manos, piernas, torso);

        // Presentamos el robot
        System.out.println(robot.presentar());

        // Creamos outfits
        OutfitDeportivoIAO outfitDeportivo = new OutfitDeportivoIAO();
        OutfitFormalIAO outfitFormal = new OutfitFormalIAO();

        // Aplicamos los outfits al robot
        System.out.println(outfitDeportivo.aplicar());
        System.out.println(outfitFormal.aplicar());
    }
}

    
}
