import java.util.Scanner;

public class Contador {
public static void main(String[] args) {
    Scanner terminal = new Scanner (System.in);
        System.out.println("Digite o primeiro parâmetro");
        int primeroParametro = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = terminal.nextInt();
    
    try{ 
        contar (primeroParametro, segundoParametro);  
    }catch (ParametrosInvalidosException e){
        System.out.println("O segundo parametro tem que ser maior que o primeiro!");
      }
}
static void contar (int primeroParametro , int segundoParametro) throws ParametrosInvalidosException {
    if (primeroParametro > segundoParametro) {
        throw new ParametrosInvalidosException();
    }

int contagem = segundoParametro - primeroParametro;
for (int p = 1; p <= contagem ;  p++) {
    System.out.println("imprimindo numero" +" "+ p);
}
}}