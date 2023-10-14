public class Usuario {
    public static void main(String args[]) {
        SmartTV smartTv = new SmartTV();

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo estado -> TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo estado -> Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo estado -> Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(4);
        System.err.println("Novo estado -> Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.err.println("Novo estado -> Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.err.println("Novo estado -> Canal atual: " + smartTv.canal);
    }
}
