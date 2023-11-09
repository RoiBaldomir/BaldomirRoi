import java.time.LocalDate;

public class ReservaVuelo {
    // Atributos
    private String nombre;
    private String destino;
    private LocalDate fechaViaje;
    private int numeroAsientos;
    private int asientosDisponibles;

    // Constructores
    public ReservaVuelo() {
    }

    public ReservaVuelo(String nombre, String destino, LocalDate fechaViaje, int numeroAsientos) throws ReservaInvalidaException {
        // Asientos disponibles en el avión
        this.asientosDisponibles = 150;
        // Excepción si se solicitan más asientos de los permitidos
        if (numeroAsientos > this.asientosDisponibles) {
            throw new ReservaInvalidaException("No se pueden solicitar más asientos de los disponibles en el avión.");
        }
        // Excepción si se solicita menos de 1 asiento
        if (numeroAsientos < 1) {
            throw new ReservaInvalidaException("El número de asientos no puede ser inferior a 1.");
        }
        // Excepción si el nombre va vacio
        if(nombre.isEmpty()) {
            throw new ReservaInvalidaException("El nombre en la reserva no puede quedar vacío.");
        }
        // Excepción si el destino va vacio
        if(destino.isEmpty()) {
            throw new ReservaInvalidaException("El destino en la reserva no puede quedar vacío.");
        }
        // Excepción si la fecha es anterior al día de hoy
        if (fechaViaje.isBefore(LocalDate.now())) {
            throw new ReservaInvalidaException("La fecha de viaje no puede ser anterior al día de hoy.");
        }
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.numeroAsientos = numeroAsientos;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(LocalDate fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    // Método toString()
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaViaje=" + fechaViaje +
                ", numeroAsientos=" + numeroAsientos;
    }
}
