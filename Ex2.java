import java.util.Scanner;
public class Ex2 {
    public static void main(String[ ] args) {
        float v;
        String letra, resp="c";
        
        Scanner sc1 = new Scanner(System.in);
        //Exercicio 6
        System.out.println("~~~ Exercicio 6 ~~~");
        for(int cont=1; cont<=100; cont++){
            if((cont%2)==0){
                System.out.println(cont);
            }
        }
        System.out.print("\n\n");
        
        //Exercicio 7
        System.out.println("~~~ Exercicio 7 ~~~");
        for(int cont=100; cont>=1; cont --){
            System.out.println(cont);
        }
        System.out.print("\n\n");
        
        //Exercicio 8
        System.out.println("~~~ Exercicio 8 ~~~");
        System.out.println("~~~ Para Sair digite um numero > ou = a 10 ~~~");
        do{
            System.out.print("Digite um numero: ");
            v = sc1.nextFloat();
        }while(v<10);
        System.out.print("\n\n");
        
        //Exercicio 9
        System.out.println("~~~ Exercicio 9 ~~~");
        System.out.println("~~~ Tente Adivinhar a Letra ~~~");
        do{
            System.out.print("Digite uma letra: ");
            letra = sc1.next();
            if(letra.equals(resp)){
                System.out.println("VOCE ADIVINHOU A LETRA!!!");
                break;
            }
        }while(!letra.equals(resp));
        
    }
}
