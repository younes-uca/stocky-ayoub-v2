package  ma.zs.stocky.dao.specification.core.effet;

import ma.zs.stocky.zynerator.specification.AbstractSpecification;
import ma.zs.stocky.dao.criteria.core.effet.BeneficiaireCriteria;
import ma.zs.stocky.bean.core.effet.Beneficiaire;


public class BeneficiaireSpecification extends  AbstractSpecification<BeneficiaireCriteria, Beneficiaire>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("cin", criteria.getCin(),criteria.getCinLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("tel", criteria.getTel(),criteria.getTelLike());
        addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
        addPredicate("adresse", criteria.getAdresse(),criteria.getAdresseLike());
        addPredicateBigDecimal("creance", criteria.getCreance(), criteria.getCreanceMin(), criteria.getCreanceMax());
    }

    public BeneficiaireSpecification(BeneficiaireCriteria criteria) {
        super(criteria);
    }

    public BeneficiaireSpecification(BeneficiaireCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
