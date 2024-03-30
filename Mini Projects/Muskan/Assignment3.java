package learningandpraticingjava;

class Doctor
{
	public void patient()
	{
		System.out.println("Doctor is only responsible for patient's treatment");
	}
}
class Nurse extends Doctor
{
	@Override
	public void patient()
	{
		super.patient();
		System.out.println("Nurse is responsibility is to take care of patient with doctor's instruction");
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Nurse n=new Nurse();
        n.patient();
	}
}
	 
	/*OUTPUT
	 Doctor is only responsible for patient's treatment
     Nurse is responsibility is to take care of patient with doctor's instruction
     */


