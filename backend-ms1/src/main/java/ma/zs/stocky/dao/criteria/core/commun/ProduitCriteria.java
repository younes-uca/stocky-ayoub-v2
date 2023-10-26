package  ma.zs.stocky.dao.criteria.core.commun;


import ma.zs.stocky.dao.criteria.core.effet.TauxTvaCriteria;

import ma.zs.stocky.zynerator.criteria.BaseCriteria;
import java.util.List;

public class ProduitCriteria extends  BaseCriteria  {

    private String reference;
    private String referenceLike;
    private String libelle;
    private String libelleLike;
    private String prixAchatMoyen;
    private String prixAchatMoyenMin;
    private String prixAchatMoyenMax;
    private String prixVente;
    private String prixVenteMin;
    private String prixVenteMax;
    private String prix;
    private String prixMin;
    private String prixMax;
    private String remise;
    private String remiseMin;
    private String remiseMax;
    private String prixUnitaireTtc;
    private String prixUnitaireTtcMin;
    private String prixUnitaireTtcMax;
    private String prixUht;
    private String prixUhtMin;
    private String prixUhtMax;
    private String montantHt;
    private String montantHtMin;
    private String montantHtMax;
    private String montantTtc;
    private String montantTtcMin;
    private String montantTtcMax;

    private CategorieProduitCriteria categorieProduit ;
    private List<CategorieProduitCriteria> categorieProduits ;
    private MarqueCriteria marque ;
    private List<MarqueCriteria> marques ;
    private TauxTvaCriteria tauxTva ;
    private List<TauxTvaCriteria> tauxTvas ;


    public ProduitCriteria(){}

    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }
    public String getReferenceLike(){
        return this.referenceLike;
    }
    public void setReferenceLike(String referenceLike){
        this.referenceLike = referenceLike;
    }

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public String getPrixAchatMoyen(){
        return this.prixAchatMoyen;
    }
    public void setPrixAchatMoyen(String prixAchatMoyen){
        this.prixAchatMoyen = prixAchatMoyen;
    }   
    public String getPrixAchatMoyenMin(){
        return this.prixAchatMoyenMin;
    }
    public void setPrixAchatMoyenMin(String prixAchatMoyenMin){
        this.prixAchatMoyenMin = prixAchatMoyenMin;
    }
    public String getPrixAchatMoyenMax(){
        return this.prixAchatMoyenMax;
    }
    public void setPrixAchatMoyenMax(String prixAchatMoyenMax){
        this.prixAchatMoyenMax = prixAchatMoyenMax;
    }
      
    public String getPrixVente(){
        return this.prixVente;
    }
    public void setPrixVente(String prixVente){
        this.prixVente = prixVente;
    }   
    public String getPrixVenteMin(){
        return this.prixVenteMin;
    }
    public void setPrixVenteMin(String prixVenteMin){
        this.prixVenteMin = prixVenteMin;
    }
    public String getPrixVenteMax(){
        return this.prixVenteMax;
    }
    public void setPrixVenteMax(String prixVenteMax){
        this.prixVenteMax = prixVenteMax;
    }
      
    public String getPrix(){
        return this.prix;
    }
    public void setPrix(String prix){
        this.prix = prix;
    }   
    public String getPrixMin(){
        return this.prixMin;
    }
    public void setPrixMin(String prixMin){
        this.prixMin = prixMin;
    }
    public String getPrixMax(){
        return this.prixMax;
    }
    public void setPrixMax(String prixMax){
        this.prixMax = prixMax;
    }
      
    public String getRemise(){
        return this.remise;
    }
    public void setRemise(String remise){
        this.remise = remise;
    }   
    public String getRemiseMin(){
        return this.remiseMin;
    }
    public void setRemiseMin(String remiseMin){
        this.remiseMin = remiseMin;
    }
    public String getRemiseMax(){
        return this.remiseMax;
    }
    public void setRemiseMax(String remiseMax){
        this.remiseMax = remiseMax;
    }
      
    public String getPrixUnitaireTtc(){
        return this.prixUnitaireTtc;
    }
    public void setPrixUnitaireTtc(String prixUnitaireTtc){
        this.prixUnitaireTtc = prixUnitaireTtc;
    }   
    public String getPrixUnitaireTtcMin(){
        return this.prixUnitaireTtcMin;
    }
    public void setPrixUnitaireTtcMin(String prixUnitaireTtcMin){
        this.prixUnitaireTtcMin = prixUnitaireTtcMin;
    }
    public String getPrixUnitaireTtcMax(){
        return this.prixUnitaireTtcMax;
    }
    public void setPrixUnitaireTtcMax(String prixUnitaireTtcMax){
        this.prixUnitaireTtcMax = prixUnitaireTtcMax;
    }
      
    public String getPrixUht(){
        return this.prixUht;
    }
    public void setPrixUht(String prixUht){
        this.prixUht = prixUht;
    }   
    public String getPrixUhtMin(){
        return this.prixUhtMin;
    }
    public void setPrixUhtMin(String prixUhtMin){
        this.prixUhtMin = prixUhtMin;
    }
    public String getPrixUhtMax(){
        return this.prixUhtMax;
    }
    public void setPrixUhtMax(String prixUhtMax){
        this.prixUhtMax = prixUhtMax;
    }
      
    public String getMontantHt(){
        return this.montantHt;
    }
    public void setMontantHt(String montantHt){
        this.montantHt = montantHt;
    }   
    public String getMontantHtMin(){
        return this.montantHtMin;
    }
    public void setMontantHtMin(String montantHtMin){
        this.montantHtMin = montantHtMin;
    }
    public String getMontantHtMax(){
        return this.montantHtMax;
    }
    public void setMontantHtMax(String montantHtMax){
        this.montantHtMax = montantHtMax;
    }
      
    public String getMontantTtc(){
        return this.montantTtc;
    }
    public void setMontantTtc(String montantTtc){
        this.montantTtc = montantTtc;
    }   
    public String getMontantTtcMin(){
        return this.montantTtcMin;
    }
    public void setMontantTtcMin(String montantTtcMin){
        this.montantTtcMin = montantTtcMin;
    }
    public String getMontantTtcMax(){
        return this.montantTtcMax;
    }
    public void setMontantTtcMax(String montantTtcMax){
        this.montantTtcMax = montantTtcMax;
    }
      

    public CategorieProduitCriteria getCategorieProduit(){
        return this.categorieProduit;
    }

    public void setCategorieProduit(CategorieProduitCriteria categorieProduit){
        this.categorieProduit = categorieProduit;
    }
    public List<CategorieProduitCriteria> getCategorieProduits(){
        return this.categorieProduits;
    }

    public void setCategorieProduits(List<CategorieProduitCriteria> categorieProduits){
        this.categorieProduits = categorieProduits;
    }
    public MarqueCriteria getMarque(){
        return this.marque;
    }

    public void setMarque(MarqueCriteria marque){
        this.marque = marque;
    }
    public List<MarqueCriteria> getMarques(){
        return this.marques;
    }

    public void setMarques(List<MarqueCriteria> marques){
        this.marques = marques;
    }
    public TauxTvaCriteria getTauxTva(){
        return this.tauxTva;
    }

    public void setTauxTva(TauxTvaCriteria tauxTva){
        this.tauxTva = tauxTva;
    }
    public List<TauxTvaCriteria> getTauxTvas(){
        return this.tauxTvas;
    }

    public void setTauxTvas(List<TauxTvaCriteria> tauxTvas){
        this.tauxTvas = tauxTvas;
    }
}
