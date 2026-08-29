package br.com.meusistema.main;
import br.com.meusistema.model.Carro;

public class Sistema {
    public static void main(String[] args){
        System.out.println("Iniciando o sistem...");

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fusca";
        meuCarro.cor = "Azul";

        meuCarro.buzinar();

        Carro Carro2 = new Carro();
        Carro2.modelo = "Gol";
        Carro2.cor = "Preto";
        
        Carro2.buzinar();
    }    
}
