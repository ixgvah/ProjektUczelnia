package Menu;

import UsuwanieHashSetami.usuwanieDuplikatowPracownicy;
import UsuwanieHashSetami.usuwanieDuplikatowStudenci;

import java.util.Scanner;

public class MenuUsuwaniaDuplikatow implements Menu {
    @Override
    public void wyswietlMenu() {
        System.out.println("1. Usuwanie duplikatów z listy studentów. ");
        System.out.println("2. Usuwanie duplikatów z listy pracowników. ");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextLine()) {
            case "1":
                usuwanieDuplikatowStudenci uds = new usuwanieDuplikatowStudenci();
                uds.usunieteDuplikaty();
                break;
            case "2":
                usuwanieDuplikatowPracownicy udp = new usuwanieDuplikatowPracownicy();
                udp.usunieteDuplikaty();
                break;
            default:
                System.out.println("Niepoprawne pole. ");
        }
    }
}
