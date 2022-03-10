import java.util.Scanner;
public class Ex1 {
    public static void main(String[ ] args) {
        int a, b, c, n1, n2, va, op;
        float v1, v2, div, s1, s2;

        //Exercicio 1
        System.out.println("~~~~ CALCULADORA ~~~~");
        System.out.print("Digite o Dividendo: ");
        Scanner sc1 = new Scanner(System.in);
        v1 = sc1.nextFloat();
        System.out.print("Digite o Divisor:   ");
        v2 = sc1.nextFloat();
        div = v1/v2;
        if(v2 == 0){
            System.out.println("Nao existe divisao por Zero!!!");
        }
        else{
            System.out.println("Resultado da Divisao: "+div);
        }
        System.out.print("\n\n");

        //Exercicio 2
        System.out.println("~~~~ NUMEROS EM ORDEM CRESCENTE ~~~~");
        System.out.println("Vamos comecar digitanto tres numeros INTEIROS: ");
        System.out.print("Digite o Primeiro:   ");
        a = sc1.nextInt();
        System.out.print("Digite o Segundo:   ");
        b = sc1.nextInt();
        System.out.print("Digite o Terceiro:   ");
        c = sc1.nextInt();
        System.out.println("Ordem dos numeros digitados:");
        if(a<b){
            if(b<c){
                System.out.print(a+" - "+b+" - "+c);
            }
            else if(a<c){
                System.out.print(a+" - "+c+" - "+b);
            }
            else{
                System.out.print(c+" - "+a+" - "+b);
            }
        }
        else if(b<c){
            if(a<c){
                System.out.print(b+" - "+a+" - "+c);
            }
            else{
                System.out.print(b+" - "+c+" - "+a);
            }
        }
        else{
            System.out.print(c+" - "+b+" - "+a);
        }
        System.out.print("\n\n");

        //Exercicio 3
        System.out.println("~~~~ COMPARANDO DOIS NUMEROS ~~~~");
        System.out.println("Vamos comparar dois numeros INTEIROS: ");
        System.out.print("Digite o Primeiro:   ");
        n1 = sc1.nextInt();
        System.out.print("Digite o Segundo:    ");
        n2 = sc1.nextInt();
        System.out.println("Ordem crescente dos numeros digitados:");
        if(n1<n2){
            System.out.print(n1+" - "+n2);
        }
        else{
            System.out.print(n2+" - "+n1);
        }
        System.out.print("\n\n");

        //Exercicio 4
        System.out.println("~~~~ DETERMINANDO O VALOR ABSOLUTO ~~~~");
        System.out.print("Digite um numero inteiro:   ");
        va = sc1.nextInt();
        if(va<0){
            System.out.println("Seu valor absoluto eh: "+(va*-1));
        }
        else{
            System.out.println("Seu valor absoluto eh: "+va);
        }
        System.out.print("\n\n");

        //Exercicio 5
        System.out.println("~~~~ CALCULADORA 2.0 ~~~~");
        System.out.print("Digite o Primeiro Numero:            ");
        s1 = sc1.nextFloat();
        System.out.println("Digite a operacao a ser realizada:   ");
        System.out.print("    + = 0 | - = 1 | * = 2 | / = 3    ");
        op = sc1.nextInt();
        System.out.print("Digite o Segundo Numero:             ");
        s2 = sc1.nextInt();
        switch (op){
            case 0:
                System.out.println("Resultado da Soma: "+(s1+s2));
                break;
            case 1:
                System.out.println("Resultado da Subtracao: "+(s1-s2));
                break;
            case 2:
                System.out.println("Resultado da Multiplicacao: "+(s1*s2));
                break;
            case 3:
                System.out.println("Resultado da Divisao: "+(s1/s2));
                break;
            default:
                System.out.println("Nao foi digitada uma opcao valida!!!");
        }

    }
}
