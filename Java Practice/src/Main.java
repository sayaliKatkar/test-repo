import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		MsgMain msg1 = new MsgMain();
		
		msg1.setPrivateMsg("hi");
		
		
		MsgMain msg2 = new MsgMain();
		
		msg2.setPublicMsg("hi all");

		
		IMsg m1 = new PrivateMessage();
		m1.sendMessage(msg1);
		
		
		IMsg m2 = new PublicMessage();
		m2.sendMessage(msg2);
		
		
			
		
	}

}
