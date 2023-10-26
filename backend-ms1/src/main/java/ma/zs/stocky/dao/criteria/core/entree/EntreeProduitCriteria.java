package  ma.zs.stocky.dao.criteria.core.entree;


import ma.zs.stocky.dao.criteria.core.commun.CollaborateurCriteria;
import ma.zs.stocky.dao.criteria.core.commun.FournisseurCriteria;
import ma.zs.stocky.dao.criteria.core.effet.TauxTvaCriteria;
import ma.zs.stocky.dao.criteria.core.commun.DepotCriteria;

import ma.zs.stocky.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class EntreeProduitCriteria extends  BaseCriteria  {

    private String reference;
    private String referenceLike;
    private LocalDateTime dateEntreeProduit;
    private LocalDateTime dateEntreeProduitFrom;
    private LocalDateTime dateEntreeProduitTo;
    private String totalHT;
    private String totalHTMin;
    private String totalHTMax;
    private String totalTVA;
    private String totalTVAMin;
    private String totalTVAMax;
    private String totalHTTC;
    private String totalHTTCMin;
    private String totalHTTCMax;
    private String description;
    private String descriptionLike;

    private TauxTvaCriteria tauxTva ;
    private List<TauxTvaCriteria> tauxTvas ;
    private FournisseurCriteria fournisseur ;
    private List<FournisseurCriteria> fournisseurs ;
    private DepotCriteria depot ;
    private List<DepotCriteria> depots ;
    private CollaborateurCriteria collaborateur ;
    private List<CollaborateurCriteria> collaborateurs ;


    public EntreeProduitCriteria(){}

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

    public LocalDateTime getDateEntreeProduit(){
        return this.dateEntreeProduit;
    }
    public void setDateEntreeProduit(LocalDateTime dateEntreeProduit){
        this.dateEntreeProduit = dateEntreeProduit;
    }
    public LocalDateTime getDateEntreeProduitFrom(){
        return this.dateEntreeProduitFrom;
    }
    public void setDateEntreeProduitFrom(LocalDateTime dateEntreeProduitFrom){
        this.dateEntreeProduitFrom = dateEntreeProduitFrom;
    }
    public LocalDateTime getDateEntreeProduitTo(){
        return this.dateEntreeProduitTo;
    }
    public void setDateEntreeProduitTo(LocalDateTime dateEntreeProduitTo){
        this.dateEntreeProduitTo = dateEntreeProduitTo;
    }
    public String getTotalHT(){
        return this.totalHT;
    }
    public void setTotalHT(String totalHT){
        this.totalHT = totalHT;
    }   
    public String getTotalHTMin(){
        return this.totalHTMin;
    }
    public void setTotalHTMin(String totalHTMin){
        this.totalHTMin = totalHTMin;
    }
    public String getTotalHTMax(){
        return this.totalHTMax;
    }
    public void setTotalHTMax(String totalHTMax){
        this.totalHTMax = totalHTMax;
    }
      
    public String getTotalTVA(){
        return this.totalTVA;
    }
    public void setTotalTVA(String totalTVA){
        this.totalTVA = totalTVA;
    }   
    public String getTotalTVAMin(){
        return this.totalTVAMin;
    }
    public void setTotalTVAMin(String totalTVAMin){
        this.totalTVAMin = totalTVAMin;
    }
    public String getTotalTVAMax(){
        return this.totalTVAMax;
    }
    public void setTotalTVAMax(String totalTVAMax){
        this.totalTVAMax = totalTVAMax;
    }
      
    public String getTotalHTTC(){
        return this.totalHTTC;
    }
    public void setTotalHTTC(String totalHTTC){
        this.totalHTTC = totalHTTC;
    }   
    public String getTotalHTTCMin(){
        return this.totalHTTCMin;
    }
    public void setTotalHTTCMin(String totalHTTCMin){
        this.totalHTTCMin = totalHTTCMin;
    }
    public String getTotalHTTCMax(){
        return this.totalHTTCMax;
    }
    public void setTotalHTTCMax(String totalHTTCMax){
        this.totalHTTCMax = totalHTTCMax;
    }
      
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
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
    public FournisseurCriteria getFournisseur(){
        return this.fournisseur;
    }

    public void setFournisseur(FournisseurCriteria fournisseur){
        this.fournisseur = fournisseur;
    }
    public List<FournisseurCriteria> getFournisseurs(){
        return this.fournisseurs;
    }

    public void setFournisseurs(List<FournisseurCriteria> fournisseurs){
        this.fournisseurs = fournisseurs;
    }
    public DepotCriteria getDepot(){
        return this.depot;
    }

    public void setDepot(DepotCriteria depot){
        this.depot = depot;
    }
    public List<DepotCriteria> getDepots(){
        return this.depots;
    }

    public void setDepots(List<DepotCriteria> depots){
        this.depots = depots;
    }
    public CollaborateurCriteria getCollaborateur(){
        return this.collaborateur;
    }

    public void setCollaborateur(CollaborateurCriteria collaborateur){
        this.collaborateur = collaborateur;
    }
    public List<CollaborateurCriteria> getCollaborateurs(){
        return this.collaborateurs;
    }

    public void setCollaborateurs(List<CollaborateurCriteria> collaborateurs){
        this.collaborateurs = collaborateurs;
    }
}
