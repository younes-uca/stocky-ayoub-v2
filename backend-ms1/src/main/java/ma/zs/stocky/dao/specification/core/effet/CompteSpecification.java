package  ma.zs.stocky.dao.specification.core.effet;

import ma.zs.stocky.zynerator.specification.AbstractSpecification;
import ma.zs.stocky.dao.criteria.core.effet.CompteCriteria;
import ma.zs.stocky.bean.core.effet.Compte;


public class CompteSpecification extends  AbstractSpecification<CompteCriteria, Compte>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("numero", criteria.getNumero(),criteria.getNumeroLike());
        addPredicateFk("proprietaireChequeEffet","id", criteria.getProprietaireChequeEffet()==null?null:criteria.getProprietaireChequeEffet().getId());
        addPredicateFk("proprietaireChequeEffet","id", criteria.getProprietaireChequeEffets());
        addPredicateFk("banque","id", criteria.getBanque()==null?null:criteria.getBanque().getId());
        addPredicateFk("banque","id", criteria.getBanques());
        addPredicateFk("banque","code", criteria.getBanque()==null?null:criteria.getBanque().getCode());
    }

    public CompteSpecification(CompteCriteria criteria) {
        super(criteria);
    }

    public CompteSpecification(CompteCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
