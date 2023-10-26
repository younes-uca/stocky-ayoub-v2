package  ma.zs.stocky.dao.criteria.core.entree;


import ma.zs.stocky.dao.criteria.core.commun.ProduitCriteria;
import ma.zs.stocky.dao.criteria.core.effet.TauxTvaCriteria;

import ma.zs.stocky.zynerator.criteria.BaseCriteria;
import java.util.List;

public class EntreeProduitItemCriteria extends  BaseCriteria  {

    private String quantite;
    private String quantiteMin;
    private String quantiteMax;
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

    private ProduitCriteria produit ;
    private List<ProduitCriteria> produits ;
    private TauxTvaCriteria tauxTva ;
    private List<TauxTvaCriteria> tauxTvas ;
    private EntreeProduitCriteria entreeProduit ;
    private List<EntreeProduitCriteria> entreeProduits ;


    public EntreeProduitItemCriteria(){}

    public String getQuantite(){
        return this.quantite;
    }
    public void setQuantite(String quantite){
        this.quantite = quantite;
    }   
    public String getQuantiteMin(){
        return this.quantiteMin;
    }
    public void setQuantiteMin(String quantiteMin){
        this.quantiteMin = quantiteMin;
    }
    public String getQuantiteMax(){
        return this.quantiteMax;
    }
    public void setQuantiteMax(String quantiteMax){
        this.quantiteMax = quantiteMax;
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
      

    public ProduitCriteria getProduit(){
        return this.produit;
    }

    public void setProduit(ProduitCriteria produit){
        this.produit = produit;
    }
    public List<ProduitCriteria> getProduits(){
        return this.produits;
    }

    public void setProduits(List<ProduitCriteria> produits){
        this.produits = produits;
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
    public EntreeProduitCriteria getEntreeProduit(){
        return this.entreeProduit;
    }

    public void setEntreeProduit(EntreeProduitCriteria entreeProduit){
        this.entreeProduit = entreeProduit;
    }
    public List<EntreeProduitCriteria> getEntreeProduits(){
        return this.entreeProduits;
    }

    public void setEntreeProduits(List<EntreeProduitCriteria> entreeProduits){
        this.entreeProduits = entreeProduits;
    }
}
