package  ma.zs.stocky.dao.specification.core.effet;

import ma.zs.stocky.zynerator.specification.AbstractSpecification;
import ma.zs.stocky.dao.criteria.core.effet.PaiementCriteria;
import ma.zs.stocky.bean.core.effet.Paiement;


public class PaiementSpecification extends  AbstractSpecification<PaiementCriteria, Paiement>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("dateEmission", criteria.getDateEmission(), criteria.getDateEmissionFrom(), criteria.getDateEmissionTo());
        addPredicate("codeChequeEffet", criteria.getCodeChequeEffet(),criteria.getCodeChequeEffetLike());
        addPredicate("dateEcheance", criteria.getDateEcheance(), criteria.getDateEcheanceFrom(), criteria.getDateEcheanceTo());
        addPredicate("dateEncaissement", criteria.getDateEncaissement(), criteria.getDateEncaissementFrom(), criteria.getDateEncaissementTo());
        addPredicateBigDecimal("montant", criteria.getMontant(), criteria.getMontantMin(), criteria.getMontantMax());
        addPredicate("pathCheque", criteria.getPathCheque(),criteria.getPathChequeLike());
        addPredicateFk("proprietaireChequeEffet","id", criteria.getProprietaireChequeEffet()==null?null:criteria.getProprietaireChequeEffet().getId());
        addPredicateFk("proprietaireChequeEffet","id", criteria.getProprietaireChequeEffets());
        addPredicateFk("compte","id", criteria.getCompte()==null?null:criteria.getCompte().getId());
        addPredicateFk("compte","id", criteria.getComptes());
        addPredicateFk("typePaiement","id", criteria.getTypePaiement()==null?null:criteria.getTypePaiement().getId());
        addPredicateFk("typePaiement","id", criteria.getTypePaiements());
        addPredicateFk("typePaiement","code", criteria.getTypePaiement()==null?null:criteria.getTypePaiement().getCode());
        addPredicateFk("beneficiaire","id", criteria.getBeneficiaire()==null?null:criteria.getBeneficiaire().getId());
        addPredicateFk("beneficiaire","id", criteria.getBeneficiaires());
        addPredicateFk("beneficiaire","cin", criteria.getBeneficiaire()==null?null:criteria.getBeneficiaire().getCin());
    }

    public PaiementSpecification(PaiementCriteria criteria) {
        super(criteria);
    }

    public PaiementSpecification(PaiementCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
