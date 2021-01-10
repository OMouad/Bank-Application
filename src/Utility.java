import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
public class Utility {
    
    public static ArrayList<Account> readFile(String file){
        ArrayList<Account> accounts = new ArrayList<>();
        try {
            FileReader fr;
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line= br.readLine())!= null){
                String[] currentAccount = line.split("<>");
                String accountNumber =currentAccount[0];
                String accountholder=currentAccount[1];
                String openDate=currentAccount[2];
                double balance= Double.parseDouble(currentAccount[3]);
                Account a= new Account(accountNumber,accountholder,openDate,balance);
                accounts.add(a);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return accounts;
    }
    
}
