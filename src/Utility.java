import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
            br.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        return accounts;
    }
    public static void writeFile(ArrayList<Account> accounts,String fileName){
        
            try {
                FileWriter fw = new FileWriter(fileName);
                BufferedWriter bw = new BufferedWriter(fw);
                for (Account a : accounts){
                bw.write(a.toString()+"<>"+a.getAccountHolder()+"<>"+a.getAccountOpenDate()+"<>"+String.valueOf(a.getAccountBalance()+"\n"));
                }
                bw.close();
            }
            catch(Exception e){
                System.out.println(fileName);
            }
        
        
        
    }
    
}
