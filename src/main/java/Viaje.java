class Viaje {
    private String ciudadOrigen;
    private String ciudadDestino;
    private String horaSalida;
    private String horaLlegada;

    public Viaje(String ciudadOrigen, String ciudadDestino, String horaSalida, String horaLlegada) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }
}