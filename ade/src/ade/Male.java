package ade;

public abstract class Male implements Strategy{
	public int mana;
	public int power;
	public void attack(int mana, int power)
	{
		System.out.println("The enemy has lost " + power + " hp and you have consumed" + (power-3) + " mana");	
		this.mana=this.mana-power-3;
	}
	public Male()
	{
	  this.mana=70;
	  this.power=8;
	}
	public Male(int mn, int pwr )
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
