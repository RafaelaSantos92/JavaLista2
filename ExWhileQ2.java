package Familia51;

import java.util.Scanner;

public class ExWhileQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade,genero,Fp,contePc=0,conteMn=0,conteHa=0,conteNbC=0,contePn40=0,contePc18=0,pessoas=1;
		Scanner leia = new Scanner (System.in);
		
		while(pessoas<=150)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			while (idade<1 || idade >130)
			{
				System.out.println("\nPor favor, entre novamente com a sua idade: ");
				idade = leia.nextInt();
			}
			System.out.println("\nEntre com o seu genero: 1-Masculino, 2-Feminino, 3-Não binário");
			genero = leia.nextInt();
			while (genero<1 || genero>3)
			{
				System.out.println("\nPor favor, Entre novamente com o seu genero: 1-Masculino, 2-Feminino, 3-Não binário ");
				genero = leia.nextInt();
			}
			System.out.println("\nEntre com o seu fator psicologico: 1- Calme, 2-Nervose, 3-Agressive ");
			Fp = leia.nextInt();
			while (Fp<1 || Fp>3)
			{
				System.out.println("\nPor favor, Entre novamente com o seu fator psicologico: 1- Calme, 2-Nervose, 3-Agressive ");
				Fp = leia.nextInt();
			}
			if(Fp == 1)
			{
				contePc++;
			}
			if(genero == 2 && Fp == 2)
			{
				conteMn++;;
			}
			if(genero ==1 && Fp == 3)
			{
				conteHa++;
			}
			if(genero == 3 && Fp == 1)
			{
				conteNbC++;
			}
			if(Fp == 2 && idade > 40)
			{
				contePn40++;
			}
			if(Fp == 1 && idade < 18)
			{
				contePc18++;
			}
			pessoas++;
		}
		System.out.println("\nPessoas calmas: "+contePc);
		System.out.println("\nMulheres nervosas: "+conteMn);
		System.out.println("\nHomens agressivos: "+conteHa);
		System.out.println("\nNão binários calmes: "+conteNbC);
		System.out.println("\nPessoas nervosas com mais de 40 anos: "+contePn40);
		System.out.println("\nPessoas calmas com menos de 18 anos: "+contePc18);		
		
	}

}
