package one.digitalinnovation.statics;

public class Programa {

    public static void main(String[] args) {
        final Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "Bípede";

        final Cachorro viralatas = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viralatas.zoologia);

        Cachorro.late();
    }
}
