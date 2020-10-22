import java.util.Scanner;
class Aso
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Slaw, nawakat la chand pit pekhatwa?");
		int x = input.nextInt();
		String[] name = new String[x];

		System.out.println("pity nawakant daxl bka");
		for (int i=0; i<name.length; i++)
		{
			name[i] = input.next();
		}

		System.out.print("nawy to: ");
		for (int i=0; i<name.length; i++)
		{
			System.out.print(name[i]);
		}
		System.out.println();
	}
}
