import java.lang.Math;

public class mitosis {

	public void Mitosis() {

		System.out.println("");
		System.out.println("------------------------------------------------------------------MITOSIS------------------------------------------------------------------");
		System.out.println("");
		
		int basePairs = 50;
		String[] chromatidA1 = new String[basePairs];
		String[] chromatidA2 = new String[basePairs];
		String[] chromatidB1 = new String[basePairs];
		String[] chromatidB2 = new String[basePairs];
		String[] nucleicAcids = {"A","T","C","G"};
		
		for(int i = 0; i < basePairs; i++) {
			chromatidA1[i] = nucleicAcids[(int)Math.round(3*Math.random())];
			chromatidA2[i] = chromatidA1[i];
			chromatidB1[i] = nucleicAcids[(int)Math.round(3*Math.random())];
			chromatidB2[i] = chromatidB1[i];
		}
		
		
		// Interphase
		
		System.out.println("INTERPHASE - normal cell behaviour");
		System.out.println("1 chromosome pair, 1 sister chromatid per chromosome");
		System.out.println("");
		System.out.print("Sister A1 = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidA1[i]);
		}
		System.out.println("");
		System.out.print("Sister B1 = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidB1[i]);
		}
		System.out.println("");
		System.out.println("");
		
		// Prophase
		
		System.out.println("PROPHASE - condensation phase");
		System.out.println("1 chromosome pair, 2 sister chromatids per chromosome");
		System.out.println("");
		System.out.print("Sister A1 = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidA1[i]);
		}
		System.out.println("");
		System.out.print("Sister A2 = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidA2[i]);
		}
		System.out.println("");
		System.out.print("Sister B1 = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidB1[i]);
		}
		System.out.println("");
		System.out.print("Sister B2 = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidB2[i]);
		}
		System.out.println("");
		System.out.println("");
		// Metaphase
		
		System.out.println("METAPHASE - alignment phase");
		System.out.println("1 chromosome pair, 2 sister chromatids per chromosome");
		System.out.println("");

		// Anaphase
		
		System.out.println("ANAPHASE - sister separation phase");
		System.out.println("2 chromosome pairs, 1 sister chromatid per chromosome");
		System.out.println("");

		// Telophase
		System.out.println("TELOPHASE - cell division phase");
		System.out.println("2 cells, 1 chromosome pair each, 1 sister chromatid per chromosome");
		System.out.println("");
		System.out.print("Cell A, chromosome 1 = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidA1[i]);
		}
		System.out.println("");
		System.out.print("Cell A, chromosome 2 = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidB2[i]);
		}
		System.out.println("");
		System.out.print("Cell B, chromosome 1 = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidB1[i]);
		}
		System.out.println("");
		System.out.print("Cell B, chromosome 2 = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidA2[i]);
		}
		System.out.println("");
		System.out.println("");
		
	}

}
