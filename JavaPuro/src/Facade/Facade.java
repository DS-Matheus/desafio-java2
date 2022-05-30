package Facade;

import Facade.SubsistemaCep.CepApi;
import Facade.SubsistemaCrm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recurperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
