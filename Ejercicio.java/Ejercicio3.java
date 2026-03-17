class libro{
    String titulo;
    String autor;
    String ISBN;
    int numeropaginas;
    boolean disponible;
    public libro(String titulo, String autor, String ISBN, int numeropaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeropaginas = numeropaginas;
        this.disponible = true;
    }

    Void prestar() {
        if (disponible){
            disponible = false;
            System.out.println("Libro prestado");
        }   else{
            System.out.println("No esta disponible");
        }
        return null;
     }
     void devolver(){
        disponible = true;
        System.out.println("Libro devuelto");
     }
     void estadisponible(){
        System.out.println("Disponible:" + disponible);
     }

}
