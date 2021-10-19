public class Risiko{
    double wahrsch_sieg;
    double wahrsch_verlust;
    double wahrsch_unentschieden;

    // Sieg <=> Verteidiger gewinnt die auseinanderstzung
    int anzahl_siege = 0, anzahl_verluste = 0, anzahl_unentschieden = 0, anzahl_gesamt = 0;

    int würfel_angreifer_1 = 1, würfel_angreifer_2 = 1, würfel_angreifer_3 = 1;
    int würfel_verteidiger_1 = 1, würfel_verteidiger_2 = 1;

    int bester_würfel_angreifer, zweitbester_würfel_angreifer;
    int bester_würfel_verteidiger, zweitbester_würfel_verteidiger;

    public double[] rechnen(){
        while (würfel_angreifer_1 < 7) {
            while (würfel_angreifer_2 < 7) {
                while (würfel_angreifer_3 < 7) {
                    while(würfel_verteidiger_1 < 7 ){
                        while(würfel_verteidiger_2 < 7 ){
                            if (würfel_angreifer_1 >= würfel_angreifer_2 && würfel_angreifer_1 >= würfel_angreifer_3 && würfel_angreifer_2 >= würfel_angreifer_3){
                                bester_würfel_angreifer = würfel_angreifer_1;
                                zweitbester_würfel_angreifer = würfel_angreifer_2;
                            }else if (würfel_angreifer_1 >= würfel_angreifer_2 && würfel_angreifer_1 >= würfel_angreifer_3 && würfel_angreifer_3 >= würfel_angreifer_2){
                                bester_würfel_angreifer = würfel_angreifer_1;
                                zweitbester_würfel_angreifer = würfel_angreifer_3;
                            }else if (würfel_angreifer_2 >= würfel_angreifer_1 && würfel_angreifer_2 >= würfel_angreifer_3 && würfel_angreifer_1 >= würfel_angreifer_3){
                                bester_würfel_angreifer = würfel_angreifer_2;
                                zweitbester_würfel_angreifer = würfel_angreifer_1;
                            }else if (würfel_angreifer_2 >= würfel_angreifer_1 && würfel_angreifer_2 >= würfel_angreifer_3 && würfel_angreifer_3 >= würfel_angreifer_1){
                                bester_würfel_angreifer = würfel_angreifer_2;
                                zweitbester_würfel_angreifer = würfel_angreifer_3;
                            }else if (würfel_angreifer_3 >= würfel_angreifer_1 && würfel_angreifer_3 >= würfel_angreifer_2 && würfel_angreifer_1 >= würfel_angreifer_2){
                                bester_würfel_angreifer = würfel_angreifer_3;
                                zweitbester_würfel_angreifer = würfel_angreifer_1;
                            }else if (würfel_angreifer_3 >= würfel_angreifer_1 && würfel_angreifer_3 >= würfel_angreifer_2 && würfel_angreifer_2 >= würfel_angreifer_1){
                                bester_würfel_angreifer = würfel_angreifer_3;
                                zweitbester_würfel_angreifer = würfel_angreifer_2;
                            }

                            if (würfel_verteidiger_1 > würfel_verteidiger_2){
                                bester_würfel_verteidiger = würfel_verteidiger_1;
                                zweitbester_würfel_verteidiger = würfel_verteidiger_2;
                            }else {
                                bester_würfel_verteidiger = würfel_verteidiger_2;
                                zweitbester_würfel_verteidiger = würfel_verteidiger_1;
                            }

                            if (bester_würfel_verteidiger >= bester_würfel_angreifer && zweitbester_würfel_verteidiger >= zweitbester_würfel_angreifer){
                                anzahl_siege ++;
                            }else if(bester_würfel_verteidiger < bester_würfel_angreifer && zweitbester_würfel_verteidiger < zweitbester_würfel_angreifer){
                                anzahl_verluste ++;
                            }else if(bester_würfel_verteidiger >= bester_würfel_angreifer && zweitbester_würfel_verteidiger > zweitbester_würfel_angreifer){
                                anzahl_unentschieden ++;
                            }else if (bester_würfel_verteidiger < bester_würfel_angreifer && zweitbester_würfel_verteidiger >= zweitbester_würfel_angreifer){
                                anzahl_unentschieden ++;
                            }else{
                                anzahl_unentschieden ++;
                            }


                            anzahl_gesamt ++;
                            würfel_verteidiger_2 ++;
                        }
                        würfel_verteidiger_2 = 1;
                        würfel_verteidiger_1 ++;
                    }
                    würfel_verteidiger_1 = 1;
                    würfel_angreifer_3 ++;
                }
                würfel_angreifer_3 = 1;
                würfel_angreifer_2 ++;
            }
            würfel_angreifer_2 = 1;
            würfel_angreifer_1 ++;
        }
        wahrsch_sieg = anzahl_siege / anzahl_gesamt;
        wahrsch_unentschieden = anzahl_unentschieden / anzahl_gesamt;
        wahrsch_verlust = anzahl_verluste / anzahl_gesamt;

        // double[] resultat = new double[]{wahrsch_sieg, wahrsch_unentschieden, wahrsch_verlust};
        double[] resultat = new double[]{anzahl_siege, anzahl_unentschieden, anzahl_verluste, anzahl_gesamt};
        return resultat;
    }

}