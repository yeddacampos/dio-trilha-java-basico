public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 0; numero <=100; numero ++){
            if(numero % 2 == 0)
                continue;
            
            System.out.println("Números impares de 1 a 100: " + numero);
            
        }
        //Qual a saída no console ?
    
    }
}
