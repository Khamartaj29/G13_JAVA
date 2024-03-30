package sure.trust;
	class GrandFather{
	public void Grandfather() {
		System.out.println("he is grandfather");
	}
	}
	class mother extends GrandFather{
		public void father()
		{
			System.out.println("He is father");
		}
	}
	class Son extends mother{
		public void sons() {
			System.out.println("he is son");
		}
	}
     class Hybried{
	  public static void main(String[] args) {
         Son obj=new Son();
         obj.Grandfather();
         obj.father();
         

		
	   }
	  
	}

