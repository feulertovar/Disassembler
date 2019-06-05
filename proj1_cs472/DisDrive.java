package proj1_cs472;

public class DisDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DisDrive me = new DisDrive();
		me.doIt();

	}

	public void doIt() {

		//int[] Instruct = new int[] { 0x032BA020, 0x8CE90014, 0x12A90003, 0x022DA822, 0xADB30020, 0x02697824, 0xAE8FFFF4,
		//	0x018C6020, 0x02A4A825, 0x158FFFF7, 0x8ECDFFF0 };
		//
		// Array of instructions
		int[] Instruct = new int[] { 0xa1020000, 0x810AFFFC, 0x00831820, 0x01263820, 0x01224820, 0x81180000, 0x81510010,
				0x00624022, 0x00000000, 0x00000000, 0x00000000, 0x00000000 };
		
		//int[] Instruct = new int[] { 0x8CE90014, 0x032BA020, 0x12A90003, 0x158FFFF7, 0x8D070001 };

		Disasembler dis = new Disasembler();

		// array length
		int len = Instruct.length;
		int opcode;
		Rformat instR;
		Iformat instI;

		// loop through array to get instructions
		for (int i = 0; i < len; i++) {

			// checkOpcode
			// RFormat = 0
			// IFormat ( 1...3F )
			
			// Program Counter, increment by 4.
			Disasembler.setCurAddress(Disasembler.getCurAddress() + Disasembler.getPcConstant());
			
			opcode = (Instruct[i] >>> 26);
			if (opcode == 0) {
				// RFormart
				instR = dis.RDisassembler(Instruct[i]);
				dis.DisplayR(instR);

			} else if (opcode >= 1 | opcode <= 3F) {
				// IFormart
				instI = dis.IDisabssembler(Instruct[i]);
				dis.DisplayI(instI);

			}

		}

	}

}
