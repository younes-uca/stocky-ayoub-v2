package  ma.zs.stocky.dao.specification.core.sortie;

import ma.zs.stocky.zynerator.specification.AbstractSpecification;
import ma.zs.stocky.dao.criteria.core.sortie.SortieProduitCriteria;
import ma.zs.stocky.bean.core.sortie.SortieProduit;


public class SortieProduitSpecification extends  AbstractSpecification<SortieProduitCriteria, SortieProduit>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("dateSortieProduit", criteria.getDateSortieProduit(), criteria.getDateSortieProduitFrom(), criteria.getDateSortieProduitTo());
        addPredicateBigDecimal("total", criteria.getTotal(), criteria.getTotalMin(), criteria.getTotalMax());
        addPredicateBigDecimal("totalHT", criteria.getTotalHT(), criteria.getTotalHTMin(), criteria.getTotalHTMax());
        addPredicateBigDecimal("totalTVA", criteria.getTotalTVA(), criteria.getTotalTVAMin(), criteria.getTotalTVAMax());
        addPredicateBigDecimal("totalHTTC", criteria.getTotalHTTC(), criteria.getTotalHTTCMin(), criteria.getTotalHTTCMax());
        addPredicateFk("tauxTva","id", criteria.getTauxTva()==null?null:criteria.getTauxTva().getId());
        addPredicateFk("tauxTva","id", criteria.getTauxTvas());
        addPredicateFk("tauxTva","code", criteria.getTauxTva()==null?null:criteria.getTauxTva().getCode());
        addPredicateFk("depot","id", criteria.getDepot()==null?null:criteria.getDepot().getId());
        addPredicateFk("depot","id", criteria.getDepots());
        addPredicateFk("depot","libelle", criteria.getDepot()==null?null:criteria.getDepot().getLibelle());
        addPredicateFk("collaborateur","id", criteria.getCollaborateur()==null?null:criteria.getCollaborateur().getId());
        addPredicateFk("collaborateur","id", criteria.getCollaborateurs());
        addPredicateFk("collaborateur","prenom", criteria.getCollaborateur()==null?null:criteria.getCollaborateur().getPrenom());
    }

    public SortieProduitSpecification(SortieProduitCriteria criteria) {
        super(criteria);
    }

    public SortieProduitSpecification(SortieProduitCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
