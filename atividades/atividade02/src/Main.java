public class Main {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();

        System.out.println("Temperatura inicial: " + termometro.getTemperatura() + "°C");

        termometro.setTemperatura(25.0);
        System.out.println("Temperatura após valor válido: " + termometro.getTemperatura() + "°C");

        termometro.setTemperatura(60.0);
        System.out.println("Temperatura após tentativa inválida: " + termometro.getTemperatura() + "°C");
    }
}    

