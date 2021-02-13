package cat.aoc.st.restservice;

public class Resultat {
	
	private final String resultat;
	private final long duracio;

	public String getResultat() {
		return resultat;
	}
	
	public long getDuration() {
		return duracio;
	}
	
	public Resultat(String resultat, long duracio) {
		this.resultat = resultat;
		this.duracio = duracio;
	}
	
}
