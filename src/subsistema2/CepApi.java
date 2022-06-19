package subsistema2;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    public CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Sao Carlos";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
