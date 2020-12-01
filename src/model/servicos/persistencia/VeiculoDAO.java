package model.servicos.persistencia;

import model.entidades.Veiculo;
import java.util.List;
import model.entidades.Modelo;
import model.exceptions.DBException;

/**
 *
 * @author Alexsander
 */
public interface VeiculoDAO {

    void inserir(Veiculo veiculo) throws DBException;

    void atualizar(Veiculo veiculo);

    Veiculo buscar(Integer id);

    Veiculo buscar(String placa);

    List<Veiculo> buscar(Modelo modelo);

    List<Veiculo> buscarTodos();

}
