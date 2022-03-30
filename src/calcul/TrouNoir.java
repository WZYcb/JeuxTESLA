package calcul;
public class TrouNoir {
		//variable
		private int idTrouNoir;
		private String nom;
		private int diametre;
		private int diamInfluence;
		private Position positionTrouNoir;
		private float coeffGravite;
		
		//constructeur
		public TrouNoir(int idTrouNoir,String nom,int diametre,int diamInfluence,
				Position positionTrouNoir,float coeffGravite) {
			   this.idTrouNoir=idTrouNoir;
			   this.coeffGravite=coeffGravite;
			   this.diametre=diametre;
			   this.diamInfluence=diamInfluence;
			   this.nom=nom;
			   this.positionTrouNoir=positionTrouNoir;
			   
		}
		public int getIdTrouNoir() {
			return idTrouNoir;
		}
		
	    public String getNom() {
	    	return nom;
	    }
	    
	    public int getDiametre() {
	    	return diametre;
	    	
	    }
	    public int getDiamInfluence() {
	    	return diamInfluence;
	    }
	    public Position getPositionTrouNoir() {
	    	return positionTrouNoir;
	    }
	    public float getCoeffGravite() {
	    	return coeffGravite;
	    }
	    public void setIdTrouNoir(int idTrouNoir) {
	    	this.idTrouNoir=idTrouNoir;
	    	
	    }
	    public void setNom(String nom) {
	    	this.nom=nom;
	    }
	    public void setDiametre(int diametre) {
	    	this.diametre=diametre;
	    }
	    public void setDiamInfluence(int diamInfluence) {
	    	this.diamInfluence=diamInfluence;
	    }
	    public void setPositionTrouNoir(Position positionTrouNoir) {
	        this.positionTrouNoir=positionTrouNoir;
	}
	    public void setCoeffGravite(float coeffGravite) {
	    	this.coeffGravite=coeffGravite;
	    }
	 
	    
	    
	}
