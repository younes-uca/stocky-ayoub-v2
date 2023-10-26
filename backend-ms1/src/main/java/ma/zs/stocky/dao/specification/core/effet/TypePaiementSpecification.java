package  ma.zs.stocky.dao.specification.core.effet;

import ma.zs.stocky.zynerator.specification.AbstractSpecification;
import ma.zs.stocky.dao.criteria.core.effet.TypePaiementCriteria;
import ma.zs.stocky.bean.core.effet.TypePaiement;


public class TypePaiementSpecification extends  AbstractSpecification<TypePaiementCriteria, TypePaiement>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public TypePaiementSpecification(TypePaiementCriteria criteria) {
        super(criteria);
    }

    public TypePaiementSpecification(TypePaiementCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
