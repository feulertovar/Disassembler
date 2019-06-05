package proj1_cs472;

//model for the Iformat instructions 
public class Iformat {

	public Iformat() {
		// TODO Auto-generated constructor stub
	}

	private int opcode;
	private int srcreg;
	private int srcdest;
	private short offset;
	
	public int getOpcode() {
		return opcode;
	}
	public void setOpcode(int opcode) {
		this.opcode = opcode;
	}
	public int getSrcreg() {
		return srcreg;
	}
	public void setSrcreg(int srcreg) {
		this.srcreg = srcreg;
	}
	public int getSrcdest() {
		return srcdest;
	}
	public void setSrcdest(int srcdest) {
		this.srcdest = srcdest;
	}
	public short getOffset() {
		return offset;
	}
	public void setOffset(short offset) {
		this.offset = offset;
	}


}
