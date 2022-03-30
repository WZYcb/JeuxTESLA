package calcul;

import java.util.LinkedList;

public class Niveau {
	private int idNiveau;
	private String nom;
	private int nbRecharges;
	private int nbBonus;
	private Tesla tesla;
	private Position pointDepart;
	private Position pointArrivee;
	private int duree;
	private Position positionRecharges;
	private Position positionTrou;
	
	private LinkedList<Trou> trou = new LinkedList<Trou>();
	{
		trou.add(new Trou(1,10,Position.positioninitiale()));
		
	}
	
	private LinkedList<Recharge> recharge = new LinkedList<Recharge>();
	{
		recharge.add(new Recharge(1,10));
		
	}
	
	
	public Niveau(int idNiveau) {
		idNiveau=1;
		
		trou.add(new Trou(2,10,Position.positioninitiale() ));
		trou.add(new Trou(3,10, Position.positioninitiale()));
		recharge.add(new Recharge(2,10));
		recharge.add(new Recharge(3,10));
		setDuree(120);
		
		
	}
	
	
	
    public int getIdNiveau() {
		return idNiveau;
	}



	public void setIdNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getNbRecharges() {
		return nbRecharges;
	}



	public void setNbRecharges(int nbRecharges) {
		this.nbRecharges = nbRecharges;
	}



	public int getNbBonus() {
		return nbBonus;
	}



	public void setNbBonus(int nbBonus) {
		this.nbBonus = nbBonus;
	}



	public Position getPointDepart() {
		return pointDepart;
	}



	public void setPointDepart(Position pointDepart) {
		this.pointDepart = pointDepart;
	}



	public Position getPointArrivee() {
		return pointArrivee;
	}



	public void setPointArrivee(Position pointArrivee) {
		this.pointArrivee = pointArrivee;
	}



	
	public int getDuree() {
		return duree;
	}



	public void setDuree(int duree) {
		this.duree = duree;
	}


    public void niveau() {
    	setIdNiveau(1);
    	
    	setNbRecharges(3);
    	setNbBonus(0);
    	setDuree(120);
    	
    	
    }
    public void niveau2() {
    	setIdNiveau(2);
    	
    	setNbRecharges(5);
    	setNbBonus(1);
    	setDuree(100);
    	
    	
    }
    public void niveau3() {
    	setIdNiveau(3);
    	
    	setNbRecharges(3);
    	setNbBonus(2);
    	setDuree(90);
    	
    	
    }
    public void niveau4() {
    	setIdNiveau(4);
    	
    	setNbRecharges(7);
    	setNbBonus(3);
    	setDuree(80);
    	
    	
    }
    public void niveau5() {
    	setIdNiveau(5);
    	
    	setNbRecharges(9);
    	setNbBonus(4);
    	setDuree(70);
    	
    	
    }
    public void niveau6() {
    	setIdNiveau(6);
    	setNbAsteroides(9);
    	setNbTrouNoir(11);
    	setNbTrouBlanc(11);
    	setNbRecharges(11);
    	setNbBonus(5);
    	setDuree(60);
    	
    	
    }
    public void niveau7() {
    	setIdNiveau(7);
    	setNbAsteroides(11);
    	setNbTrouNoir(11);
    	setNbTrouBlanc(11);
    	setNbRecharges(11);
    	setNbBonus(5);
    	setDuree(60);
    	
    	
    }
    public void niveau8() {
    	setIdNiveau(8);
    	setNbAsteroides(13);
    	setNbTrouNoir(13);
    	setNbTrouBlanc(13);
    	setNbRecharges(13);
    	setNbBonus(6);
    	setDuree(50);
    	
    	
    }
    public void niveau9() {
    	this.setIdNiveau(9);
    	setNbAsteroides(13);
    	setNbTrouNoir(15);
    	setNbTrouBlanc(15);
    	setNbRecharges(15);
    	setNbBonus(7);
    	setDuree(70);
    	
    	
    }
	
    
    public void placerRecharges() {
    	positionRecharges.positioninitiale();
    }
    
    public void placerBonus() {
    	positionBonus.positioninitiale();
    }
    
    public void placerTesla() {
    	pointDepart.position(0, 0);
    	
    }



	public Tesla getTesla() {
		return tesla;
	}



	public void setTesla(Tesla tesla) {
		this.tesla = tesla;
	}
    
    

}
