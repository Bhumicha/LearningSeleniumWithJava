package Encapsulation;

public class AccountMain {
   public static void main (String[] args)
   {
       Account acc = new Account();
       acc.setAccNo(202);
       acc.setName("Bhumi");
       acc.setAmount(23000.91);
       
       System.out.println(acc.getAccNo());
       System.out.println(acc.getName());
       System.out.println(acc.getAmount());
   }
}
