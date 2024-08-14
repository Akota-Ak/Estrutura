import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {
        
        double mesada = 50.0;

        while(mesada >0){

            Double valorDoce = valoraleatorio();

            if(valorDoce > mesada)

                  valorDoce = mesada;

                  System.out.println("doce Valor" + valorDoce +" Adicionado no Carrinho");
                  mesada = mesada - valorDoce;
        }

        System.out.println("Mesada:"+ mesada);
        System.out.println("Joazinho Gastou toda sua mesada em doces");

    }

    private static double valoraleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
    
}

