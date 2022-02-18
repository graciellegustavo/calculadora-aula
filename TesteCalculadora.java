public class TesteCalculadora {


    public static Double soma(Double x,Double y) {
        return x + y;
    }

    public static Double subtracao(Double x,Double y) {
        return x - y;
    }

    public static void main(String[] args) {
        Double x = 5.0;
        Double y = 8.0;

        System.out.println("soma =  " + soma(x, y));  
        System.out.println("subtracao =  " + subtracao(x, y));       
    }
    
}
