package servicos;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorGenerico<T> {
    private List<T> objetos;
    public GerenciadorGenerico() {
        objetos = new ArrayList<>();
    }
    public void adicionar(T objeto) {
        objetos.add(objeto);
    }
    public T buscar(int indice) {
       return objetos.get(indice);
    }
    public void remover (T objeto) {
        objetos.remove(objeto);
    }
    public int tamanho() {
        return objetos.size();
    }
    public List<T> listar() {
        return objetos;
    }
}
