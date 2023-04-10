/*
 * Desenvolvimento de Sistemas
 * Gessione Lopes - gessione13@gmail.com
 * 
 * Obtem um CEP no ViaCEP
 */
package br.com.parg.viacep;

/**
 * Interface para os eventos
 *
 * @author Gessione Lopes
 */
public interface ViaCEPEvents {
    /**
     * Quando o CEP for encontrado com sucesso
     * @param cep retorna o objeto ViaCEP
     */
    public void onCEPSuccess(ViaCEP cep);
    
    /**
     * Quando ocorrer qualquer erro ao encontrar o CEP
     * @param cep retorna o CEP que foi requisitado
     */
    public void onCEPError(String cep);
}
