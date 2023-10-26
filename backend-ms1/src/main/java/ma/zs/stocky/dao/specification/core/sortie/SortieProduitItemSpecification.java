package  ma.zs.stocky.dao.specification.core.sortie;

import ma.zs.stocky.zynerator.specification.AbstractSpecification;
import ma.zs.stocky.dao.criteria.core.sortie.SortieProduitItemCriteria;
import ma.zs.stocky.bean.core.sortie.SortieProduitItem;


public class SortieProduitItemSpecification extends  AbstractSpecification<SortieProduitItemCriteria, SortieProduitItem>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("quantite", criteria.getQuantite(), criteria.getQuantiteMin(), criteria.getQuantiteMax());
        addPredicateBigDecimal("prix", criteria.getPrix(), criteria.getPrixMin(), criteria.getPrixMax());
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
        addPredicateFk("sortieProduit","id", criteria.getSortieProduit()==null?null:criteria.getSortieProduit().getId());
        addPredicateFk("sortieProduit","id", criteria.getSortieProduits());
        addPredicateFk("sortieProduit","reference", criteria.getSortieProduit()==null?null:criteria.getSortieProduit().getReference());
    }

    public SortieProduitItemSpecification(SortieProduitItemCriteria criteria) {
        super(criteria);
    }

    public SortieProduitItemSpecification(SortieProduitItemCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
