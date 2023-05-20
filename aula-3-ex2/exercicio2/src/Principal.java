public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println();
        Compositor jimiHendrix = new Compositor ("Jimi Hendrix", "E.U.A");
        String[] musicasjimi  = {"All Along the Watchtower", "Hey Joe",  "Little Wing"};
    
        jimiHendrix.definirMusicas (musicasjimi);
        jimiHendrix.listarMusicas();

        Compositor cartola = new Compositor ("Cartola", "Brasil");
        String[] musicasCartola  = {"Preciso me encontrar", "As rosas não falam",  "O mundo é um moinho"};
        cartola.definirMusicas (musicasCartola);
        cartola.listarMusicas();


        Compositor kirkHammett = new Compositor ("Kirk Hammet", "E.U.A");
        String[] musicaskirkHammet  = {"Fade to black", "Unforgiven",  "For whom the bells Tolls"};
        kirkHammett.definirMusicas (musicaskirkHammet);
        kirkHammett.listarMusicas();

        Compositor kurtCobain = new Compositor ("Kurt Cobain", "E.U.A");
        String[] musicasKurtCobain  = {"Come as you are", "Lithiun",  "Something in the way"};
        kurtCobain.definirMusicas (musicasKurtCobain);
        kurtCobain.listarMusicas();
    }
}
