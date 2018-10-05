package parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole {
		
	ArrayList<String> parole=new ArrayList<String>();
	
	public Parole() {
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole);
		return null;
	}
	
	public void reset() {
		parole.clear();
	}

	@Override
	public String toString() {
		String s="";
		for (int i = 0; i < parole.size(); i++) {
			s+=parole.get(i)+"\n";
		}
		return s;
	}
	
	

}
