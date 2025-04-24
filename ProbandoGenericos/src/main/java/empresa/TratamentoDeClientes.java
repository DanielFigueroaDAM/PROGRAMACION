package empresa;

import java.util.ArrayList;
import java.util.Collection;

public class TratamentoDeClientes {
    public static void main(String args[]){
        Collection<Cliente> coleccionCliente;
        coleccionCliente = new ArrayList<>();
        coleccionCliente.add(new Cliente("123456783H","Pepe","29/09/2021"));
        coleccionCliente.add(new Cliente("123456785H","Manolo","23/09/2021"));
        coleccionCliente.add(new Cliente("123456787H","Maria","26/09/2021"));
        Cliente unCliente = new Cliente("123456587H","Oscar","26/09/2021");
        coleccionCliente.add(unCliente);
        coleccionCliente.remove(unCliente);
        coleccionCliente.clear();
    }
}
