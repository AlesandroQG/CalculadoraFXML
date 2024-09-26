package model;

/**
 * Clase de operaciones
 *
 * @author alesandroquirosgobbato
 */
public class Operaciones {
    private double a;
    private double b;

    /**
     * Constructor de la clase
     *
     * @param a operador 1
     * @param b operador 2
     */
    public Operaciones(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Getter para el operador 1
     *
     * @return operador 1
     */
    public double getA() {
        return a;
    }

    /**
     * Setter para el operador 1
     *
     * @param a nuevo valor del operador 1
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * Getter para el operador 2
     *
     * @return operador 2
     */
    public double getB() {
        return b;
    }

    /**
     * Setter para el operador 2
     *
     * @param b nuevo valor del operador 2
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Suma los operadores 1 y 2
     *
     * @return resultado de la suma
     */
    public double sumar() {
        return a + b;
    }

    /**
     * Resta los operadores 1 y 2
     *
     * @return resultado de la resta
     */
    public double restar() {
        return a - b;
    }

    /**
     * Multiplica los operadores 1 y 2
     *
     * @return resultado de la multiplicación
     */
    public double multiplicar() {
        return a * b;
    }

    /**
     * Divide los operadores 1 y 2
     *
     * @return resultado de la división
     */
    public double dividir() {
        return (double) a / b;
    }
}
