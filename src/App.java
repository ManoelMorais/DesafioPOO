public class App {
    public static void main(String[] args) throws Exception {
        AparelhoTelefonico.atender();
        AparelhoTelefonico.iniciarCorreioVoz();
        AparelhoTelefonico.ligar("+99-88973-2777");

        NavegadorInternet.exibirPagina("www.google.com");
        NavegadorInternet.atualizarPagina();
        NavegadorInternet.adicionarNovaAba();

        ReprodutorMusical.SelecionarMusica("Heitor Costa");
        ReprodutorMusical.Tocar();
        ReprodutorMusical.Pausar();
    }
}
