package conceptsAfterBreak;


public class autoverkoopverhaaltje{ 
    public static void main(String[] args){
        AutoVerkoper sjaak = new AutoVerkoper();
        Auto a = sjaak.verkopen(10, "Tesla");
        a.rijden(50);
        sjaak.verkopenUitVoorraad(0);
        Auto rr = new Auto();
        rr.merk = "Audi";
        sjaak.inkopen(rr);
        sjaak.verkopenUitVoorraad(0);
        
        sjaak.verkopen(30, "Audi").rijden(80);
        
        Auto gekochteAuto = sjaak.verkopen(60, "Fiat");
        gekochteAuto.rijden(30);
    }
}

class AutoVerkoper{
    Auto teVerkopenAuto;
    Auto verkopen(int geld, String brand){
        System.out.println("Welkom ik ga je iets verkopen");
        Auto auto = new Auto();
        auto.merk = brand;
        return auto;
    }
    Auto verkopenUitVoorraad(int geld){
        System.out.println("Welkom ik ga je iets proberen te verkopen");
        if(teVerkopenAuto == null) {
            System.out.println("sorry ik heb geen auto");
            return null;
        }else {
            System.out.println("Yes ik heb deze nog staan");
            return teVerkopenAuto;
        }
    }
    void inkopen(Auto eenAuto) {
        teVerkopenAuto = eenAuto;
    }
}



class Auto{
    String merk;
    void rijden(int snelheid) {
        System.out.println("In een "+merk+" gaan we een stukje rijden, met de snelheid: "+ snelheid);
    }
}
