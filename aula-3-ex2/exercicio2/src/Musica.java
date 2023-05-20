public class Musica {
    public String titulo;
    public Compositor compositor;

    public Musica(String nome, Compositor compositor) {
        this.titulo = nome;
        this.compositor = compositor;
    }

    public void mostrarCompositor(){
        System.out.println("O compositor é" + " " + compositor.nome );
    }
}
