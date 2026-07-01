public class Termometro {
    private double temperatura;

    public Termometro() {
        this.temperatura = 20.0;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        if (temperatura < -10.0 || temperatura > 50.0) {
            System.out.println("Aviso: temperatura fora do limite permitido (-10.0°C a 50.0°C). Alteração ignorada.");
            return;
        }

        this.temperatura = temperatura;
    }
}