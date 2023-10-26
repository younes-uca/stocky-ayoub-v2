package  ma.zs.stocky.dao.criteria.core.effet;



import ma.zs.stocky.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class PaiementCriteria extends  BaseCriteria  {

    private LocalDateTime dateEmission;
    private LocalDateTime dateEmissionFrom;
    private LocalDateTime dateEmissionTo;
    private String codeChequeEffet;
    private String codeChequeEffetLike;
    private LocalDateTime dateEcheance;
    private LocalDateTime dateEcheanceFrom;
    private LocalDateTime dateEcheanceTo;
    private LocalDateTime dateEncaissement;
    private LocalDateTime dateEncaissementFrom;
    private LocalDateTime dateEncaissementTo;
    private String montant;
    private String montantMin;
    private String montantMax;
    private String pathCheque;
    private String pathChequeLike;
    private String description;
    private String descriptionLike;

    private ProprietaireChequeEffetCriteria proprietaireChequeEffet ;
    private List<ProprietaireChequeEffetCriteria> proprietaireChequeEffets ;
    private CompteCriteria compte ;
    private List<CompteCriteria> comptes ;
    private TypePaiementCriteria typePaiement ;
    private List<TypePaiementCriteria> typePaiements ;
    private BeneficiaireCriteria beneficiaire ;
    private List<BeneficiaireCriteria> beneficiaires ;


    public PaiementCriteria(){}

    public LocalDateTime getDateEmission(){
        return this.dateEmission;
    }
    public void setDateEmission(LocalDateTime dateEmission){
        this.dateEmission = dateEmission;
    }
    public LocalDateTime getDateEmissionFrom(){
        return this.dateEmissionFrom;
    }
    public void setDateEmissionFrom(LocalDateTime dateEmissionFrom){
        this.dateEmissionFrom = dateEmissionFrom;
    }
    public LocalDateTime getDateEmissionTo(){
        return this.dateEmissionTo;
    }
    public void setDateEmissionTo(LocalDateTime dateEmissionTo){
        this.dateEmissionTo = dateEmissionTo;
    }
    public String getCodeChequeEffet(){
        return this.codeChequeEffet;
    }
    public void setCodeChequeEffet(String codeChequeEffet){
        this.codeChequeEffet = codeChequeEffet;
    }
    public String getCodeChequeEffetLike(){
        return this.codeChequeEffetLike;
    }
    public void setCodeChequeEffetLike(String codeChequeEffetLike){
        this.codeChequeEffetLike = codeChequeEffetLike;
    }

    public LocalDateTime getDateEcheance(){
        return this.dateEcheance;
    }
    public void setDateEcheance(LocalDateTime dateEcheance){
        this.dateEcheance = dateEcheance;
    }
    public LocalDateTime getDateEcheanceFrom(){
        return this.dateEcheanceFrom;
    }
    public void setDateEcheanceFrom(LocalDateTime dateEcheanceFrom){
        this.dateEcheanceFrom = dateEcheanceFrom;
    }
    public LocalDateTime getDateEcheanceTo(){
        return this.dateEcheanceTo;
    }
    public void setDateEcheanceTo(LocalDateTime dateEcheanceTo){
        this.dateEcheanceTo = dateEcheanceTo;
    }
    public LocalDateTime getDateEncaissement(){
        return this.dateEncaissement;
    }
    public void setDateEncaissement(LocalDateTime dateEncaissement){
        this.dateEncaissement = dateEncaissement;
    }
    public LocalDateTime getDateEncaissementFrom(){
        return this.dateEncaissementFrom;
    }
    public void setDateEncaissementFrom(LocalDateTime dateEncaissementFrom){
        this.dateEncaissementFrom = dateEncaissementFrom;
    }
    public LocalDateTime getDateEncaissementTo(){
        return this.dateEncaissementTo;
    }
    public void setDateEncaissementTo(LocalDateTime dateEncaissementTo){
        this.dateEncaissementTo = dateEncaissementTo;
    }
    public String getMontant(){
        return this.montant;
    }
    public void setMontant(String montant){
        this.montant = montant;
    }   
    public String getMontantMin(){
        return this.montantMin;
    }
    public void setMontantMin(String montantMin){
        this.montantMin = montantMin;
    }
    public String getMontantMax(){
        return this.montantMax;
    }
    public void setMontantMax(String montantMax){
        this.montantMax = montantMax;
    }
      
    public String getPathCheque(){
        return this.pathCheque;
    }
    public void setPathCheque(String pathCheque){
        this.pathCheque = pathCheque;
    }
    public String getPathChequeLike(){
        return this.pathChequeLike;
    }
    public void setPathChequeLike(String pathChequeLike){
        this.pathChequeLike = pathChequeLike;
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


    public ProprietaireChequeEffetCriteria getProprietaireChequeEffet(){
        return this.proprietaireChequeEffet;
    }

    public void setProprietaireChequeEffet(ProprietaireChequeEffetCriteria proprietaireChequeEffet){
        this.proprietaireChequeEffet = proprietaireChequeEffet;
    }
    public List<ProprietaireChequeEffetCriteria> getProprietaireChequeEffets(){
        return this.proprietaireChequeEffets;
    }

    public void setProprietaireChequeEffets(List<ProprietaireChequeEffetCriteria> proprietaireChequeEffets){
        this.proprietaireChequeEffets = proprietaireChequeEffets;
    }
    public CompteCriteria getCompte(){
        return this.compte;
    }

    public void setCompte(CompteCriteria compte){
        this.compte = compte;
    }
    public List<CompteCriteria> getComptes(){
        return this.comptes;
    }

    public void setComptes(List<CompteCriteria> comptes){
        this.comptes = comptes;
    }
    public TypePaiementCriteria getTypePaiement(){
        return this.typePaiement;
    }

    public void setTypePaiement(TypePaiementCriteria typePaiement){
        this.typePaiement = typePaiement;
    }
    public List<TypePaiementCriteria> getTypePaiements(){
        return this.typePaiements;
    }

    public void setTypePaiements(List<TypePaiementCriteria> typePaiements){
        this.typePaiements = typePaiements;
    }
    public BeneficiaireCriteria getBeneficiaire(){
        return this.beneficiaire;
    }

    public void setBeneficiaire(BeneficiaireCriteria beneficiaire){
        this.beneficiaire = beneficiaire;
    }
    public List<BeneficiaireCriteria> getBeneficiaires(){
        return this.beneficiaires;
    }

    public void setBeneficiaires(List<BeneficiaireCriteria> beneficiaires){
        this.beneficiaires = beneficiaires;
    }
}
