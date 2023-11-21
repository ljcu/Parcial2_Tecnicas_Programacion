public class Vuelo {
    private String codigo;
    private String origen;
    private String destino;
    private String horaSalida;
    private String horaLlegada;

    public Vuelo(String codigo, String origen, String destino, String horaSalida, String horaLlegada) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }

    Vuelo(String string, String madrid, String barcelona, String string0, String string1, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters y setters

    String getNumeroVuelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}