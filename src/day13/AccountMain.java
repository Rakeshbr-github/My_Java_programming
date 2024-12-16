package day13;

public class AccountMain {

	public static void main(String[] args) {
          Account acc=new Account();
          acc.setAccno(824);
          acc.setName("Rakesh");
          acc.setAmount(78);
          
          System.out.println(acc.getAccno());
          System.out.println(acc.getName());
          System.out.println(acc.getAmount());
	}

}
