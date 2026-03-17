class ReservaHotel{
    String cliente;
    String fechaEntrada;
    String fechaSalida;
    int numeroHabitacion;
    boolean activa;

    public ReservaHotel(String cliente, String fechaEntrada, String fechaSalida, int numeroHabitacion){
        this.cliente = cliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numeroHabitacion = numeroHabitacion;
        this.activa = false;
    }

    void nuevaReserva(){
        activa = true;
        System.out.println("Reserva creada");
    }
    void cancelaReserva(){
        activa = false;
        System.out.println("Reserva cancelada");
    }
    void consultaReserva(){
        System.out.println("Cliente:"+ cliente);
        System.out.println("Entrada:" + fechaEntrada);
        System.out.println("Salida:" + fechaSalida);
        System.out.println("Habitacion:" + numeroHabitacion);
        System.out.println("Activa:" + activa);
    }
}