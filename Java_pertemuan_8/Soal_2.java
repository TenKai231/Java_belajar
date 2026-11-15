package Java_pertemuan_8;

// Superclass
abstract class AlatMusik {

    abstract void mainkan();

}

// 1. Piano
class Piano extends AlatMusik {

    @Override
    void mainkan() {
        System.out.println("Piano menghasilkan suara dari tuts dan senar.");
    }
}

// 2. Biola
class Biola extends AlatMusik {

    @Override
    void mainkan() {
        System.out.println("Biola dimainkan dengan menggesek senar.");
    }
}

// 3. Gitar
class Gitar extends AlatMusik {

    @Override
    void mainkan() {
        System.out.println("Gitar dimainkan dengan memetik senar.");
    }
}

// 4. Drum
class Drum extends AlatMusik {

    @Override
    void mainkan() {
        System.out.println("Drum dimainkan dengan memukul membran.");
    }
}

// 5. Saxophone
class Saxophone extends AlatMusik {

    @Override
    void mainkan() {
        System.out.println("Saxophone dimainkan dengan meniup mouthpiece.");
    }
}

// 6. Trumpet
class Trumpet extends AlatMusik {

    @Override
    void mainkan() {
        System.out.println("Trumpet dimainkan dengan meniup dan menekan katup.");
    }
}

// Main class
public class Soal_2 {

    public static void main(String[] args) {

        AlatMusik[] musik = {
            new Piano(),
            new Biola(),
            new Gitar(),
            new Drum(),
            new Saxophone(),
            new Trumpet()
        };

        System.out.println("===== JENIS ALAT MUSIK =====");

        for (AlatMusik alat : musik) {
            alat.mainkan();
        }
    }
}
