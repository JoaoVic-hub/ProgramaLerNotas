import java.util.Scanner;
public class Ler_Notas {
    public static void main(String args[]){
        double n1, n2, n3, n4;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite as quatro notas do aluno: ");
        n1 = s.nextDouble();
        n2 = s.nextDouble();
        n3 = s.nextDouble();
        n4 = s.nextDouble();

        double media = (n1+n2+n3+n4)/4;
        System.out.println("Sua média é : " + media);

        if(media < 5){
            System.out.println("Aluno Reprovado!!!");
        }else if(media > 7){
            System.out.println("Aluno Aprovado!!!");
        }else if (media >= 5 && media <= 7){
            System.out.println("Aluno em Recuperação!!!");
        }
    }
}
