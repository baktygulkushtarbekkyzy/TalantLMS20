import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fileWriter=new FileWriter("Tex.txt")){
            for (char i ='A'; i <= 'Z'; i++) {
                fileWriter.write(i+ " "+Character.toLowerCase(i)+"\n");
            }
            for (char i = '0'; i <= '9'; i++) {
                fileWriter.write(i+"\n");
            }
        }catch (IOException e){
            System.out.println("EXCEPTION");
        }

        try (FileReader fileReader=new FileReader("Tex.txt")){
            Scanner scanner=new Scanner(fileReader);
            int a = 1;
            while (scanner.hasNext()){
                System.out.println(a+": "+ scanner.nextLine());
                a++;
            }
        }catch (IOException e){
            System.out.println("Mynday file jok ");
        }
    }
}