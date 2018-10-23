package Extension;

public class Main 
{
    public static void main(String[] args) 
    {
        // Clases predefinidas
        double result1 = Math.pow(2.0, 3.0);
        double result2 = Math.sqrt(result1);
        System.out.println(Double.toString(result1));
        System.out.println(result2);
        String txtChain1 = "Hi, I am a text chain";
        String txtChain2 = new String("New text chain");
        String txtChain3 = String.format(txtChain2, args);
    }
}
