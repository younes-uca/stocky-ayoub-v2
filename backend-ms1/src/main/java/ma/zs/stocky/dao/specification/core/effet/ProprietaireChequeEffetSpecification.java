package  ma.zs.stocky.dao.specification.core.effet;

import ma.zs.stocky.zynerator.specification.AbstractSpecification;
import ma.zs.stocky.dao.criteria.core.effet.ProprietaireChequeEffetCriteria;
import ma.zs.stocky.bean.core.effet.ProprietaireChequeEffet;


public class ProprietaireChequeEffetSpecification extends  AbstractSpecification<ProprietaireChequeEffetCriteria, ProprietaireChequeEffet>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
    }

    public ProprietaireChequeEffetSpecification(ProprietaireChequeEffetCriteria criteria) {
        super(criteria);
    }

    public ProprietaireChequeEffetSpecification(ProprietaireChequeEffetCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
