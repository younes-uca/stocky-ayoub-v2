package  ma.zs.stocky.dao.specification.core.entree;

import ma.zs.stocky.zynerator.specification.AbstractSpecification;
import ma.zs.stocky.dao.criteria.core.entree.EntreeProduitCriteria;
import ma.zs.stocky.bean.core.entree.EntreeProduit;


public class EntreeProduitSpecification extends  AbstractSpecification<EntreeProduitCriteria, EntreeProduit>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("dateEntreeProduit", criteria.getDateEntreeProduit(), criteria.getDateEntreeProduitFrom(), criteria.getDateEntreeProduitTo());
        addPredicateBigDecimal("totalHT", criteria.getTotalHT(), criteria.getTotalHTMin(), criteria.getTotalHTMax());
        addPredicateBigDecimal("totalTVA", criteria.getTotalTVA(), criteria.getTotalTVAMin(), criteria.getTotalTVAMax());
        addPredicateBigDecimal("totalHTTC", criteria.getTotalHTTC(), criteria.getTotalHTTCMin(), criteria.getTotalHTTCMax());
        addPredicateFk("tauxTva","id", criteria.getTauxTva()==null?null:criteria.getTauxTva().getId());
        addPredicateFk("tauxTva","id", criteria.getTauxTvas());
        addPredicateFk("tauxTva","code", criteria.getTauxTva()==null?null:criteria.getTauxTva().getCode());
        addPredicateFk("fournisseur","id", criteria.getFournisseur()==null?null:criteria.getFournisseur().getId());
        addPredicateFk("fournisseur","id", criteria.getFournisseurs());
        addPredicateFk("fournisseur","nom", criteria.getFournisseur()==null?null:criteria.getFournisseur().getNom());
        addPredicateFk("depot","id", criteria.getDepot()==null?null:criteria.getDepot().getId());
        addPredicateFk("depot","id", criteria.getDepots());
        addPredicateFk("depot","libelle", criteria.getDepot()==null?null:criteria.getDepot().getLibelle());
        addPredicateFk("collaborateur","id", criteria.getCollaborateur()==null?null:criteria.getCollaborateur().getId());
        addPredicateFk("collaborateur","id", criteria.getCollaborateurs());
        addPredicateFk("collaborateur","prenom", criteria.getCollaborateur()==null?null:criteria.getCollaborateur().getPrenom());
    }

    public EntreeProduitSpecification(EntreeProduitCriteria criteria) {
        super(criteria);
    }

    public EntreeProduitSpecification(EntreeProduitCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
