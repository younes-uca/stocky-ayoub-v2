package  ma.zs.stocky.ws.dto.commun;

import ma.zs.stocky.zynerator.audit.Log;
import ma.zs.stocky.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


import ma.zs.stocky.ws.dto.effet.TauxTvaDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProduitDto  extends AuditBaseDto {

    private String reference  ;
    private String libelle  ;
    private BigDecimal prixAchatMoyen  ;
    private BigDecimal prixVente  ;
    private BigDecimal prix  ;
    private BigDecimal remise  ;
    private BigDecimal prixUnitaireTtc  ;
    private BigDecimal prixUht  ;
    private BigDecimal montantHt  ;
    private BigDecimal montantTtc  ;

    private CategorieProduitDto categorieProduit ;
    private MarqueDto marque ;
    private TauxTvaDto tauxTva ;



    public ProduitDto(){
        super();
    }



    @Log
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public BigDecimal getPrixAchatMoyen(){
        return this.prixAchatMoyen;
    }
    public void setPrixAchatMoyen(BigDecimal prixAchatMoyen){
        this.prixAchatMoyen = prixAchatMoyen;
    }

    @Log
    public BigDecimal getPrixVente(){
        return this.prixVente;
    }
    public void setPrixVente(BigDecimal prixVente){
        this.prixVente = prixVente;
    }

    @Log
    public BigDecimal getPrix(){
        return this.prix;
    }
    public void setPrix(BigDecimal prix){
        this.prix = prix;
    }

    @Log
    public BigDecimal getRemise(){
        return this.remise;
    }
    public void setRemise(BigDecimal remise){
        this.remise = remise;
    }

    @Log
    public BigDecimal getPrixUnitaireTtc(){
        return this.prixUnitaireTtc;
    }
    public void setPrixUnitaireTtc(BigDecimal prixUnitaireTtc){
        this.prixUnitaireTtc = prixUnitaireTtc;
    }

    @Log
    public BigDecimal getPrixUht(){
        return this.prixUht;
    }
    public void setPrixUht(BigDecimal prixUht){
        this.prixUht = prixUht;
    }

    @Log
    public BigDecimal getMontantHt(){
        return this.montantHt;
    }
    public void setMontantHt(BigDecimal montantHt){
        this.montantHt = montantHt;
    }

    @Log
    public BigDecimal getMontantTtc(){
        return this.montantTtc;
    }
    public void setMontantTtc(BigDecimal montantTtc){
        this.montantTtc = montantTtc;
    }


    public CategorieProduitDto getCategorieProduit(){
        return this.categorieProduit;
    }

    public void setCategorieProduit(CategorieProduitDto categorieProduit){
        this.categorieProduit = categorieProduit;
    }
    public MarqueDto getMarque(){
        return this.marque;
    }

    public void setMarque(MarqueDto marque){
        this.marque = marque;
    }
    public TauxTvaDto getTauxTva(){
        return this.tauxTva;
    }

    public void setTauxTva(TauxTvaDto tauxTva){
        this.tauxTva = tauxTva;
    }






}
