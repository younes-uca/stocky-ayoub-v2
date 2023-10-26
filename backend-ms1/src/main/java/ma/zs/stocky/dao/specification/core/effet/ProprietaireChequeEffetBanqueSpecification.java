package  ma.zs.stocky.dao.specification.core.effet;

import ma.zs.stocky.zynerator.specification.AbstractSpecification;
import ma.zs.stocky.dao.criteria.core.effet.ProprietaireChequeEffetBanqueCriteria;
import ma.zs.stocky.bean.core.effet.ProprietaireChequeEffetBanque;


public class ProprietaireChequeEffetBanqueSpecification extends  AbstractSpecification<ProprietaireChequeEffetBanqueCriteria, ProprietaireChequeEffetBanque>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateFk("proprietaireChequeEffet","id", criteria.getProprietaireChequeEffet()==null?null:criteria.getProprietaireChequeEffet().getId());
        addPredicateFk("proprietaireChequeEffet","id", criteria.getProprietaireChequeEffets());
        addPredicateFk("banque","id", criteria.getBanque()==null?null:criteria.getBanque().getId());
        addPredicateFk("banque","id", criteria.getBanques());
        addPredicateFk("banque","code", criteria.getBanque()==null?null:criteria.getBanque().getCode());
        addPredicateFk("compte","id", criteria.getCompte()==null?null:criteria.getCompte().getId());
        addPredicateFk("compte","id", criteria.getComptes());
    }

    public ProprietaireChequeEffetBanqueSpecification(ProprietaireChequeEffetBanqueCriteria criteria) {
        super(criteria);
    }

    public ProprietaireChequeEffetBanqueSpecification(ProprietaireChequeEffetBanqueCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
