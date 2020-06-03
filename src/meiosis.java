import java.lang.Math;

public class meiosis {

	public void Meiosis() {

		System.out.println("");
		System.out.println("------------------------------------------------------------------MEIOSIS------------------------------------------------------------------");
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
		
		// Prophase 1
		
		System.out.println("PROPHASE 1 - first condensation phase");
		System.out.println("1 chromosome pair, 2 sister chromatids per chromosome");
		System.out.println("");
		System.out.print("Sister A1 = ");
		int crossover = (int)Math.round(Math.random()*0.5*basePairs);
		for(int i = 0; i < crossover; i++) {
			chromatidA2[i] = chromatidB1[i];
			chromatidB2[i] = chromatidA1[i];
		}
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
		// Metaphase 1
		
		System.out.println("METAPHASE 1 - first alignment phase");
		System.out.println("1 chromosome pair, 2 sister chromatids per chromosome");
		System.out.println("");

		// Anaphase 1
		
		System.out.println("ANAPHASE 1 - first sister separation phase");
		System.out.println("2 chromosomes, 2 sister chromatids per chromosome");
		System.out.println("");

		// Telophase 1
		System.out.println("TELOPHASE 1 - first cell division phase");
		System.out.println("2 cells, 1 chromosome each, 2 sister chromatids per chromosome");
		System.out.println("");
		System.out.print("Cell A, sister chromatid 1 = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidA1[i]);
		}
		System.out.println("");
		System.out.print("Cell A, sister chromatid 2 = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidA2[i]);
		}
		System.out.println("");
		System.out.print("Cell B, sister chromatid 1 = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidB1[i]);
		}
		System.out.println("");
		System.out.print("Cell B, sister chromatid 2 = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidB2[i]);
		}
		System.out.println("");
		System.out.println("");
		
		// Prophase 2
		System.out.println("PROPHASE 2 - second condensation phase");
		System.out.println("2 cells, 1 chromosome, 2 sisters chromatids per chromosome");
		System.out.println("");
		
		// Metaphase 2
		System.out.println("PROPHASE 2 - second alignment phase");
		System.out.println("2 cells, 2 chromosomes, 1 sister chromatids per chromosome");
		System.out.println("");
		
		// Anaphase 2
		System.out.println("ANAPHASE 2 - second sister separation phase");
		System.out.println("2 chromosomes, 1 sister chromatids per chromosome");
		System.out.println("");
		
		// Telophase 2
		System.out.println("TELOPHASE 2 - second cell division phase");
		System.out.println("4 cells, 1 chromosome each, 1 sister chromatids per chromosome");
		System.out.println("");
		System.out.print("Cell A1, sister chromatid = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidA1[i]);
		}
		System.out.println("");
		System.out.print("Cell A2, sister chromatid = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidA2[i]);
		}
		System.out.println("");
		System.out.print("Cell B1, sister chromatid = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidB1[i]);
		}
		System.out.println("");
		System.out.print("Cell B2, sister chromatid = ");
		for(int i = 0; i < basePairs; i++) {
			System.out.print(chromatidB2[i]);
		}
		System.out.println("");
		System.out.println("");
		
	}

}
