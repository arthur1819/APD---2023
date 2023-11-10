import java.net.URL;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class ClienteRPC {

    //atributo cliente que sera usado paar fazer chamadas XML-RPC

    private XmlRpcClient cliente;
	
    // Construtor da classe recebe uma URL do servidor
    public ClienteRPC(String urlServidor) {
		try {
			//configura o cliente para que ele possa se conectar ao servidor
			XmlRpcClientConfigImpl configuracaoCliente = new XmlRpcClientConfigImpl();
            configuracaoCliente.setServerURL (new URL(urlServidor));
			//seta a configuração no cliente
            cliente = new XmlRpcClient();
            cliente.setConfig(configuracaoCliente);
        } catch (Exception exception) {
            System.err.println("JavaServer: " + exception);
        }
    }
    // configurando os métodospara serem usados.
    // foi usado Double por conta de valores altos ou quebrados.

    // área do quadrado 
    public int areaQuadrado(int a) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(a)};
        Integer resultado = (Integer) cliente.execute("Calcular.areaQuadrado", parametros);
        return resultado;
    }
    // área Triangulo Retangulo
    public double areaTrianguloRetangulo(int a, int b) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(a), Integer.valueOf(b)};
        Integer resultado = (Integer) cliente.execute("Calcular.areaTrianguloRetangulo", parametros);
        return resultado;
    }
    // área circunferencia 
    public double areaCircunferencia(int a) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(a)};
        Double resultado = (Double) cliente.execute("Calcular.areaCircunferencia", parametros);
        return resultado;
    }
    // área ESfera
    public double areaEsfera(int a) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(a)};
        Double resultado = (Double) cliente.execute("Calcular.areaEsfera", parametros);
        return resultado;
    }
    // Volume Esfera 
    public double volumeEsfera(int a) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(a)};
        Double resultado = (Double) cliente.execute("Calcular.volEsfera", parametros);
        return resultado;
    }
    
    // área Cilindro
    public double areaCilindro(int a, int b) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(a), Integer.valueOf(b)};
        Double resultado = (Double) cliente.execute("Calcular.areaCilindro", parametros);
        return resultado;
    }
    
    // volume Cilindro
    public double volumeCilindro(int a, int b) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(a), Integer.valueOf(b)};
        Double resultado = (Double) cliente.execute("Calcular.volCilindro", parametros);
        return resultado;
    }	

     // área Cubo
     public double areaCubo(int a, int b) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(a), Integer.valueOf(b)};
        Double resultado = (Double) cliente.execute("Calcular.areaCubo", parametros);
        return resultado;
    }	

    // volume cubo 
    public double volumeCubo(int a, int b) throws Exception {
        Object[] parametros = new Object[]{Integer.valueOf(a), Integer.valueOf(b)};
        Double resultado = (Double) cliente.execute("Calcular.volCubo", parametros);
        return resultado;
    }

}








