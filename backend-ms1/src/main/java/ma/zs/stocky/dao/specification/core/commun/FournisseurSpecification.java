package  ma.zs.stocky.dao.specification.core.commun;

import ma.zs.stocky.zynerator.specification.AbstractSpecification;
import ma.zs.stocky.dao.criteria.core.commun.FournisseurCriteria;
import ma.zs.stocky.bean.core.commun.Fournisseur;


public class FournisseurSpecification extends  AbstractSpecification<FournisseurCriteria, Fournisseur>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("telephone", criteria.getTelephone(),criteria.getTelephoneLike());
        addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
    }

    public FournisseurSpecification(FournisseurCriteria criteria) {
        super(criteria);
    }

    public FournisseurSpecification(FournisseurCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
