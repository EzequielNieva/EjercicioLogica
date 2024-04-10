public class Mascota {
    private final int MAX_ENERGIA = 100;
    private final int MIN_ENERGIA = 0;

    private String nombre;
    private int energia;
    private double peso;
    private boolean dormido;
    private int humor;
    private int cantComer;

    public Mascota(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
        this.energia = MAX_ENERGIA / 2;
        this.dormido = false;
        this.humor = 3;
        this.cantComer = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isDormido() {
        return dormido;
    }

    public int getHumor() {
        return humor;
    }

    public int getCantComer() {
        return cantComer;
    }

    public void comer() {
        if (!dormido) {
            energia += 20;
            peso += 0.5;
            humor++;
            cantComer++;
            if (energia > MAX_ENERGIA) {
                energia = MAX_ENERGIA;
            }
        }
    }

    public void dormir() {
        dormido = true;
    }

    public void despertar() {
        dormido = false;
    }

    public void caminar() {
        if (!dormido) {
            energia -= 10;
            peso -= 0.2;
            humor++;
            if (energia < MIN_ENERGIA) {
                energia = MIN_ENERGIA;
            }
        }
    }

    public void correr() {
        if (!dormido) {
            energia -= 30;
            peso -= 0.5;
            humor++;
            if (energia < MIN_ENERGIA) {
                energia = MIN_ENERGIA;
            }
        }
    }

    public void obtenerEnergia() {
        energia += 10;
        if (energia > MAX_ENERGIA) {
            energia = MAX_ENERGIA;
        }
    }

    public boolean estaVivo() {
        return energia > MIN_ENERGIA;
    }
}
