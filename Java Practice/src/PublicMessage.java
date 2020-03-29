import java.util.ArrayList;

public class PublicMessage implements IMsg {

	@Override
	public void sendMessage(MsgMain msg) {
		
		String publicMsg = msg.getPublicMsg();
		System.out.println("public msg is "+publicMsg);
		
		
	}

}
