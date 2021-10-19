public class Hauptmethode {
    public static void main(String[] args) {
        System.out.println();

        // Aus Sicht von einem Angreifer
        System.out.println("Aus der Sicht des Angreifers:");
        System.out.println("Anzahl Angreifer:       Anzahl Verteidiger:         W(Sieg):        W(Verlust):       W(Unentschieden): "); 
        Risiko risiko1 = new Risiko();
        double[] werte1 = risiko1.rechnen_eins_eins();
        System.out.println("1                       1                           " + Math.round(werte1[1]*100.0)/100.0 + "            " + Math.round(werte1[0]*100.0)/100.0 + "              -");

        Risiko risiko2 = new Risiko();
        double[] werte2 = risiko2.rechnen_eins_zwei();
        System.out.println("1                       2                           " + Math.round(werte2[1]*100.0)/100.0 + "            " + Math.round(werte2[0]*100.0)/100.0 + "              -");

        Risiko risiko3 = new Risiko();
        double[] werte3 = risiko3.rechnen_zwei_eins();
        System.out.println("2                       1                           " + Math.round(werte3[1]*100.0)/100.0 + "            " + Math.round(werte3[0]*100.0)/100.0 + "              -");

        Risiko risiko4 = new Risiko();
        double[] werte4 = risiko4.rechnen_zwei_zwei();
        System.out.println("2                       2                           " + Math.round(werte4[1]*100.0)/100.0 + "            " + Math.round(werte4[0]*100.0)/100.0 + "              " + Math.round(werte4[2]*100.0)/100.0);

        Risiko risiko5 = new Risiko();
        double[] werte5 = risiko5.rechnen_drei_eins();
        System.out.println("3                       1                           " + Math.round(werte5[1]*100.0)/100.0 + "            " + Math.round(werte5[0]*100.0)/100.0 + "              -");

        Risiko risiko6 = new Risiko();
        double[] werte6 = risiko6.rechnen_drei_zwei();
        System.out.println("3                       2                           " + Math.round(werte6[1]*100.0)/100.0 + "            " + Math.round(werte6[0]*100.0)/100.0 + "              " + Math.round(werte6[2]*100.0)/100.0);

        
        System.out.println();
        System.out.println();
        System.out.println();


        // Aus Sicht von einem Verteidiger
        System.out.println("Aus der Sicht des Verteidigers:");
        System.out.println("Anzahl Angreifer:       Anzahl Verteidiger:         W(Sieg):        W(Verlust):       W(Unentschieden): "); 
        System.out.println("1                       1                           " + Math.round(werte1[0]*100.0)/100.0 + "            " + Math.round(werte1[1]*100.0)/100.0 + "              -");
        System.out.println("1                       2                           " + Math.round(werte2[0]*100.0)/100.0 + "            " + Math.round(werte2[1]*100.0)/100.0 + "              -");
        System.out.println("2                       1                           " + Math.round(werte3[0]*100.0)/100.0 + "            " + Math.round(werte3[1]*100.0)/100.0 + "              -");
        System.out.println("2                       2                           " + Math.round(werte4[0]*100.0)/100.0 + "            " + Math.round(werte4[1]*100.0)/100.0 + "              " + Math.round(werte4[2]*100.0)/100.0);
        System.out.println("3                       1                           " + Math.round(werte5[0]*100.0)/100.0 + "            " + Math.round(werte5[1]*100.0)/100.0 + "              -");
        System.out.println("3                       2                           " + Math.round(werte6[0]*100.0)/100.0 + "            " + Math.round(werte6[1]*100.0)/100.0 + "              " + Math.round(werte6[2]*100.0)/100.0);

    }
}
