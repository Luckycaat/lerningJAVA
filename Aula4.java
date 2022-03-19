import java.util.Random;
public class Aula4 {
    public static void main(String[ ] args) {
        int maior = 0;
        int vetor[] = new int[5]; 
        int m1[][] = new int[2][2];
        int m2[][] = new int[2][2];
        int m3[][] = new int[2][2];
        Random gerador = new Random();
        
        //Exercicio 1
        for (int cont=0; cont<vetor.length; cont++){
            vetor[cont] = gerador.nextInt(10);
            if(vetor[cont]>maior){
                maior = vetor[cont];
            }
        }
        
        for (int cont=0; cont<vetor.length; cont++){
            System.out.print(vetor[cont]+" | ");
        }
        System.out.println("\nO maior numero do vetor foi: "+maior);
        System.out.print("\n\n");
        
        //Exercicio 2
        System.out.println("Matriz 1: ");
        for(int col=0; col<m1.length; col ++){
            for(int lin=0; lin<m1.length; lin ++){
                m1[col][lin] = gerador.nextInt(10);
                System.out.print(m1[col][lin]+" | ");
            }
            System.out.print("\n");
        }
        System.out.println("Matriz 2: ");
        for(int col=0; col<m2.length; col ++){
            for(int lin=0; lin<m2.length; lin ++){
                m2[col][lin] = gerador.nextInt(10);
                System.out.print(m2[col][lin]+" | ");
            }
            System.out.print("\n");
        }
        System.out.println("Soma das matrizes: ");
        for(int col=0; col<m3.length; col ++){
            for(int lin=0; lin<m3.length; lin ++){
                m3[col][lin] = (m1[col][lin])+(m2[col][lin]);
                System.out.print(m3[col][lin]+" | ");
            }
            System.out.print("\n");
        }
        
    }
}
