
package clases;

/**
 *
 * @author J.Armando
 */
public class Cliente 
{
    private Calculadora2 ws = new Calculadora2();
    private Calculadora2PortType conector = ws.getCalculadora2SOAP11PortHttp();
    
    public double sumar(double a, double b)
    {
        return conector.sumar(a,b);
    }
    
    public double restar(double a, double b)
    {
        return conector.restar(a, b);
    }
    
    public double multiplicar(double a, double b)
    {
        return conector.multiplicar(a, b);
    }
    
    public double dividir(double a, double b)
    {
        return conector.dividir(a, b);
    }
    
    public double realizarRaiz(double a)
    {
        return conector.sacarRaiz(a);
    }
    
    public double realizarPotencia(double a)
    {
        return conector.elevarPotencia(a, 2.0);
    }
}
