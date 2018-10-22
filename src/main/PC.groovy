package main
import superclasses.Armour
import superclasses.Background
import superclasses.CharClass
import superclasses.Focus
import superclasses.Item
import superclasses.Weapon

class PC
{
	private final MAX_ATTRIBUTE_INCREASES = 5
	private final MAX_LEVEL = 10
	
	public GString name
	public GString homeworld
	public GString faction
	public GString race
	public GString employer
	
	private CharClass charClass
	private Map attributes
	private int attributesIncreased
	private ArrayList<Focus> foci
	private Map skills
	private Background background
	
	private int level
	private int xp
	private int[] levelBounds = [0, 3, 6, 12, 18, 27, 39, 54, 72, 93] as int[]
	private int recurringLevelBounds = 24
	
	private int maxHp
	private int currHp
	private int ac
	private Map saves
	
	private int encumbrance
	private int maxEncumbrance
	private int systemStrain
	private int maxSystemStrain
	private int permSystemStrain
	
	private int credits
	
	private Armour[] armour
	private Weapon[] weapons
	private ArrayList<Item> inventory
	
	private int anySkill
	private int focus
	private int psychicSkill
	
	PC()
	{
		level = 1
		xp = 0
		inventory = new ArrayList<>()
		armour = new Armour[5]
		weapons = new Weapon[5]
		foci = new ArrayList<>()
		
		(0..4).each
		{
			armour[it] = null
			weapons[it] = null
		}
		
		Logger.log "this is a level $level character with $xp xp"
	}
	
	//increase xp by given amount then calculate whether the player levelled up and if so, apply effects
	public void gainXP(int amount)
	{
		xp += amount
		int newLevel = 0;
		
		if(level >= levelBounds.length)
		{
			int remainder = xp - levelBounds[levelBounds.length - 1]
			int extraLevels = Math.floor(remainder / recurringLevelBound)
			newLevel = levelBounds.length + extraLevels
			
			if(newLevel > level)
			{
				((level + 1)..(newLevel))
				{
					charClass.levelUp(this, it)
				}
			}
			
		}
		else if(xp > levelBounds[level])
		{
			charClass.levelUp(this, level + 1)
		}
	}
	
	//adds one to level
	public void incrementLevel()
	{
		level++
	}
	
	//adds amount to level
	public void incrementLevel(int amount)
	{
		level += amount
	}
	
	//remove given item from inventory, returns whether it was there to start with
	public boolean dropItem(Item item)
	{
		if(inventory.contains(item))
		{
			inventory.remove(item)
			return true
		}
		return false
	}
	
	//add given item to players inventory
	public void addItem(Item item)
	{
		inventory.add(item)
		item.addToInv(this)
	}
	
	//put given weapon into an equipped slot. Returns whether there was an empty slot to put it in
	public boolean equipWeapon(Weapon weapon)
	{
		for(int i = 0; i < 5; i++)
		{
			if(weapons[i] == null)
			{
				 weapons[i] = weapon
				 weapon.equip(this)
				 return true;
			}
		}
		
		Logger.log "unable to equip weapon: $weapon, no empty slots"
		return false
	}
	
	//SETTERS
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void setAttribute(String attribute, int number)
	{
		attributes.attribute = number
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//END SETTERS
	
	//GETTERS
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public int getCharClass()
	{
		return charClass.getName()
	}
	
	public int getAttributeIncreases()
	{
		return attributesIncreased
	}
	
	public int getAc()
	{
		return ac
	}
	
	public int getHp()
	{
		return currHp
	}
	
	public int getMaxHp()
	{
		return maxHp
	}
	
	public int getEncumbrance()
	{
		return encumbrance
	}
	
	public int getMaxEncumbrance()
	{
		return maxEncumbrance
	}
	
	public int getSystemStrain()
	{
		return systemStrain
	}
	
	public int getMaxSystemStrain()
	{
		return maxSystemStrain
	}
	
	public int getPermenantSystemStrain()
	{
		return permenantSystemStrain
	}
	
	public int getSave(String save)
	{
		return saves.save
	}
	
	public int getAttribute(String attribute)
	{
		return attributes.attribute
	}
	
	public int getLevel()
	{
		return level
	}
	
	public int getXp()
	{
		return xp
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//END GETTERS
}
