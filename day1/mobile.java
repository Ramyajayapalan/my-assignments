package week1.day1;

public class mobile {
public void makeCall() {
       String mobileModel ="samsung";
       float mobileWeight=200.3f;
       System.out.println("To make call");

}
public void sendMsg() {
	   boolean fullCharged=true;
	   int mobileCost=20000;
	   System.out.println("To send Message");
	   
	   
}
public static void main(String[] args) {
	mobile obj=new mobile();
	obj.makeCall();
	obj.sendMsg();
	System.out.println("This is my Mobile");
}

}
		

		
	

