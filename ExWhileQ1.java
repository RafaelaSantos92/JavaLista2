package Familia51;

import java.util.Scanner;

public class ExWhileQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade,menosVinteUm=0,MaisCinquenta=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com uma idade: ");
		idade = leia.nextInt();
				
				while(idade!=-99)
				{
					if(idade<=21)
					{
						menosVinteUm++;
					}
					
					else if(idade>50)
					{
						MaisCinquenta++;
					}
					
					System.out.println("\nEntre com uma idade: ");
					idade = leia.nextInt();
				}
				System.out.println("\n"+menosVinteUm+ " Pessoas tem menos de 21 anos e "+MaisCinquenta+ " tem mais de cinquenta anos.");
	}

}
