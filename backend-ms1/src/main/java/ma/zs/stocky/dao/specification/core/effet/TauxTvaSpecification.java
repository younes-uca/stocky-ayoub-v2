package  ma.zs.stocky.dao.specification.core.effet;

import ma.zs.stocky.zynerator.specification.AbstractSpecification;
import ma.zs.stocky.dao.criteria.core.effet.TauxTvaCriteria;
import ma.zs.stocky.bean.core.effet.TauxTva;


public class TauxTvaSpecification extends  AbstractSpecification<TauxTvaCriteria, TauxTva>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public TauxTvaSpecification(TauxTvaCriteria criteria) {
        super(criteria);
    }

    public TauxTvaSpecification(TauxTvaCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
