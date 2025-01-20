package UsuwanieHashSetami;

import projekt.*;

import java.util.ArrayList;
import java.util.HashSet;

public class usuwanieDuplikatowPracownicy implements UsunHashSetami {
    @Override
    public ArrayList<Osoba> usunieteDuplikaty() {
        HashSet<PracownikUczelni> osoby = new HashSet<>();
        for(Osoba o: Uczelnia.getInstance().getUczelnia()){
            if(o instanceof PracownikBadawczoDydaktyczny || o instanceof PracownikAdministracyjny){
                osoby.add((PracownikUczelni) o);
            }
        }
        ArrayList<Osoba> wynik = new ArrayList<>(osoby);
        return wynik;
    }
}
