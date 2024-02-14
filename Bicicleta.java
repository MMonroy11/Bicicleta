
package javaapplication4;

    public  class Bicicleta {
    private int velocidadActual;
    int platoActual;

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    int piñonActual;
    public Bicicleta (int v, int p, int pa)
    {
    velocidadActual=v;
    platoActual=p;
    piñonActual=pa;
    }
    public int acelerar(int velocidadActual)
    {
    return velocidadActual*2;
    }
    public int frenar(int velocidadActual)
    {
    return velocidadActual/2;
    }
    public int cambiarplato(int plato, int platoActual)
    {
    return platoActual=plato;
    }
    public int cambiarPiñon(int piñon, int piñonActual)
    {
    return piñonActual=piñon;
    }
}


