package UsuwanieHashSetami;

import projekt.*;

import java.util.HashSet;

public class usuwanieDuplikatowPracownicy implements UsunHashSetami {
    @Override
    public void usunieteDuplikaty() {
        HashSet<PracownikUczelni> osoby = new HashSet<>();
        for(Osoba o: Uczelnia.getInstance().getUczelnia()){
            if(o instanceof PracownikBadawczoDydaktyczny || o instanceof PracownikAdministracyjny){
                osoby.add((PracownikUczelni) o);
            }
        }

        for(PracownikUczelni p: osoby){
            System.out.println(p);
        }
    }
}
