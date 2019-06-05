package proj1_cs472;

//model for R-Format instructions
public class Rformat {

	public Rformat() {
		// TODO Auto-generated constructor stub
	}
	
	private int opcode;
	private int srcreg1;
	private int srcreg2;
	private int destreg;
	private int function;

	
	public int getOpcode() {
		return opcode;
	}
	public void setOpcode(int opcode) {
		this.opcode = opcode;
	}
	public int getSrcreg1() {
		return srcreg1;
	}
	public void setSrcreg1(int srcreg1) {
		this.srcreg1 = srcreg1;
	}
	public int getSrcreg2() {
		return srcreg2;
	}
	public void setSrcreg2(int srcreg2) {
		this.srcreg2 = srcreg2;
	}
	public int getDestreg() {
		return destreg;
	}
	public void setDestreg(int destreg) {
		this.destreg = destreg;
	}
	public int getFunction() {
		return function;
	}
	public void setFunction(int function) {
		this.function = function;
	}


}
