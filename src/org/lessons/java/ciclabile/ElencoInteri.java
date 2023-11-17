package org.lessons.java.ciclabile;

public class ElencoInteri {

	private int[] elenco;
	private int indice;
	
	public ElencoInteri (int[] elenco) {
		
		 this.elenco = elenco;
	     this.indice = -1;
		
	}
	
	public ElencoInteri() {
        this.elenco = new int[0];
        this.indice = -1;
    }
	

	public int[] getElenco() {
		return elenco;
	}

	public void setElenco(int[] elenco) {
		this.elenco = elenco;
	}

	public int getIndice() {
		return indice;
	}
	
	public int getElementoSuccessivo() {
        if (elenco.length == 0) {
            return -1; 
        }

        indice = (indice + 1) % elenco.length;
        return elenco[indice];
    }
	
	public boolean hasAncoraElementi() {
		return elenco.length > 0 && indice < elenco.length - 1;
	}
	
	public void addElemento(int nuovoElemento) {
        int[] nuovoElenco = new int[elenco.length + 1];
        System.arraycopy(elenco, 0, nuovoElenco, 0, elenco.length);
        nuovoElenco[elenco.length] = nuovoElemento;
        elenco = nuovoElenco;
    }
	
}
