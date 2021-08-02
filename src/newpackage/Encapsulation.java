package newpackage;

 class Encapsulation {
	
	 public static void main(String [] args)
		{
			Human h = new Human();
			h.getNamefun("Priya");
			h.getAgefun(10);
			h.Data ="Test";
			System.out.println("Name :"+h.setNamefun()+"\n Age :"+h.setAgefun()+ h.Data);
			
			
		}
		
			
}

 class Human
 {
	 
	 private String Name;
		private int Age;
		String Data ;
		
		public String setNamefun ()
		{
			
			return Name;
		}
     public int setAgefun()
     {
     	
     	return Age;
     }
     public void getNamefun (String mName)
		{
			
			Name=mName;
		}
     public void getAgefun(int mAge)
     {
     	
     	Age=mAge;
     }
 }