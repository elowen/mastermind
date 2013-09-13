import java.util.ArrayList;


public class Board {
	
	//variable declarations
	private int length;
	private int current;
	private ArrayList<String> guesses = new ArrayList<String>();
	private int[] exactNumber;
	private int[] correctNumber;
   private char[] blank;
	
	//default constructor
	public Board()
	{
		length=0;
		current=0;
		exactNumber=new int[0];
		correctNumber=new int[0];
	}
	
	//constructor, takes in number of guesses available
	public Board(int l,int g)
	{
		length=l;
		current=0;
		exactNumber=new int[l];
		correctNumber=new int[l];
      blank=new char[g];
      for(int x=0;x<g;x++)
      {
         blank[x]='-';
      }
	}
	

	public void display()
	{
		for (int x=0;x<length;x++)
		{
			if(x<current)
				System.out.println("|"+guesses.get(x)+"| Number of letters exactly right: " + exactNumber[x] +" Number of letters partially correct: "+ correctNumber[x]);
			else
			{
				System.out.print("|");
				System.out.print(blank);
				System.out.println("|");
			}
			
		}
		
		
	}
	
	public void passInfo(String guess,int exact,int correct)
	{
		guesses.add(guess);
		exactNumber[current]=exact;
		correctNumber[current]=correct;
		current++;
	}

}
