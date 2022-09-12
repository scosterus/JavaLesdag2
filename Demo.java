
public class Demo{ 
    public static void main(String[] args){
       Slang s = new Slang();
       s.bloedsomloop = 10;
       System.out.println(s.bloedsomloop);
       
       Dierenarts cedric = new Dierenarts();
       cedric.opereren(s);
    }
}

abstract class Dier{
	int bloedsomloop;
	String soort;
	abstract void voortbewegen();
}

class Slang extends Dier{
	Slang(){
		soort = "slang";
	}
	void voortbewegen() {
		
	}
}

class Dierenarts{
	void opereren(Dier dier) {
		System.out.println("Het dier dat vandaag wordt geopereerd is: " + dier.soort);
	}
}