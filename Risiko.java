public class Risiko{
    
    // Sieg <=> Verteidiger gewinnt die auseinanderstzung
    double wahrsch_sieg;
    double wahrsch_verlust;
    double wahrsch_unentschieden;

    int anzahl_siege = 0, anzahl_verluste = 0, anzahl_unentschieden = 0, anzahl_gesamt = 0;

    int würfel_angreifer_1 = 1, würfel_angreifer_2 = 1, würfel_angreifer_3 = 1;
    int würfel_verteidiger_1 = 1, würfel_verteidiger_2 = 1;

    int bester_würfel_angreifer, zweitbester_würfel_angreifer;
    int bester_würfel_verteidiger, zweitbester_würfel_verteidiger;

    public double[] rechnen_eins_eins(){
        while (würfel_angreifer_1 < 7) {
            while(würfel_verteidiger_1 < 7 ){
                bester_würfel_angreifer = würfel_angreifer_1;

                bester_würfel_verteidiger = würfel_verteidiger_1;

                if (bester_würfel_verteidiger >= bester_würfel_angreifer){
                    anzahl_siege ++;
                }else {
                    anzahl_verluste ++;
                }
                anzahl_gesamt ++;
                würfel_verteidiger_1 ++;
            }
            würfel_verteidiger_1 = 1;
            würfel_angreifer_1 ++;
        }

        wahrsch_sieg = (double)anzahl_siege / (double)anzahl_gesamt;
        wahrsch_verlust = (double)anzahl_verluste / (double)anzahl_gesamt;

        return new double[]{wahrsch_sieg, wahrsch_verlust};
    }

    public double[] rechnen_eins_zwei(){
        while (würfel_angreifer_1 < 7) {
            while(würfel_verteidiger_1 < 7 ){
                while(würfel_verteidiger_2 < 7 ){
                    bester_würfel_angreifer = würfel_angreifer_1;

                    if (würfel_verteidiger_1 > würfel_verteidiger_2){
                        bester_würfel_verteidiger = würfel_verteidiger_1;
                    }else {
                        bester_würfel_verteidiger = würfel_verteidiger_2;
                    }

                    if (bester_würfel_verteidiger >= bester_würfel_angreifer){
                        anzahl_siege ++;
                    }else {
                        anzahl_verluste ++;
                    }
                    anzahl_gesamt ++;
                    würfel_verteidiger_2 ++;
                }
                würfel_verteidiger_2 = 1;
                würfel_verteidiger_1 ++;
            }
            würfel_verteidiger_1 = 1;
            würfel_angreifer_1 ++;
        }

        wahrsch_sieg = (double)anzahl_siege / (double)anzahl_gesamt;
        wahrsch_verlust = (double)anzahl_verluste / (double)anzahl_gesamt;

        return new double[]{wahrsch_sieg, wahrsch_verlust};
    }

    public double[] rechnen_zwei_eins(){
        while (würfel_angreifer_1 < 7) {
            while (würfel_angreifer_2 < 7) {
                while(würfel_verteidiger_1 < 7 ){
                    if (würfel_angreifer_1 > würfel_angreifer_2){
                        bester_würfel_angreifer = würfel_angreifer_1;
                    }else {
                        bester_würfel_angreifer = würfel_angreifer_2;
                    }

                    bester_würfel_verteidiger = würfel_verteidiger_1;

                    if (bester_würfel_verteidiger >= bester_würfel_angreifer ){
                        anzahl_siege ++;
                    }else{
                        anzahl_verluste ++;
                    }

                    anzahl_gesamt ++;
                    würfel_verteidiger_1 ++;
                }
                würfel_verteidiger_1 = 1;
                würfel_angreifer_2 ++;
            }
            würfel_angreifer_2 = 1;
            würfel_angreifer_1 ++;
        }

        wahrsch_sieg = (double)anzahl_siege / (double)anzahl_gesamt;
        wahrsch_verlust = (double)anzahl_verluste / (double)anzahl_gesamt;

        return new double[]{wahrsch_sieg, wahrsch_verlust};
    }

    public double[] rechnen_zwei_zwei(){
        while (würfel_angreifer_1 < 7) {
            while (würfel_angreifer_2 < 7) {
                while(würfel_verteidiger_1 < 7 ){
                    while(würfel_verteidiger_2 < 7 ){
                        if (würfel_angreifer_1 > würfel_angreifer_2){
                            bester_würfel_angreifer = würfel_angreifer_1;
                            zweitbester_würfel_angreifer = würfel_angreifer_2;
                        }else {
                            bester_würfel_angreifer = würfel_angreifer_2;
                            zweitbester_würfel_angreifer = würfel_angreifer_1;
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
                        }else if(bester_würfel_verteidiger >= bester_würfel_angreifer && zweitbester_würfel_verteidiger < zweitbester_würfel_angreifer){
                            anzahl_unentschieden ++;
                        }else if (bester_würfel_verteidiger < bester_würfel_angreifer && zweitbester_würfel_verteidiger >= zweitbester_würfel_angreifer){
                            anzahl_unentschieden ++;
                        }
                        anzahl_gesamt ++;
                        würfel_verteidiger_2 ++;
                    }
                    würfel_verteidiger_2 = 1;
                    würfel_verteidiger_1 ++;
                }
                würfel_verteidiger_1 = 1;
                würfel_angreifer_2 ++;
            }
            würfel_angreifer_2 = 1;
            würfel_angreifer_1 ++;
        }

        wahrsch_sieg = (double)anzahl_siege / (double)anzahl_gesamt;
        wahrsch_unentschieden = (double)anzahl_unentschieden / (double)anzahl_gesamt;
        wahrsch_verlust = (double)anzahl_verluste / (double)anzahl_gesamt;

        return new double[]{wahrsch_sieg, wahrsch_verlust, wahrsch_unentschieden};
    }

    public double[] rechnen_drei_eins(){
        while (würfel_angreifer_1 < 7) {
            while (würfel_angreifer_2 < 7) {
                while (würfel_angreifer_3 < 7) {
                    while(würfel_verteidiger_1 < 7 ){
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

                        bester_würfel_verteidiger = würfel_verteidiger_1;

                        if (bester_würfel_verteidiger >= bester_würfel_angreifer){
                            anzahl_siege ++;
                        }else {
                            anzahl_verluste ++;
                        }


                        anzahl_gesamt ++;
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

        wahrsch_sieg = (double)anzahl_siege / (double)anzahl_gesamt;
        wahrsch_verlust = (double)anzahl_verluste / (double)anzahl_gesamt;

        return new double[]{wahrsch_sieg, wahrsch_verlust};
    }

    public double[] rechnen_drei_zwei(){
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
                            }else if(bester_würfel_verteidiger >= bester_würfel_angreifer && zweitbester_würfel_verteidiger < zweitbester_würfel_angreifer){
                                anzahl_unentschieden ++;
                            }else if (bester_würfel_verteidiger < bester_würfel_angreifer && zweitbester_würfel_verteidiger >= zweitbester_würfel_angreifer){
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

        wahrsch_sieg = (double)anzahl_siege / (double)anzahl_gesamt;
        wahrsch_unentschieden = (double)anzahl_unentschieden / (double)anzahl_gesamt;
        wahrsch_verlust = (double)anzahl_verluste / (double)anzahl_gesamt;

        return new double[]{wahrsch_sieg, wahrsch_verlust, wahrsch_unentschieden};
    }
}