package com.company;

import java.util.Vector;

public class Info {

        public Vector<LadaFrigorifica> vectorLF() {
                LadaFrigorifica lf1 = new LadaFrigorifica("Frigorifice", 1399.99f, true, "AO47P30", "Arctic",
                                "4.7 stele", "C", "Alb");
                LadaFrigorifica lf2 = new LadaFrigorifica("Frigorifice", 918.99f, true, "HCF_205NHA+", "Heinner",
                                "5 stele", "F", "Alb");
                LadaFrigorifica lf3 = new LadaFrigorifica("Frigorifice", 1149.99f, true, "HCF_205NHSA+", "Heinner",
                                "3.6 stele", "A+", "Silver");
                LadaFrigorifica lf4 = new LadaFrigorifica("Frigorifice", 1499.99f, true, "HSA37540N", "Beko",
                                "4.96 stele", "F", "Alb");
                LadaFrigorifica lf5 = new LadaFrigorifica("Frigorifice", 1079.99f, true, "HCF_205NHBKA+", "Heinner",
                                "4.8 stele", "A+", "Negru");
                LadaFrigorifica lf6 = new LadaFrigorifica("Frigorifice", 916.30f, true, "HCF_H205A+", "Heinner",
                                "4.63 stele", "A+", "Alb");
                LadaFrigorifica lf7 = new LadaFrigorifica("Frigorifice", 899.0f, true, "CFFM_198FWH", "Star_Light",
                                "4.1 stele", "F", "Alb");
                LadaFrigorifica lf8 = new LadaFrigorifica("Frigorifice", 1599.99f, true, "WHM3911", "Whirpool",
                                "4.87 stele", "A+", "Alb");
                LadaFrigorifica lf9 = new LadaFrigorifica("Frigorifice", 3133.98f, true, "ARKTIC by Hendi",
                                "ARKTIC by Hendi", "4.7 stele", "F", "Alb");
                LadaFrigorifica lf10 = new LadaFrigorifica("Frigorifice", 11909.52f, false, "Paris 210 LED_HI ADT",
                                "AHT", "fara", "F", "Alb");
                LadaFrigorifica lf11 = new LadaFrigorifica("Frigorifice", 4729.06f, true, "Sao Paulo H 175", "AHT",
                                "fara", "F", "Alb");
                LadaFrigorifica lf12 = new LadaFrigorifica("Frigorifice", 1289.0f, true, "AO40P30+", "Arctic",
                                "4.63 stele", "F", "Alb");

                Vector<LadaFrigorifica> LF = new Vector<LadaFrigorifica>(12);
                LF.add(0, lf1);
                LF.add(1, lf2);
                LF.add(2, lf3);
                LF.add(3, lf4);
                LF.add(4, lf5);
                LF.add(5, lf6);
                LF.add(6, lf7);
                LF.add(7, lf8);
                LF.add(8, lf9);
                LF.add(9, lf10);
                LF.add(10, lf11);
                LF.add(11, lf12);

                return LF;
        }

        public Vector<Frigider> vectorFrigidere() {
                Frigider f1 = new Frigider("Frigorifice", 1149.99f, true, "AD60310M30MT", "Arctic", "4.63", "Standard",
                                "Fara", "F");
                Frigider f2 = new Frigider("Frigorifice", 899.99f, true, "FDDV_213F", "Star-Light", "4.82", "Standard",
                                "Fara", "F");
                Frigider f3 = new Frigider("Frigorifice", 1799.99f, true, "RT38K5530S9_EO", "Samsung", "4.38",
                                "Incorporabil", "amoled", "F");
                Frigider f4 = new Frigider("Frigorifice", 599.99f, true, "MDRD142FGF42", "MIDEA", "4.7", "Standard",
                                "Fara", "F");
                Frigider f5 = new Frigider("Frigorifice", 2209.99f, true, "RDNE505E30DZMN", "Beko", "4.7", "Standard",
                                "Touchscreen", "E");
                Frigider f6 = new Frigider("Frigorifice", 1679.99f, true, "RDNT401I30WBN", "Beko", "4.7",
                                "Incorporabil", "Touchcreen", "F");
                Frigider f7 = new Frigider("Frigorifice", 5099.99f, true, "K 28202SD", "Miele", "3.1", "Standard",
                                "Touchscreen", "F");
                Frigider f8 = new Frigider("Frigorifice", 1828.99f, false, "FBM260L", "CHiQ", "4.6", "Incorporabil",
                                "Fara", "F");
                Frigider f9 = new Frigider("Frigorifice", 1091.99f, true, "AK54305M30MT", "Arctic", "4.8", "Standard",
                                "Fara", "F");
                Frigider f10 = new Frigider("Frigorifice", 1449.99f, true, "AK60366M40NF", "Arctic", "4.7", "Standard",
                                "Fara", "F");
                Frigider f11 = new Frigider("Frigorifice", 2089.99f, true, "RN_308RDQM", "Daewoo", "4.63", "Standard",
                                "vise", "H");
                Frigider f12 = new Frigider("Frigorifice", 3899.99f, true, "KFN 28132 ws", "Miele", "4.63",
                                "Incorporabil", "Touchscreen", "F");

                Vector<Frigider> F = new Vector<Frigider>(12);
                F.add(0, f1);
                F.add(1, f2);
                F.add(2, f3);
                F.add(3, f4);
                F.add(4, f5);
                F.add(5, f6);
                F.add(6, f7);
                F.add(7, f8);
                F.add(8, f9);
                F.add(9, f10);
                F.add(10, f11);
                F.add(11, f12);

                return F;

        }

        public Vector<Espressor> vectorEspressor() {
                Espressor es1 = new Espressor("Espressor", 299.90f, true, "Essenza Mini Ruby", "De Longhi",
                                "4.83 stele", "Rosu", 1260f, "Capsule");
                Espressor es2 = new Espressor("Espressor", 2559.90f, true, "Seria 4300 EP4349/70", "Philips",
                                "4.95 stele", "Negru", 1500f, "Boabe");
                Espressor es3 = new Espressor("Espressor", 197.99f, true, "Tassimo Vivy II TAS1404", "Bosch",
                                "3.70 stele", "Alb", 1300f, "Capsule");
                Espressor es4 = new Espressor("Espressor", 239.99f, true, "NESCAFÉ Dolce Gusto", "Krups", "4.63 stele",
                                "Rosu", 1500f, "Caspule");
                Espressor es5 = new Espressor("Espressor", 2999.99f, true, "GranAroma SM6580", "Saeco ", "5 stele",
                                "Gri", 1500f, "Macinata/Boabe");
                Espressor es6 = new Espressor("Espressor", 1288.99f, true, "Picto Arabica", "Krups", "4.68 stele",
                                "Negru", 1450f, "Macinata/Boabe");
                Espressor es7 = new Espressor("Espressor", 389.90f, true, "Essenza Mini", "Krups", "4.94 stele",
                                "Negru", 1300, "Capsule");
                Espressor es8 = new Espressor("Espressor", 405.93f, true, "Genio S Touch ", "Krups", "5 stele",
                                "Argintiu", 1500, "Capsule");
                Espressor es9 = new Espressor("Espressor", 1649.90f, true, "Intuition", "Krups", "4.70 stele", "Negru",
                                1450, "Negru");
                Espressor es10 = new Espressor("Espressor", 1599.90f, false, "ECAM 22.110 ", "DeLonghi", "4.64 stele",
                                "Argintiu", 1450f, "Macinata/Boabe");

                Vector<Espressor> es = new Vector<>(10);
                es.add(1, es1);
                es.add(2, es2);
                es.add(3, es3);
                es.add(4, es4);
                es.add(5, es5);
                es.add(6, es6);
                es.add(7, es7);
                es.add(8, es8);
                es.add(9, es9);
                es.add(10, es10);

                return es;
        }

        public Vector<CafetieraFiltru> vectorCafetiere() {
                CafetieraFiltru cf1 = new CafetieraFiltru("Cafetiera", 174.99f, true, "HD7459", "PHILIPS ", "5.0 stele",
                                "Negru", "Macinata");
                CafetieraFiltru cf2 = new CafetieraFiltru("Cafetiera", 89.90f, true, "CFM4350B", "BEKO", "4.8 stele",
                                "Negru", "Macinata");
                CafetieraFiltru cf3 = new CafetieraFiltru("Cafetiera", 172.90f, true, "Subito Mug", "TEFAL ",
                                "4.9 stele", "Negru", "Macinata");
                CafetieraFiltru cf4 = new CafetieraFiltru("Cafetiera", 183.93f, true, "MY4442", "MYRIA ", "No Reviews",
                                "Gri", "Macinata");
                CafetieraFiltru cf5 = new CafetieraFiltru("Cafetiera", 293.34f, true, "MY4444", "MYRIA", "No Reviews",
                                "Gri", "Boabe/Macinata");
                CafetieraFiltru cf6 = new CafetieraFiltru("Cafetiera", 692.90f, true, "AromaFresh ", "MELITTA ",
                                "4 stele", "Greu", "Boabe/Macinata");
                CafetieraFiltru cf7 = new CafetieraFiltru("Cafetiera", 398.93f, true, "Delisia KM8680", "GRUNDIG ",
                                "4 stele", "Argintiu", "Macinata");
                CafetieraFiltru cf8 = new CafetieraFiltru("Cafetiera ", 319.93f, false, "BKK2300ALB", "BEKO",
                                "4.8 stele", "Alb", "Macinata");
                CafetieraFiltru cf9 = new CafetieraFiltru("Cafetiera", 189.90f, true, "Compact Home", "Russel Hobbs",
                                "4.3 stele", "Argintiu", "Macinata");
                CafetieraFiltru cf10 = new CafetieraFiltru("Cafetiera", 135.92f, true, "EKF3300", "Electrolux",
                                "5 stele", "Negru", "Macinata");

                Vector<CafetieraFiltru> cf = new Vector<>(10);
                cf.add(1, cf1);
                cf.add(2, cf2);
                cf.add(3, cf3);
                cf.add(4, cf4);
                cf.add(5, cf5);
                cf.add(6, cf6);
                cf.add(7, cf7);
                cf.add(8, cf8);
                cf.add(9, cf9);
                cf.add(10, cf10);

                return cf;
        }

        public Vector<MasinaSpalatRufe> vectorMasinaSpalatRufe() {
                // Masina de Spalat rufe si Masina de spalat Vase testare.
                MasinaSpalatRufe r1 = new MasinaSpalatRufe("Masini de spalat rufe", 5500.99f, true, "ghfs56", "Arctic",
                                "4.5", "incorporat", "LED", "A+", 12, "Spalare la 30grade, Spalare la 800 rpm");
                MasinaSpalatRufe r2 = new MasinaSpalatRufe("Masini de spalat rufe", 4500.99f, true, "ghfs57", "Beko",
                                "4.2", "incorporat", "LED", "A++", 15, "Spalare la 30grade, Spalare la 800 rpm");
                MasinaSpalatRufe r3 = new MasinaSpalatRufe("Masini de spalat rufe", 3123.99f, false, "ghfs58",
                                "Whirlpool", "3.5", "incorporat", "LCD", "A+", 10,
                                "Spalare la 30grade, Spalare la 800 rpm");
                MasinaSpalatRufe r4 = new MasinaSpalatRufe("Masini de spalat rufe", 3213.99f, true, "ghfs59", "Samsung",
                                "1.5", "incorporat", "LED", "A+++", 6, "Spalare la 30grade, Spalare la 800 rpm");
                MasinaSpalatRufe r5 = new MasinaSpalatRufe("Masini de spalat rufe", 6666.99f, true, "ghfs60", "LG", "5",
                                "incorporat", "LED", "A+", 8, "Spalare la 30grade, Spalare la 800 rpm");
                MasinaSpalatRufe r6 = new MasinaSpalatRufe("Masini de spalat rufe", 3263.99f, false, "ghfs61", "BOSCH",
                                "4.78", "incorporat", "LCD", "A++", 12, "Spalare la 30grade, Spalare la 800 rpm");
                MasinaSpalatRufe r7 = new MasinaSpalatRufe("Masini de spalat rufe", 6574.99f, true, "ghfs62",
                                "Electrolux", "3.12", "incorporat", "LED", "A+", 7,
                                "Spalare la 30grade, Spalare la 800 rpm");
                MasinaSpalatRufe r8 = new MasinaSpalatRufe("Masini de spalat rufe", 6456.99f, true, "ghfs63", "Gorenje",
                                "2.89", "incorporat", "LCD", "A+", 20, "Spalare la 30grade, Spalare la 800 rpm");
                MasinaSpalatRufe r9 = new MasinaSpalatRufe("Masini de spalat rufe", 3567.99f, false, "ghfs64", "Candy",
                                "4.89", "incorporat", "LED", "A+++", 16, "Spalare la 30grade, Spalare la 800 rpm");
                MasinaSpalatRufe r10 = new MasinaSpalatRufe("Masini de spalat rufe", 8755.99f, true, "ghfs65",
                                "Indesit", "5", "incorporat", "LED", "A+", 12,
                                "Spalare la 30grade, Spalare la 800 rpm");

                Vector<MasinaSpalatRufe> mRufe = new Vector<>(10);
                mRufe.add(0, r1);
                mRufe.add(1, r2);
                mRufe.add(2, r3);
                mRufe.add(3, r4);
                mRufe.add(4, r5);
                mRufe.add(5, r6);
                mRufe.add(6, r7);
                mRufe.add(7, r8);
                mRufe.add(8, r9);
                mRufe.add(9, r10);

                return mRufe;
        }

        public Vector<MasinaSpalatVase> vectorMasinaSpalatVase() {
                MasinaSpalatVase v1 = new MasinaSpalatVase("Masini de spalat vase", 5039.99f, true, "ajdh49871", "Acer",
                                "3", "incorporat", "LCD", "A+", 4, "Spalare rapida, Spalare  cu temperatura scazuta");
                MasinaSpalatVase v2 = new MasinaSpalatVase("Masini de spalat vase", 3853.99f, true, "ajdh49872",
                                "Arctic", "3", "incorporat", "LED", "A++", 2,
                                "Spalare rapida, Spalare  cu temperatura scazuta");
                MasinaSpalatVase v3 = new MasinaSpalatVase("Masini de spalat vase", 7498.99f, false, "ajdh49873",
                                "Whirlpool", "3", "incorporat", "LCD", "A+", 3,
                                "Spalare rapida, Spalare  cu temperatura scazuta");
                MasinaSpalatVase v4 = new MasinaSpalatVase("Masini de spalat vase", 2212.99f, true, "ajdh49874",
                                "Samsung", "3", "incorporat", "LED", "A+", 6,
                                "Spalare rapida, Spalare  cu temperatura scazuta");
                MasinaSpalatVase v5 = new MasinaSpalatVase("Masini de spalat vase", 7437.99f, true, "ajdh49875", "LG",
                                "3", "incorporat", "LCD", "A+++", 5, "Spalare rapida, Spalare  cu temperatura scazuta");
                MasinaSpalatVase v6 = new MasinaSpalatVase("Masini de spalat vase", 4276.99f, false, "ajdh49876",
                                "BOSCH", "3", "incorporat", "LCD", "A+", 10,
                                "Spalare rapida, Spalare  cu temperatura scazuta");
                MasinaSpalatVase v7 = new MasinaSpalatVase("Masini de spalat vase", 7792.99f, true, "ajdh49877",
                                "Gorenje", "3", "incorporat", "LED", "A+", 8,
                                "Spalare rapida, Spalare  cu temperatura scazuta");
                MasinaSpalatVase v8 = new MasinaSpalatVase("Masini de spalat vase", 7420.99f, true, "ajdh49878",
                                "Candy", "3", "incorporat", "LCD", "A++", 6,
                                "Spalare rapida, Spalare  cu temperatura scazuta");
                MasinaSpalatVase v9 = new MasinaSpalatVase("Masini de spalat vase", 5998.99f, false, "ajdh49879",
                                "Indesit", "3", "incorporat", "LED", "A+", 3,
                                "Spalare rapida, Spalare  cu temperatura scazuta");
                MasinaSpalatVase v10 = new MasinaSpalatVase("Masini de spalat vase", 4898.99f, true, "ajdh49880",
                                "Electrolux", "3", "incorporat", "LCD", "A+++", 7,
                                "Spalare rapida, Spalare  cu temperatura scazuta");

                Vector<MasinaSpalatVase> mVase = new Vector<>(10);
                mVase.add(0, v1);
                mVase.add(1, v2);
                mVase.add(2, v3);
                mVase.add(3, v4);
                mVase.add(4, v5);
                mVase.add(5, v6);
                mVase.add(6, v7);
                mVase.add(7, v8);
                mVase.add(8, v9);
                mVase.add(9, v10);

                return mVase;
        }


        public static Vector<CuptoareElectrice> vectorCuptoareElectrice() {
                CuptoareElectrice ce1 = new CuptoareElectrice("Cuptoare Electrice", 599.99f, true, "CEA-4520DBL",
                                "Star-Light", "5", "Prajire, Grilling, Convectie, Coacere", "Negru",
                                "Oprire automata, Iluminare, Timer, Termostat, Semnal acustic, Indicator luminos, Dezghetare",
                                2000, 230);
                CuptoareElectrice ce2 = new CuptoareElectrice("Cuptoare Electrice", 235.03f, true, "Floria-2898",
                                "Floria", "4.3", "Prajire, Coacere, Patiserie, Rumenire", "Negru",
                                "Termostat, Indicator luminos", 1500, 320);
                CuptoareElectrice ce3 = new CuptoareElectrice("Cuptoare Electrice", 333.20f, true, "ZLN-3130", "ZILAN",
                                "4.3", "Sotare, Coacere, Gratinat, Patiserie, Rumenire", "Gri",
                                "Oprire automata, Termostat, Semnal acustic", 1300, 300);
                CuptoareElectrice ce4 = new CuptoareElectrice("Cuptoare Electrice", 399.99f, true, "CEA-3016CBL",
                                "Star-Light", "4,8", "Prajire, Grilling, Convectie, Coacere", "Negru",
                                "Oprire automata, Iluminare, Timer, Termostat, Semnal acustic, Indicator luminos", 1600,
                                230);
                CuptoareElectrice ce5 = new CuptoareElectrice("Cuptoare Electrice", 234.99f, false, "A28B2", "Albatros",
                                "4.8", "Prajire, Frigere, Coacere", "Negru", "Semnal acustic", 1500, 230);
                CuptoareElectrice ce6 = new CuptoareElectrice("Cuptoare Electrice", 449.00f, true,
                                "Express Air Fry 26095-56", "Russell Hobbs", "5", "Prajire, Convectie, Coacere",
                                "Argintiu", "Timer, Mentinere la cald", 1500, 220);
                CuptoareElectrice ce7 = new CuptoareElectrice("Cuptoare Electrice", 338.00f, true, "CS45B2", "Samus",
                                "4.6", "Coacere", "Negru", "Semnal acustic", 2000, 230);
                CuptoareElectrice ce8 = new CuptoareElectrice("Cuptoare Electrice", 159.90f, true, "MN-1009", "MUHLER",
                                "0", "Frigere", "Negru", "Timer", 650, 230);
                CuptoareElectrice ce9 = new CuptoareElectrice("Cuptoare Electrice", 249.00f, true, "HarlemÂ® Rustic",
                                "Harlem", "3.8", "Prajire, Coacere, Patiserie", "Visiniu", "Termostat", 1300, 320);
                CuptoareElectrice ce10 = new CuptoareElectrice("Cuptoare Electrice", 849.01f, true, "42814",
                                "Gastroback", "5", "Grilling, Convectie, Coacere", "Negru/Inox",
                                "Oprire automata, Iluminare, Timer, Termostat", 1500, 230);

                Vector<CuptoareElectrice> CE = new Vector<CuptoareElectrice>(10);
                CE.add(0, ce1);
                CE.add(1, ce2);
                CE.add(2, ce3);
                CE.add(3, ce4);
                CE.add(4, ce5);
                CE.add(5, ce6);
                CE.add(6, ce7);
                CE.add(7, ce8);
                CE.add(8, ce9);
                CE.add(9, ce10);

                return CE;
        }

        public static Vector<CuptoareMicrounde> vectorCuptoareMicrounde() {
                CuptoareMicrounde cm1 = new CuptoareMicrounde("Cuptoare cu Microunde", 256.99f, true, "KOR-6S20W",
                                "Daewoo", "4.5", "Standard", "Mecanic", "Microunde", "Alb",
                                "Timer, Pornire intarziata, Interior neaderent");
                CuptoareMicrounde cm2 = new CuptoareMicrounde("Cuptoare cu Microunde", 229.99f, true, "AMG17M70VH",
                                "Hansa", "4.5", "Standard", "Mecanic", "Microunde", "Alb",
                                "Timer, Blocare acces copii, Semnal sonor la finalizarea programului");
                CuptoareMicrounde cm3 = new CuptoareMicrounde("Cuptoare cu Microunde", 306.99f, true, "MS23K3515AK/OL",
                                "Samsung", "4.6", "Standard", "Digital", "Microunde", "Negru",
                                "Timer, Blocare acces copii, Semnal sonor la finalizarea programului, Elimina mirosuri neplacute, Afisare ceas, Mod Eco, Auto cook");
                CuptoareMicrounde cm4 = new CuptoareMicrounde("Cuptoare cu Microunde", 309.00f, true, "20MWS-706M/B",
                                "BBK", "0", "Standard", "Digital", "Microunde", "Negru",
                                "Timer, Semnal sonor la finalizarea programului");
                CuptoareMicrounde cm5 = new CuptoareMicrounde("Cuptoare cu Microunde", 319.99f, true, "HMW-20GRD",
                                "HEINNER", "4.7", "Standard", "Digital", "Microunde, Grill", "Rosu",
                                "Timer, Blocare acces copii, Semnal sonor la finalizarea programului");
                CuptoareMicrounde cm6 = new CuptoareMicrounde("Cuptoare cu Microunde", 329.99f, true, "ZFM20100SA",
                                "Zanussi", "4.8", "Standard", "Mecanic", "Microunde", "Argintiu",
                                "Timer, Iluminare interioara, Semnal sonor la finalizarea programului");
                CuptoareMicrounde cm7 = new CuptoareMicrounde("Cuptoare cu Microunde", 349.99f, false, "KOR-669RC",
                                "Daewoo", "4.8", "Standard", "Digital", "Microunde", "Crem",
                                "Oprire automata, Timer, Blocare acces copii, Semnal sonor la finalizarea programului, Mod Eco, Auto cook");
                CuptoareMicrounde cm8 = new CuptoareMicrounde("Cuptoare cu Microunde", 354.99f, true, "MM2005/RD",
                                "Oursson", "5", "Standard", "Mecanic", "Microunde", "Rosu",
                                "Timer, Functie de decongelare");
                CuptoareMicrounde cm9 = new CuptoareMicrounde("Cuptoare cu Microunde", 375.90f, true, "FMO-2073BS",
                                "Finlux", "4.5", "Standard", "Mecanic", "Microunde", "Negru/Argintiu",
                                "Iluminare interioara");
                CuptoareMicrounde cm10 = new CuptoareMicrounde("Cuptoare cu Microunde", 379.99f, true, "MO20E1S",
                                "Gorenje", "4.8", "Standard", "Digital", "Microunde", "Argintiu",
                                "Semnal sonor la finalizarea programului, Functia AquaClean");

                Vector<CuptoareMicrounde> CM = new Vector<CuptoareMicrounde>(10);
                CM.add(0, cm1);
                CM.add(1, cm2);
                CM.add(2, cm3);
                CM.add(3, cm4);
                CM.add(4, cm5);
                CM.add(5, cm6);
                CM.add(6, cm7);
                CM.add(7, cm8);
                CM.add(8, cm9);
                CM.add(9, cm10);

                return CM;
        }
}
