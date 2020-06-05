package sist.com.basic.aop2;

public class Marine  implements Unit{
	private Command command;
	public Command getCommand() {
		return command;
	}
	public void setCommand(Command command) {
		this.command = command;
	}

	@Override
	public void doCommand() {
		// TODO Auto-generated method stub
		command.command();
		
	}
	
	
	

}
