package suretrust;
interface Investiment{
	void money();
}
class Pesticides implements Investiment{
	@Override
	public void money() {
		System.out.print("Farmers uses pesticides like fungicides etc..,as half of the investiment");
	}
}
class Fertilizers implements Investiment{
  @Override
  public void money() {
	  System.out.print("\nFarmers uses Fertilizer like N:P:K etc.., and Tractor rents as half of the investiment");
  }
}
public class Assignment5 {
	
	public static void main(String[] args) {
		Pesticides p=new Pesticides();
		p.money();
		Fertilizers f=new Fertilizers();
		f.money();
		// TODO Auto-generated method stub

	}

}
OUTPUT:
Farmers uses pesticides like fungicides etc..,as half of the investiment
Farmers uses Fertilizer like N:P:K etc.., and Tractor rents as half of the investiment
