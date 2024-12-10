package projekt;

public class Main {
    public static void main(String[] args) {
        Uczelnia uczelnia = Uczelnia.getInstance();
        Student s1 = new Student("Iga", "Posturzynska", "05262006124","123281", 3, true, 1, true);
        Student s2 = new Student("Iga", "Kot", "05262006124","123281", 3, true, 1, true);
        Student s7 = new Student("Bartłomiej", "Wierzbicki", "80111069309", "324234", 4, true, 2, false );
        Student s3 = new Student("Roman", "Marciniak", "30061198387", "123343", 2, false, 1, true );
        uczelnia.add(s1);
        uczelnia.add(s1);
        uczelnia.add(s2);
        uczelnia.add(s3);
        uczelnia.add(s7);
        System.out.println("Plec studenta: " + s1.getPlec());
        PracownikBadawczoDydaktyczny p1 = new PracownikBadawczoDydaktyczny("Barbara", "Borkowska", "40112760227", "wykladowca", 20, 7000, 2);
        PracownikBadawczoDydaktyczny p2 = new PracownikBadawczoDydaktyczny("Teresa", "Polak", "81021304944", "wykladowca", 25, 7400, 20);
        PracownikBadawczoDydaktyczny p3 = new PracownikBadawczoDydaktyczny("Olga", "Krupa", "96102217527", "wykladowca", 10, 5500, 1);
        uczelnia.wyszukajStudenta("imie", "Iga");
        uczelnia.add(p1);
        uczelnia.add(p2);
        uczelnia.add(p3);
        System.out.println();
        System.out.println(uczelnia);
        System.out.println("Studenci: ");
        uczelnia.wypiszStudentow();
        System.out.println("Pracownicy: ");
        uczelnia.wypiszPracownikow();
        Kurs k1 = new Kurs("Analiza matematyczna", p1, 10);
        Kursy kursy = Kursy.getInstance();
//       Kurs k2 = new projekt.Kurs("Analiza matematyczna", p1, 10);
        Kurs k3 = new Kurs("Algebra liniowa z geometria analityczna", p1, 2);
        Kurs k4 = new Kurs("Fizyka", p2, 5);
        Kurs k5 = new Kurs("Programowanie strukturalne i obiektowe", p3, 8);
        s1.dodanieKursu(k1);
        s1.dodanieKursu(k3);
        s1.dodanieKursu(k5);
        System.out.println("Kursy wybrane przez studenta: ");
        System.out.println(s1.getWybraneKursy());
        //s1.usunKursZWybranych(k1);
        System.out.println("Kursy wybrane po usunieciu: ");
        System.out.println(s1.getWybraneKursy());
        System.out.println("Lista wszystkich kursow");
        System.out.println(kursy);
        //uczelnia.usuwanieWykladowcy(p3);
        System.out.println(kursy);
        System.out.println(uczelnia);
        System.out.println("Wyszukiwanie pracownikow: ");
        System.out.println(uczelnia.wyszukajPracownika("stanowisko", "wykladowca"));
        System.out.println(uczelnia.wyszukajPracownika("staz", "10"));
        System.out.println(uczelnia.wyszukajPracownika("pensja", "5500"));
        //uczelnia.usunStudenta(s1);
        System.out.println(uczelnia);
        System.out.println(kursy.wyszukajKursy("ects", "8"));
        System.out.println(uczelnia.wyszukajStudenta("nazwa kursu", "Analiza matematyczna"));
        uczelnia.wypiszStudentow();
   }

}