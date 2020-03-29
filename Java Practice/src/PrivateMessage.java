
public class PrivateMessage implements IMsg {

	@Override
	public void sendMessage(MsgMain msg) {
		
		String privateMsg = msg.getPrivateMsg();
		System.out.println("private msg is "+privateMsg);
		
	}

}
