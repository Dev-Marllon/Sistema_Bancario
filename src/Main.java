import br.com.banco.Cliente;
import br.com.banco.ClienteDao;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     Cliente cliente = new Cliente();


        cliente.setNome("Carlos Oliveira");
        cliente.setCpf("98765432100");
        cliente.setEmail("carlos@gmail.com");
        cliente.setTelefone("21987654321");

     ClienteDao clienteDao = new ClienteDao();

     clienteDao.cadastrar(cliente);

    }
}