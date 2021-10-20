import java.util.ArrayList;
import java.util.List;

public class Panier {
	List<Orange> panier;
	int taille;
	
	 
	public Panier(int ptaille) {
		taille=ptaille;
		panier = new ArrayList<Orange>();
	}
	
	public boolean isPlein() {
		return taille == panier.size();
	}
	
	public boolean isVide() {
		return panier.size() == 0;
	}
	
	public void boycott(String origin) {
		//List<Orange> tmp = new ArrayList<Orange>(panier);
		for (Orange o : panier) {
			if (o.getOrigine().equals(origin)) {
				panier.remove(o);
			}
		}
	}
	
	public int getSize() {
		return panier.size();
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		for(Orange o : panier) {
			res.append(o.toString());
		}
		return res.toString();
	}
	
	public float getPrix() {
		float res = 0;
		for (Orange o : panier) {
			res += o.getPrix();
		}
		return res;
	}
	
	public void ajoute(Orange o)  {
		if(isPlein() ) {
			throw new RuntimeException ("panier plein");
		}
		panier.add(o);
	}
	
	public void retire()  {
		if(isVide()) {
			throw new RuntimeException ("panier vide");
		}
		panier.remove(panier.size()-1);
	}
	
	public Orange get(int index) {
		return panier.get(index);
	}
	
	@Override
	public boolean equals(Object obj) {
		Panier p = (Panier)obj;
		boolean res = p.getSize() == panier.size();
		if(res) {
			for(int i =0;i<getSize() && res;i++) {
				res = res && p.get(i).equals(panier.get(i));
			}
		}
		return res;
	}
	

}
