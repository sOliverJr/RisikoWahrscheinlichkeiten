public class Hauptmethode {
    public static void main(String[] args) {
        Risiko risiko = new Risiko();
        double[] werte = risiko.rechnen();
        System.out.println("Die Wahrscheinlichkeit zu gewinnen ist: " + (werte[0] / werte[3]));
        System.out.println("Die Wahrscheinlichkeit zu verlieren ist: " + (werte[2] / werte[3]));
        System.out.println("Die Wahrscheinlichkeit zu Unentschieden ist: " + (werte[1] / werte[3]));
        System.out.println("Die insgesamte Wahrscheinlichkeit ist: " + ((werte[0] / werte[3]) + (werte[1] / werte[3]) + (werte[2] / werte[3])));
    }
}
