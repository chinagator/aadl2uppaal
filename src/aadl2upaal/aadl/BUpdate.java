package aadl2upaal.aadl;

public class BUpdate {
	private String expression;
	private APort port;
	private AVar var;

	public String getExpression() {
		return expression;
	}

	public BUpdate(String expression, APort port, AVar var) {
		this.expression = expression;
		this.port = port;
		this.var = var;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public APort getPort() {
		return port;
	}

	public void setPort(APort port) {
		this.port = port;
	}

	public AVar getVar() {
		return var;
	}

	public void setVar(AVar var) {
		this.var = var;
	}

}
