
public class Orange {
private String origine;
private double prix;
public Orange(String origine, double prix)  {
	if (prix < 0) {
		throw new RuntimeException("prix négatif");
	}
	this.origine = origine;
	this.prix = prix;
}
public String getOrigine() {
	return origine;
}
public double getPrix() {
	return prix;
}
@Override
public boolean equals(Object o) {
	if (o != null) {
		
		Orange or = (Orange) o;
		return or.getOrigine().equals(origine) && or.getPrix() == prix;
	}
	return false;
}

@Override
	public String toString() {
		return "Origine : "+origine+" prix : "+prix+"\n";
	}

}
