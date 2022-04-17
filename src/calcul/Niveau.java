package calcul;

import java.util.LinkedList;
import java.util.Random;


public class Niveau {
	private int idNiveau;
	private Position tailleNiveau;
	private double limiteTemps; //en minutes
	private String nom;
	private Tesla tesla;
	private Position pointDepart;
	private Position pointArrivee;
	private LinkedList<Trou> listeTrou = new LinkedList<Trou>();
	private LinkedList<Recharge> listeRecharge = new LinkedList<Recharge>();
	private LinkedList<Asteroide> listeAsteroide = new LinkedList<Asteroide>();
	
	public Niveau(int idNiv) {
		int i;
		idNiveau = idNiv;
		tailleNiveau= new Position(1920,1080);
		limiteTemps = 2;//minutes
		Random ran = new Random();
		pointDepart= new Position(0,0);
		pointArrivee= new Position(tailleNiveau.getX()-100,tailleNiveau.getY()-100) ;
		tesla=new Tesla(1, pointDepart);
		if (idNiveau==1) {
			for(i=1;i<2;i++) {
				listeTrou.add(new Trou(i,1000,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
			}
			for(i=0;i<3;i++) {
				listeRecharge.add(new Recharge(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
			}
			for(i=0;i<1;i++) {
				listeAsteroide.add(new Asteroide(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY())),new Vitesse(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
			}
		} else {
			if (idNiveau==2) {
				for(i=0;i<3;i++) {
					listeTrou.add(new Trou(i,100,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
				}
				for(i=0;i<3;i++) {
					listeRecharge.add(new Recharge(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
				}
				for(i=0;i<2;i++) {
					listeAsteroide.add(new Asteroide(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY())),new Vitesse(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
				}
				
			} else {
				if (idNiveau==3) {
					for(i=0;i<3;i++) {
						listeTrou.add(new Trou(i,1000,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
					}
					for(i=0;i<3;i++) {
						listeRecharge.add(new Recharge(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
					}
					for(i=0;i<2;i++) {
						listeAsteroide.add(new Asteroide(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY())),new Vitesse(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
					}
				} else {
					if (idNiveau==4) {
						for(i=0;i<4;i++) {
							listeTrou.add(new Trou(i,1000,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
						}
						for(i=0;i<3;i++) {
							listeRecharge.add(new Recharge(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
						}
						for(i=0;i<2;i++) {
							listeAsteroide.add(new Asteroide(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY())),new Vitesse(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
						}
					} else {
						if (idNiveau==5) {
							for(i=0;i<5;i++) {
								listeTrou.add(new Trou(i,1000,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
							}
							for(i=0;i<2;i++) {
								listeRecharge.add(new Recharge(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
							}
							for(i=0;i<2;i++) {
								listeAsteroide.add(new Asteroide(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY())),new Vitesse(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
							}
						} else {
							if (idNiveau==6) {
								for(i=0;i<6;i++) {
									listeTrou.add(new Trou(i,1000,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
								}
								for(i=0;i<2;i++) {
									listeRecharge.add(new Recharge(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
								}
								for(i=0;i<3;i++) {
									listeAsteroide.add(new Asteroide(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY())),new Vitesse(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
								}
							} else {
								if (idNiveau==7) {
									for(i=0;i<7;i++) {
										listeTrou.add(new Trou(i,1000,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
									}
									for(i=0;i<2;i++) {
										listeRecharge.add(new Recharge(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
									}
									for(i=0;i<3;i++) {
										listeAsteroide.add(new Asteroide(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY())),new Vitesse(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
									}
								} else {
									if (idNiveau==8) {
										for(i=0;i<8;i++) {
											listeTrou.add(new Trou(i,1000,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
										}
										for(i=0;i<2;i++) {
											listeRecharge.add(new Recharge(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
										}
										for(i=0;i<4;i++) {
											listeAsteroide.add(new Asteroide(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY())),new Vitesse(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
										}
									} else {
										if (idNiveau==9) {
											for(i=0;i<9;i++) {
												listeTrou.add(new Trou(i,1000,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
											}
											for(i=0;i<1;i++) {
												listeRecharge.add(new Recharge(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
											}
											for(i=0;i<5;i++) {
												listeAsteroide.add(new Asteroide(i,new Position(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY())),new Vitesse(ran.nextInt(tailleNiveau.getX()),ran.nextInt(tailleNiveau.getY()))));
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
	}
	
	public double getLimiteTemps() {
		return limiteTemps;
	}

	public void setLimiteTemps(double limiteTemps) {
		this.limiteTemps = limiteTemps;
	}

	public LinkedList<Asteroide> getListeAsteroide() {
		return listeAsteroide;
	}

	public void setListeAsteroide(LinkedList<Asteroide> listeAsteroide) {
		this.listeAsteroide = listeAsteroide;
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

	public Position getTailleNiveau() {
		return tailleNiveau;
	}

	public void setTailleNiveau(Position tailleNiveau) {
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
