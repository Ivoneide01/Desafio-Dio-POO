public class Fabrica {
    public static void main(String[] args) {

        Iphone iphone = new Iphone(); // transformando de Iphone para iphone
        AparelhoTelefonico aparelhoTelefonico = iphone; // recebendo a classe iphone
        NavegadornaInternet navegadornaInternet = iphone;
        ReprodutorMusical reprodutorMusical = iphone;

        // chamando para imprimi
        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.iniciarCorreioVoz();

        // chamando para imprimi
        navegadornaInternet.adicionarNovaAba();
        navegadornaInternet.atualizarPagina();
        navegadornaInternet.exibirPagina(null);

        // chamando para imprimir
        reprodutorMusical.selecionarMusica(null);
        reprodutorMusical.pausar();
        reprodutorMusical.tocar();
    }
}
