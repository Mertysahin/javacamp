package methods;

public class Main {
	
	public static void sayiBulma()
	{
		int[] sayilar = {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi = false;
		for(int gecici : sayilar)
		{
			if(aranacak == gecici)
			{
				varMi=true;
				break;
			}			
			
		}
		String mesaj;
		if(varMi) 
		{
			mesaj ="Say� mevcuttur: " + aranacak;
			mesajVer(mesaj);
		}
		else
		{
			System.out.println("Say� mevcut de�ildir:");
		}
		
	}
	public static void mesajVer(String mesaj)
	{
		System.out.println(mesaj);
	}
	public static void main(String[] args) 
	{
		
		sayiBulma();

	}
	

}
