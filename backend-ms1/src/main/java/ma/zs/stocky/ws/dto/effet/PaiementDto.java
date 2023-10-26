package  ma.zs.stocky.ws.dto.effet;

import ma.zs.stocky.zynerator.audit.Log;
import ma.zs.stocky.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;




@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaiementDto  extends AuditBaseDto {

    private String dateEmission ;
    private String codeChequeEffet  ;
    private String dateEcheance ;
    private String dateEncaissement ;
    private BigDecimal montant  ;
    private String pathCheque  ;
    private String description  ;

    private ProprietaireChequeEffetDto proprietaireChequeEffet ;
    private CompteDto compte ;
    private TypePaiementDto typePaiement ;
    private BeneficiaireDto beneficiaire ;



    public PaiementDto(){
        super();
    }



    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateEmission(){
        return this.dateEmission;
    }
    public void setDateEmission(String dateEmission){
        this.dateEmission = dateEmission;
    }

    @Log
    public String getCodeChequeEffet(){
        return this.codeChequeEffet;
    }
    public void setCodeChequeEffet(String codeChequeEffet){
        this.codeChequeEffet = codeChequeEffet;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateEcheance(){
        return this.dateEcheance;
    }
    public void setDateEcheance(String dateEcheance){
        this.dateEcheance = dateEcheance;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateEncaissement(){
        return this.dateEncaissement;
    }
    public void setDateEncaissement(String dateEncaissement){
        this.dateEncaissement = dateEncaissement;
    }

    @Log
    public BigDecimal getMontant(){
        return this.montant;
    }
    public void setMontant(BigDecimal montant){
        this.montant = montant;
    }

    @Log
    public String getPathCheque(){
        return this.pathCheque;
    }
    public void setPathCheque(String pathCheque){
        this.pathCheque = pathCheque;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public ProprietaireChequeEffetDto getProprietaireChequeEffet(){
        return this.proprietaireChequeEffet;
    }

    public void setProprietaireChequeEffet(ProprietaireChequeEffetDto proprietaireChequeEffet){
        this.proprietaireChequeEffet = proprietaireChequeEffet;
    }
    public CompteDto getCompte(){
        return this.compte;
    }

    public void setCompte(CompteDto compte){
        this.compte = compte;
    }
    public TypePaiementDto getTypePaiement(){
        return this.typePaiement;
    }

    public void setTypePaiement(TypePaiementDto typePaiement){
        this.typePaiement = typePaiement;
    }
    public BeneficiaireDto getBeneficiaire(){
        return this.beneficiaire;
    }

    public void setBeneficiaire(BeneficiaireDto beneficiaire){
        this.beneficiaire = beneficiaire;
    }






}
