import java.util.Scanner;

import restaurant.Restaurant;
//scanner
public class Restauranttester 
{
	
	public static void main(String[] args) {
		Restaurant carUser1 = new Restaurant();
		
		
	String carUser=new String("car");
	System.out.println("This is the transportation of this user:");

boolean car = false;
//carUser
if (car)
{
	System.out.println("Great, it is way better to walk.");
}
else
{
	System.out.println("the distences are for people without cars.");
}

Restaurant botA=new Restaurant();
System.out.println("type of bot:"+botA.area);
botA.area="West Virgina University";
System.out.println("Type of bot:"+botA.area);

if (botA.area.equalsIgnoreCase("Suncrest Towne Centre"))
{
	System.out.println("there are plenty of places to eat on campus");
	System.out.println("You can eat in the Lair");
	System.out.println("You can eat at subway on High Street");
	System.out.println("You can eat at Panera Bread on High Street");
	
}

else
{
	System.out.println(" there are great places for you to eat at Suncrest Towne Centre");
	System.out.println("You can eat Buffalo wild wings");
	System.out.println("You can eat at Roosters");
	System.out.println("You can eat at Martins BBQ");
	System.out.println("As well as many more places");
}
}


}		
