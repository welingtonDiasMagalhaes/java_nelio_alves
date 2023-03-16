package boardgame;

public class BoardException extends RuntimeException{ //RuntimeException: opcional de ser tratada

	private static final long serialVersionUID = 1L;
	
	public BoardException(String msg) {
		super(msg);//passa a mensagem para a superclasse RuntimeException
	}

}
