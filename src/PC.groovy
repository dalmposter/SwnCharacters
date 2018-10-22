
class PC
{
	private GString name
	private GString homeworld
	private GString faction
	private GString race
	private GString employer
	
	private Map attributes
	private ArrayList<Focus> foci
	private Map skills
	private Background background
	
	private int level
	private int xp
	
	private int maxHp
	private int currHp
	private int ac
	private Map saves
	
	private int encumberance
	private int maxEncumberance
	private int systemStrain
	private int maxSystemStrain
	private int permSystemStrain
	
	private int credits
	
	private Armour[] armour
	private Weapon[] weapons
	private ArrayList<Item> inventory
	
	PC()
	{
		level = 1
		xp = 0
		inventory = new ArrayList<>()
		armour = new Armour[5]
		weapons = new Weapon[5]
		foci = new ArrayList<>()
		
		(0..4).each{
			armour[it] = null
			weapons[it] = null
		}
		
		println "this is a level $level character with $xp xp"
		println "armour array size is ${armour.length}"
		
		Weapon testWeapon = new Weapon()
		equipWeapon(testWeapon)
	}
	
	public boolean dropItem(Item item)
	{
		
	}
	
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
		
		println "unable to equip weapon, no empty slots"
		return false
	}
}
