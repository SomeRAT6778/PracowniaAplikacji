//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
//zadanie 1
    System.out.println("podaj iczbe a sprawdze czy jest podzielna przez 3 ");
    Scanner sc = new Scanner(System.in);
    int liczba =sc.nextInt();
    int trzy =3;
    int reszta = liczba %3;
    if (reszta == 0) {
        System.out.println(liczba +"dzieli sie przez 3");
    }
    else {
        System.out.println(liczba + "nie dzieli sie przez 3");
    }
    //zadanie 2

    System.out.println("podaj 3 boki trójkąta a sprawdze czy jest poprawny");
    Scanner sc1 =new Scanner(System.in);
    Scanner sc2 =new Scanner(System.in);
    Scanner sc3 =new Scanner(System.in);
    int bok1 =sc1.nextInt();
    int bok2 =sc2.nextInt();
    int bok3 =sc3.nextInt();
    if(bok1+bok2>=bok3){
        System.out.println("z tych boków da sie zrobic trójkąt");

    } else if (bok1+bok3>=bok2) {System.out.println("z tych boków da sie zrobic trójkąt");

    } else if (bok3+bok2>=bok1) {System.out.println("z tych boków da sie zrobic trójkąt");

    }
    else {
        System.out.println("z tcyh boków nie da sie zrobic trojkąta");
    }
    //zadanie3


}
