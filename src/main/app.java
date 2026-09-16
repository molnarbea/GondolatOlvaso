package main;

public class app {
    
    static String[] pakli = new String[22];

    public static void main(String[] args) {
        feltolt();
        for (int i = 0; i < 3; i++) {
            kiark();//1tömb
            melyik();//scanner
            kever();//középre
        }
        ezVolt();//11. elem
    }

    private static void kiark() {
        
    }

    private static void melyik() {
        
    }

    private static void kever() {
        
    }

    private static void ezVolt() {
        
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
                        System.out.println(pakli[i]);
                    }
                    
                }
            }
        }
    }

}
