package  ma.zs.stocky.ws.dto.sortie;

import ma.zs.stocky.zynerator.audit.Log;
import ma.zs.stocky.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


import ma.zs.stocky.ws.dto.commun.ProduitDto;
import ma.zs.stocky.ws.dto.effet.TauxTvaDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class SortieProduitItemDto  extends AuditBaseDto {

    private BigDecimal quantite  ;
    private BigDecimal prix  ;
    private BigDecimal remise  ;
    private BigDecimal prixUnitaireTtc  ;
    private BigDecimal prixUht  ;
    private BigDecimal montantHt  ;
    private BigDecimal montantTtc  ;

    private ProduitDto produit ;
    private TauxTvaDto tauxTva ;
    private SortieProduitDto sortieProduit ;



    public SortieProduitItemDto(){
        super();
    }



    @Log
    public BigDecimal getQuantite(){
        return this.quantite;
    }
    public void setQuantite(BigDecimal quantite){
        this.quantite = quantite;
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


    public ProduitDto getProduit(){
        return this.produit;
    }

    public void setProduit(ProduitDto produit){
        this.produit = produit;
    }
    public TauxTvaDto getTauxTva(){
        return this.tauxTva;
    }

    public void setTauxTva(TauxTvaDto tauxTva){
        this.tauxTva = tauxTva;
    }
    public SortieProduitDto getSortieProduit(){
        return this.sortieProduit;
    }

    public void setSortieProduit(SortieProduitDto sortieProduit){
        this.sortieProduit = sortieProduit;
    }






}
