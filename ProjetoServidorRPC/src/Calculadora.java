public class Calculadora {
     //Calculo área do quadrado
    public int areaQuadrado(int a) {
        return (a * a);
    }
     // Calculo área do Tringulo Ratangulo
    public int areaTrianguloRetangulo(int a, int b) {
        return (a * b)/2;
    }
	// Calculo área da Circuferencia 
    public double areaCircunferencia(int a) {
        return (a * a) * 3.14;
    }
	 // Calculo área da Esfera 
    public double areaEsfera(int a) {
        return 4 * 3.14 * (a * a);
    }
     // Calculo volume Esfera 
    public double volumeEsfera(int a) {
        return 4/3 * 3.14 * Math.pow(a, 3);
    }
     // Calculo área Cilindro
    public double areaCilindro(int a, int b) {
        return 2 * 3.14 * a * (a + b);
    }
     // Calculo volume Cilindro 
    public double volumeCilindro(int a, int b) {
        return Math.pow(a, 2) * 3.14 * b;
    }
    // Calculo area Cubo
    public double areaCubo(int a, int b) {
        return 6 * Math.pow(a, 2);
    }
    // Calculo volume Cubo
    public double volumeCubo(int a, int b) {
        return Math.pow(a, 3);
    }
}