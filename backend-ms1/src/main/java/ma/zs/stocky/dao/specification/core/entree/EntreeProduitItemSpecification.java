package  ma.zs.stocky.dao.specification.core.entree;

import ma.zs.stocky.zynerator.specification.AbstractSpecification;
import ma.zs.stocky.dao.criteria.core.entree.EntreeProduitItemCriteria;
import ma.zs.stocky.bean.core.entree.EntreeProduitItem;


public class EntreeProduitItemSpecification extends  AbstractSpecification<EntreeProduitItemCriteria, EntreeProduitItem>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("quantite", criteria.getQuantite(), criteria.getQuantiteMin(), criteria.getQuantiteMax());
        addPredicateBigDecimal("remise", criteria.getRemise(), criteria.getRemiseMin(), criteria.getRemiseMax());
        addPredicateBigDecimal("prixUnitaireTtc", criteria.getPrixUnitaireTtc(), criteria.getPrixUnitaireTtcMin(), criteria.getPrixUnitaireTtcMax());
        addPredicateBigDecimal("prixUht", criteria.getPrixUht(), criteria.getPrixUhtMin(), criteria.getPrixUhtMax());
        addPredicateBigDecimal("montantHt", criteria.getMontantHt(), criteria.getMontantHtMin(), criteria.getMontantHtMax());
        addPredicateBigDecimal("montantTtc", criteria.getMontantTtc(), criteria.getMontantTtcMin(), criteria.getMontantTtcMax());
        addPredicateFk("produit","id", criteria.getProduit()==null?null:criteria.getProduit().getId());
        addPredicateFk("produit","id", criteria.getProduits());
        addPredicateFk("tauxTva","id", criteria.getTauxTva()==null?null:criteria.getTauxTva().getId());
        addPredicateFk("tauxTva","id", criteria.getTauxTvas());
        addPredicateFk("tauxTva","code", criteria.getTauxTva()==null?null:criteria.getTauxTva().getCode());
        addPredicateFk("entreeProduit","id", criteria.getEntreeProduit()==null?null:criteria.getEntreeProduit().getId());
        addPredicateFk("entreeProduit","id", criteria.getEntreeProduits());
        addPredicateFk("entreeProduit","reference", criteria.getEntreeProduit()==null?null:criteria.getEntreeProduit().getReference());
    }

    public EntreeProduitItemSpecification(EntreeProduitItemCriteria criteria) {
        super(criteria);
    }

    public EntreeProduitItemSpecification(EntreeProduitItemCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
