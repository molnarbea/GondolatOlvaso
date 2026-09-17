package main;

import java.util.Scanner;

public class app {
    
    static String[] pakli = new String[22];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        program();
    }

    public static void program() {
        feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();//1tömb
            int oszlop = melyik();//scannerkever(oszlop);//középre
            kever(oszlop);
        }
        ezVolt();//11. elem
    }

    private static void kirak() {
        System.out.printf("%-12s %-12s %-12s%n%n","1. oszlop","2. oszlop","3. oszlop");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%-12s %-12s %-12s%n", pakli[i*3+1],pakli[i*3+2],pakli[i*3+3]);
        }
    }

    private static void melyik() {
        System.out.print("\nMelyik oszlop (1-3): ");
        int oszlop = sc.nextInt();
        while(oszlop < 1 || oszlop > 3){
            System.out.println("Hibás oszlop!");
            System.out.print("Melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
        }
        return oszlop;
    }

    private static String[] kever(int oszlop) {
        static String[] regiPakli = pakli.clone();
        switch (oszlop) {
            case 1:
                for (int i = 1; i < 8; i++) {
                    pakli[i] = regiPakli[20-(i-1)*3];
                    pakli[i+7] = regiPakli[19-(i-1)*3];
                    pakli[i+14] = regiPakli[21-(i-1)*3];
                    
                }   break;
            case 2:
                for (int i = 1; i < 8; i++) {
                    pakli[i] = regiPakli[19-(i-1)*3];
                    pakli[i+7] = regiPakli[20-(i-1)*3];
                    pakli[i+14] = regiPakli[21-(i-1)*3];
                    
                }   break;
            default:
                for (int i = 1; i < 8; i++) {
                    pakli[i] = regiPakli[19-(i-1)*3];
                    pakli[i+7] = regiPakli[21-(i-1)*3];
                    pakli[i+14] = regiPakli[20-(i-1)*3];
                    
                }   break;
        }
    }

    private static void ezVolt() {
        System.out.println("A választott kártya: "+kevert[11]);
    }

    private static void feltolt() {
        String[] szinek = {"P","T","Z","M"};
        String[] ertekek = {"Ász","Kir","Fel","X","IX","VIII"};
        for (int i = 0; i < 21;) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 6; k++) {
                    if (i<21) {
                        i++;
                        pakli[i]=szinek[j]+"_"+ertekek[k];
                    }
                }
            }
        }
    }

}
