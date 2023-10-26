package  ma.zs.stocky.ws.dto.sortie;

import ma.zs.stocky.zynerator.audit.Log;
import ma.zs.stocky.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;


import ma.zs.stocky.ws.dto.commun.ProduitDto;
import ma.zs.stocky.ws.dto.effet.TauxTvaDto;
import ma.zs.stocky.ws.dto.commun.CollaborateurDto;
import ma.zs.stocky.ws.dto.commun.DepotDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class SortieProduitDto  extends AuditBaseDto {

    private String reference  ;
    private String dateSortieProduit ;
    private BigDecimal total  ;
    private BigDecimal totalHT  ;
    private BigDecimal totalTVA  ;
    private BigDecimal totalHTTC  ;
    private String description  ;

    private TauxTvaDto tauxTva ;
    private DepotDto depot ;
    private CollaborateurDto collaborateur ;

    private List<SortieProduitItemDto> sortieProduitItems ;


    public SortieProduitDto(){
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateSortieProduit(){
        return this.dateSortieProduit;
    }
    public void setDateSortieProduit(String dateSortieProduit){
        this.dateSortieProduit = dateSortieProduit;
    }

    @Log
    public BigDecimal getTotal(){
        return this.total;
    }
    public void setTotal(BigDecimal total){
        this.total = total;
    }

    @Log
    public BigDecimal getTotalHT(){
        return this.totalHT;
    }
    public void setTotalHT(BigDecimal totalHT){
        this.totalHT = totalHT;
    }

    @Log
    public BigDecimal getTotalTVA(){
        return this.totalTVA;
    }
    public void setTotalTVA(BigDecimal totalTVA){
        this.totalTVA = totalTVA;
    }

    @Log
    public BigDecimal getTotalHTTC(){
        return this.totalHTTC;
    }
    public void setTotalHTTC(BigDecimal totalHTTC){
        this.totalHTTC = totalHTTC;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public TauxTvaDto getTauxTva(){
        return this.tauxTva;
    }

    public void setTauxTva(TauxTvaDto tauxTva){
        this.tauxTva = tauxTva;
    }
    public DepotDto getDepot(){
        return this.depot;
    }

    public void setDepot(DepotDto depot){
        this.depot = depot;
    }
    public CollaborateurDto getCollaborateur(){
        return this.collaborateur;
    }

    public void setCollaborateur(CollaborateurDto collaborateur){
        this.collaborateur = collaborateur;
    }



    public List<SortieProduitItemDto> getSortieProduitItems(){
        return this.sortieProduitItems;
    }

    public void setSortieProduitItems(List<SortieProduitItemDto> sortieProduitItems){
        this.sortieProduitItems = sortieProduitItems;
    }



}
