package calcul;

import java.util.LinkedList;
import java.util.Random;


public class Niveau {
	private int idNiveau;
	private int tailleNiveau;
	private String nom;
	private Tesla tesla;
	private Position pointDepart;
	private Position pointArrivee;
	private LinkedList<Trou> listeTrou = new LinkedList<Trou>();
	private LinkedList<Recharge> listeRecharge = new LinkedList<Recharge>();
	
	
	public Niveau(int idNiv) {
		int i;
		idNiveau = idNiv;
		tailleNiveau=1000;
		Random ran = new Random();
		pointDepart= new Position(0,0);
		pointArrivee= new Position(tailleNiveau,tailleNiveau);
		tesla=new Tesla(1, pointDepart);
		if (idNiveau==1) {
			for(i=0;i<3;i++) {
				listeTrou.add(new Trou(i,100,new Position(ran.nextInt(tailleNiveau),ran.nextInt(tailleNiveau))));
			}
			for(i=0;i<1;i++) {
				listeRecharge.add(new Recharge(i,new Position(ran.nextInt(tailleNiveau),ran.nextInt(tailleNiveau))));
			}
		} else {
			if (idNiveau==2) {
				
			} else {
				if (idNiveau==3) {
					
				} else {
					if (idNiveau==4) {
						
					} else {
						if (idNiveau==5) {
							
						} else {
							if (idNiveau==6) {
								
							} else {
								if (idNiveau==7) {
									
								} else {
									if (idNiveau==8) {
										
									} else {
										if (idNiveau==9) {
											
										}
									}
								}
							}
						}
					}
				}
			}
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

	public int getTailleNiveau() {
		return tailleNiveau;
	}

	public void setTailleNiveau(int tailleNiveau) {
		this.tailleNiveau = tailleNiveau;
	}

	public LinkedList<Trou> getListeTrou() {
		return listeTrou;
	}



	public void setListeTrou(LinkedList<Trou> listeTrou) {
		this.listeTrou = listeTrou;
	}



	public LinkedList<Recharge> getListeRecharge() {
		return listeRecharge;
	}


	public void setListeRecharge(LinkedList<Recharge> listeRecharge) {
		this.listeRecharge = listeRecharge;
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

	public Tesla getTesla() {
		return tesla;
	}



	public void setTesla(Tesla tesla) {
		this.tesla = tesla;
	}
    
    

}
