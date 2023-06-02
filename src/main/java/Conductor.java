class Conductor {
    private String nombre;
    private String apellido;
    private String telefono;
    private String licencia;

    public Conductor(String nombre, String apellido, String telefono, String licencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getLicencia() {
        return licencia;
    }

}