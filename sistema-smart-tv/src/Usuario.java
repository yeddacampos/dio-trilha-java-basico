public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Ligar -> TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Desligar -> TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Aumentar Volume -> Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Diminuir Volume -> Volume: " + smartTv.volume);

        smartTv.mudarCanal(15);
        System.out.println("Canal: " + smartTv.canal);
    }
}
