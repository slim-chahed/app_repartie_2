package act2_1;
import java.io.*;


import java.net.Socket;
import java.util.Scanner;




public class Client {
	public static void main(String[] args){
	try
    {

		System.out.println("je suis un client non connecté ");
        Socket s = new Socket("localhost", 1237);

        System.out.println("je suis connecté ");
        
        InputStream input = s.getInputStream();
        OutputStream output = s.getOutputStream();
        InputStreamReader isr = new InputStreamReader(input);
        BufferedReader br = new BufferedReader(isr);


        Scanner scanner = new Scanner(System.in);

        System.out.println("donner nb1 = ");
        String nb1 = scanner.nextLine();
        System.out.println("donner nb2 = ");
        String nb2 = scanner.nextLine();

        String op;
        do{
            System.out.println("donner op = ");
            op = scanner.nextLine();
        }while(!(op.equals("+")) && !(op.equals("-")) && !(op.equals("*")) && !(op.equals("/")));


        PrintWriter pw = new PrintWriter(output,true);

        pw.println(nb1);
        pw.println(nb2);
        pw.println(op);


        System.out.println(br.readLine());

    }catch(Exception e){
        System.out.println("CLient here");
        throw new RuntimeException(e);
    }
}
}
