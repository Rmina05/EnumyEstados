public class Automovil{
    String marca;
    int modelo;
    int velocidadMaxima;
    int velocidadActual =0;
    tipoCom tipoCombustible;
    public enum tipoCom {
        GASOLINA,
        BIOETANOL,
        DIESEL,
        GAS_NATURAL,
    }
    enum tipoAuto{
        CIUDAD,
        COMPACTO,
        SUBCOMPACTO,
        SUV,
        EJECUTIVO
    }
    tipoAuto tipoAutomovil;
    public Automovil(String marca, int modelo, int velocidadMaxima, Automovil.tipoCom tipoCombustible,
            Automovil.tipoAuto tipoAutomovil) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    public tipoCom getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public tipoAuto getTipoAutomovil() {
        return tipoAutomovil;
    }
    public void setTipoAutomovil(tipoAuto tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    
void acelerar (int incrementar){
    if ((velocidadActual+incrementar)<velocidadMaxima) {
        velocidadActual=velocidadActual+incrementar;
    } else {
        System.err.println("no se puede acelerar por encima de la velocidad maxima");
        
    }
}
void desacelerar(int decremento){
   if ((velocidadActual-decremento)>0) {
    velocidadActual= velocidadActual-decremento;
    
   } else {
    System.out.println("no se puede desacelerar por debajo de 0");
   }
   
    }
    void frenar(){
        velocidadActual=0;
    }
    double calculartiempollegada(int distancia){
        return distancia/velocidadActual;
    }
    void mostrar(){
        System.out.println("marca" + marca);
        System.out.println("modelo" + modelo);
        System.out.println("velocidad actual"+ velocidadActual);
        System.out.println("velocidad maxima" + velocidadMaxima);
        System.out.println("tipo de combustible" + tipoCombustible);
        System.out.println("tipo de automovil" + tipoAutomovil);
    }
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("TOYOTA", 2023, 280, tipoCom.DIESEL, tipoAuto.CIUDAD);
        auto1.mostrar();
        auto1.setVelocidadActual(100);
        System.out.println("velocidad actual = " + auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("velocidad actual = " + auto1.velocidadActual);
        auto1.frenar();
        System.out.println("velocidad actual = " + auto1.velocidadActual);

    }
}



