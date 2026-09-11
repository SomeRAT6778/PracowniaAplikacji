//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //zadanie1
    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");

    //zadanie2
    String imie ="Mikołaj";
    int rok_urodzenia=2007;
    double liczba =0.66;

    //zadanie3
    int rok=2026;
    System.out.println("Mam na imie "+imie+" mam "+(rok - rok_urodzenia)+
            " lat i bede pisac mature za "+liczba+" roku.");
    //zadanie4
    System.out.println("podaj ile jest stopni na dworze w stopniach ceciusza");
    Scanner sc =new Scanner(System.in);
    double stopnie = sc.nextDouble();
    double fahraheit = 1.8*stopnie+32.0;
    System.out.println("na dworze jest "+fahraheit+"stopni Fahrenheita");


}
