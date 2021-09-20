
public class car1 {

	public int noofdoor=4;
	public int noofseats=5;
	public int stepnee=1;
	public void car3()
	{
		System.out.println(" number of doors" +noofdoor);
		System.out.println("number of seats" +noofseats);
		System.out.println("stepnee is" +stepnee);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarInterior c =  new CarInterior();
		c. cInterior();

	}

}

public class Carutilities  extends car1{

	
	String musicsystem=" kenwood";
	 double radio = 93.1;
	 String bumpper = "back";
	 
	 String  numberplate = "abs123";
	 public void cutilities() {
		 super.car3();
		 System.out.println(" musicsystem is " +musicsystem+ " radio are" +radio+ " numberplates is" +numberplate);
	 }
	
	

}

public class CarInterior extends Carutilities {
 
	String covertype = "outercover"; 
	String covercolor =" silver";
	public void cInterior() {
		super.cutilities();
		
		System.out.println("covertype is " +covertype);
		System.out.println("covercolor" +covercolor);
	}
}




