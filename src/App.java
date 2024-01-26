import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        int total =contador(a);
        if(total%2 == 0){
            System.out.println(a +"0");
        }else{
            System.out.println(a +"1");
        }

        sc.close();
    }

    public static int contador(String a){
        int b = 0;

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '1'){
                b++;
            }
        }
        return b;
    }
}
