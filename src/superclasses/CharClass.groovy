package superclasses
import main.PC

class CharClass
{
	private String name
	
	//method to level up the given PC following the rules of this class
	protected void levelUp(PC pc, int newLevel)
	{
		pc.incrementLevel()
	}
	
	//GETTERS
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public String getName()
	{
		return name
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//END GETTERS
}
