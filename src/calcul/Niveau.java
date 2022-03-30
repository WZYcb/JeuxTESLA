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
	
	private LinkedList<Trou> trou = new LinkedList<Trou>();
	{
		trou.add(new Trou(1,10,5));
		
	}
	
	private LinkedList<Recharge> recharge = new LinkedList<Recharge>();
	{
		recharge.add(new Recharge(1,10));
		
	}
	
	
	public Niveau(int idNiveau) {
		Tesla tesla=new Tesla(1);
		tesla.setPositionTesla(pointDepart);
		if (idNiveau==1) {
		   trou.add(new Trou(2,10,5));
		   trou.add(new Trou(3,10,5));
		   recharge.add(new Recharge(2,10));
		   recharge.add(new Recharge(3,10));
		   setDuree(120);	
		}
		if (idNiveau==2) {
			trou.add(new Trou(2,10,5));
			trou.add(new Trou(3,10,5));
		    trou.add(new Trou(4,10,10));
		    recharge.add(new Recharge(2,10));
			recharge.add(new Recharge(3,10));
			recharge.add(new Recharge(4,10));
			setDuree(110);
			
		}
		if (idNiveau==3) {
			trou.add(new Trou(2,10,5));
			trou.add(new Trou(3,10,5));
		    trou.add(new Trou(4,10,10));
		    trou.add(new Trou(5,10,10));
		    trou.add(new Trou(6,10,10));
		    recharge.add(new Recharge(2,10));
			recharge.add(new Recharge(3,10));
			recharge.add(new Recharge(4,10));
			recharge.add(new Recharge(5,10));
			recharge.add(new Recharge(6,10));
			setDuree(100);
			
		}
		if (idNiveau==4) {
			trou.add(new Trou(2,10,5));
			trou.add(new Trou(3,10,5));
		    trou.add(new Trou(4,10,10));
		    trou.add(new Trou(5,10,10));
		    trou.add(new Trou(6,10,15));
		    trou.add(new Trou(7,10,15));
		    recharge.add(new Recharge(2,10));
			recharge.add(new Recharge(3,10));
			recharge.add(new Recharge(4,10));
			recharge.add(new Recharge(5,10));
			recharge.add(new Recharge(6,10));
			recharge.add(new Recharge(7,10));
			setDuree(95);
			
		}
		if (idNiveau==5) {
			trou.add(new Trou(2,10,5));
			trou.add(new Trou(3,10,5));
		    trou.add(new Trou(4,10,10));
		    trou.add(new Trou(5,10,10));
		    trou.add(new Trou(6,10,15));
		    trou.add(new Trou(7,10,15));
		    trou.add(new Trou(8,10,15));
		    recharge.add(new Recharge(2,10));
			recharge.add(new Recharge(3,10));
			recharge.add(new Recharge(4,10));
			recharge.add(new Recharge(5,10));
			recharge.add(new Recharge(6,10));
			recharge.add(new Recharge(7,10));
			recharge.add(new Recharge(8,10));
			setDuree(90);
			
		}
		if (idNiveau==6) {
			trou.add(new Trou(2,10,5));
			trou.add(new Trou(3,10,5));
		    trou.add(new Trou(4,10,10));
		    trou.add(new Trou(5,10,10));
		    trou.add(new Trou(6,10,15));
		    trou.add(new Trou(7,10,15));
		    trou.add(new Trou(8,10,15));
		    trou.add(new Trou(9,10,15));
		    recharge.add(new Recharge(2,10));
			recharge.add(new Recharge(3,10));
			recharge.add(new Recharge(4,10));
			recharge.add(new Recharge(5,10));
			recharge.add(new Recharge(6,10));
			recharge.add(new Recharge(7,10));
			recharge.add(new Recharge(8,10));
			recharge.add(new Recharge(9,10));
			setDuree(85);
			
		}
		if (idNiveau==7) {
			trou.add(new Trou(2,10,5));
			trou.add(new Trou(3,10,5));
		    trou.add(new Trou(4,10,10));
		    trou.add(new Trou(5,10,10));
		    trou.add(new Trou(6,10,15));
		    trou.add(new Trou(7,10,15));
		    trou.add(new Trou(8,10,15));
		    trou.add(new Trou(9,10,20));
		    trou.add(new Trou(10,10,20));
		    recharge.add(new Recharge(2,10));
			recharge.add(new Recharge(3,10));
			recharge.add(new Recharge(4,10));
			recharge.add(new Recharge(5,10));
			recharge.add(new Recharge(6,10));
			recharge.add(new Recharge(7,10));
			recharge.add(new Recharge(8,10));
			recharge.add(new Recharge(9,10));
			recharge.add(new Recharge(10,10));
			
			setDuree(80);
			
		}
		if (idNiveau==8) {
			trou.add(new Trou(2,10,5));
			trou.add(new Trou(3,10,5));
		    trou.add(new Trou(4,10,10));
		    trou.add(new Trou(5,10,10));
		    trou.add(new Trou(6,10,15));
		    trou.add(new Trou(7,10,15));
		    trou.add(new Trou(8,10,20));
		    trou.add(new Trou(9,10,25));
		    trou.add(new Trou(10,10,25));
		    recharge.add(new Recharge(2,10));
			recharge.add(new Recharge(3,10));
			recharge.add(new Recharge(4,10));
			recharge.add(new Recharge(5,10));
			recharge.add(new Recharge(6,10));
			recharge.add(new Recharge(7,10));
			recharge.add(new Recharge(8,10));
			recharge.add(new Recharge(9,10));
			recharge.add(new Recharge(10,10));
			setDuree(70);
			
		}
		if (idNiveau==9) {
			trou.add(new Trou(2,10,5));
			trou.add(new Trou(3,10,5));
		    trou.add(new Trou(4,10,10));
		    trou.add(new Trou(5,10,10));
		    trou.add(new Trou(6,10,15));
		    trou.add(new Trou(7,10,20));
		    trou.add(new Trou(8,10,25));
		    trou.add(new Trou(9,10,30));
		    trou.add(new Trou(10,10,30));
		    recharge.add(new Recharge(2,10));
			recharge.add(new Recharge(3,10));
			recharge.add(new Recharge(4,10));
			recharge.add(new Recharge(5,10));
			recharge.add(new Recharge(6,10));
			recharge.add(new Recharge(7,10));
			recharge.add(new Recharge(8,10));
			recharge.add(new Recharge(9,10));
			recharge.add(new Recharge(10,10));
			setDuree(60);
			
		}
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




	public Tesla getTesla() {
		return tesla;
	}



	public void setTesla(Tesla tesla) {
		this.tesla = tesla;
	}
    
    

}
