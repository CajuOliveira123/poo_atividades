public class Compositor {
    public String nome;
    public String pais;
    public Musica[] musica;

    Compositor(String nome, String pais){
        this.nome = nome;
        this.pais = pais;
    }

    public void listarMusicas(){
        System.out.println("Listagem de músicas" + " " + this.nome );
        for (int i = 0; i <musica.length; i++){
            System.out.println(musica[i].titulo);
        }
        System.out.println();
    }
    
    public void definirMusicas(String[] tituloDasMusicas){
        musica = new Musica[tituloDasMusicas.length];
        for (int i = 0; i<tituloDasMusicas.length; i++){
            musica[i] = new Musica(tituloDasMusicas[i], this);
        }

    }
}

