/**
 * 
 */
package proj1_cs472;

/**
 * @author feuler
 *
 */

//Enum to hold Bitmask for R-Format and I-Format instruction set fields.
public enum Bitmask {
	
	SREG1(0x03E00000),SREG2(0x001F0000),DESTREG(0x0000F800), SRCDEST(0x001F0000), OFFSET(0x0000FFFF), FUNCTION(0x0000003F);
	private int mask;

	public int getMask() {
		return mask;
	}

	public void setMask(int mask) {
		this.mask = mask;
	}

	private Bitmask(int mask) {
		this.mask = mask;
	}
}
