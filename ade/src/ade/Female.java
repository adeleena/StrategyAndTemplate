package ade;

public abstract class Female implements Strategy{
	public int mana;
	public int power;
	
	public void attack(int mana, int power)
	{
		System.out.println("The enemy has lost " + power + " hp and you have consumed" + (power-3) + " mana");	
		this.mana=this.mana-power-3;
	}
	public Female()
	{
		this.mana=50;
		this.power= 5;		
	}
	public Female(int mn, int pwr)
	{
		this.mana=mn;
		if(pwr <=3 )
		{
		 this.power= 4;
		}
		else
		this.power= pwr;
	}

}
