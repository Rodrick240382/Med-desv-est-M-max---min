
import java.util.Arrays;

public class Estaturas {
        public static void main(String[] args) {
            
            // Agregue un array de estaturas
            double[] estaturas = {1.75, 1.65, 1.80, 1.60, 1.70, 1.85, 1.90, 1.80, 1.75, 1.55};

            // Calculando la media
            double media = 0;
            for (double estatura : estaturas) {
                media += estatura; 
            }
            media /= estaturas.length;

            // Calculando la desviacion estandar
            double varianza = 0;
            for (double estatura : estaturas) {
                varianza += Math.pow(estatura - media,2);
            }
            double desviacion = 0;
            try {
                desviacion = Math.sqrt(varianza / (estaturas.length-1));
            } catch (ArithmeticException e) {
                System.err.println("No se puede calcular la desviacion estandar: " + e.getMessage());
                System.exit(1);
            }
            
            //Calculando la estatuta menor y mayor
            double mayor = Double.MIN_VALUE;
            double menor = Double.MAX_VALUE;
            for (double estatura : estaturas) {
                if(estatura < menor) {
                    menor = estatura;
                }
                if (estatura > mayor) {
                    mayor = estatura;
                }
            }

            // Imprimierndo los resultados
            System.out.println("Estaturas: " + Arrays.toString(estaturas));
            System.out.println("Media: " + media);
            System.out.println("Desviacion estandar: " + desviacion);
            System.out.println("Estatura menor: " + menor);
            System.out.println("Estatura mayor: " + mayor);

        }
}
