package ma.zs.stocky.bean.core.effet;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;




import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.stocky.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "paiement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="paiement_seq",sequenceName="paiement_seq",allocationSize=1, initialValue = 1)
public class Paiement   extends AuditBusinessObject     {

    private Long id;

    private LocalDateTime dateEmission ;
    @Column(length = 500)
    private String codeChequeEffet;
    private LocalDateTime dateEcheance ;
    private LocalDateTime dateEncaissement ;
    private BigDecimal montant = BigDecimal.ZERO;
    @Column(length = 500)
    private String pathCheque;
    @Column(length = 500)
    private String description;

    private ProprietaireChequeEffet proprietaireChequeEffet ;
    private Compte compte ;
    private TypePaiement typePaiement ;
    private Beneficiaire beneficiaire ;


    public Paiement(){
        super();
    }

    public Paiement(Long id,String codeChequeEffet){
        this.id = id;
        this.codeChequeEffet = codeChequeEffet ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="paiement_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public LocalDateTime getDateEmission(){
        return this.dateEmission;
    }
    public void setDateEmission(LocalDateTime dateEmission){
        this.dateEmission = dateEmission;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public ProprietaireChequeEffet getProprietaireChequeEffet(){
        return this.proprietaireChequeEffet;
    }
    public void setProprietaireChequeEffet(ProprietaireChequeEffet proprietaireChequeEffet){
        this.proprietaireChequeEffet = proprietaireChequeEffet;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Compte getCompte(){
        return this.compte;
    }
    public void setCompte(Compte compte){
        this.compte = compte;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TypePaiement getTypePaiement(){
        return this.typePaiement;
    }
    public void setTypePaiement(TypePaiement typePaiement){
        this.typePaiement = typePaiement;
    }
    public String getCodeChequeEffet(){
        return this.codeChequeEffet;
    }
    public void setCodeChequeEffet(String codeChequeEffet){
        this.codeChequeEffet = codeChequeEffet;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Beneficiaire getBeneficiaire(){
        return this.beneficiaire;
    }
    public void setBeneficiaire(Beneficiaire beneficiaire){
        this.beneficiaire = beneficiaire;
    }
    public LocalDateTime getDateEcheance(){
        return this.dateEcheance;
    }
    public void setDateEcheance(LocalDateTime dateEcheance){
        this.dateEcheance = dateEcheance;
    }
    public LocalDateTime getDateEncaissement(){
        return this.dateEncaissement;
    }
    public void setDateEncaissement(LocalDateTime dateEncaissement){
        this.dateEncaissement = dateEncaissement;
    }
    public BigDecimal getMontant(){
        return this.montant;
    }
    public void setMontant(BigDecimal montant){
        this.montant = montant;
    }
    public String getPathCheque(){
        return this.pathCheque;
    }
    public void setPathCheque(String pathCheque){
        this.pathCheque = pathCheque;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    @Transient
    public String getLabel() {
        label = codeChequeEffet;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paiement paiement = (Paiement) o;
        return id != null && id.equals(paiement.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

