package comm.example;

public class RandomFortune{
	private String fortune[]= {
		"Be strong","Be happy","Trust No one","Stay single"	
	};
	
	public String getDailyFortune()
	{
              return fortune[(int)Math.random()];		
	}




	

}
