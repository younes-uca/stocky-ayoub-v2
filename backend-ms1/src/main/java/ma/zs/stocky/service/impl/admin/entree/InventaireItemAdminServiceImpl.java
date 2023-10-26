package ma.zs.stocky.service.impl.admin.entree;


import ma.zs.stocky.bean.core.entree.InventaireItem;
import ma.zs.stocky.dao.criteria.core.entree.InventaireItemCriteria;
import ma.zs.stocky.dao.facade.core.entree.InventaireItemDao;
import ma.zs.stocky.dao.specification.core.entree.InventaireItemSpecification;
import ma.zs.stocky.service.facade.admin.entree.InventaireItemAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.stocky.service.facade.admin.entree.InventaireAdminService ;
import ma.zs.stocky.bean.core.entree.Inventaire ;
import ma.zs.stocky.service.facade.admin.commun.ProduitAdminService ;
import ma.zs.stocky.bean.core.commun.Produit ;

import java.util.List;
@Service
public class InventaireItemAdminServiceImpl extends AbstractServiceImpl<InventaireItem, InventaireItemCriteria, InventaireItemDao> implements InventaireItemAdminService {






    public List<InventaireItem> findByProduitId(Long id){
        return dao.findByProduitId(id);
    }
    public int deleteByProduitId(Long id){
        return dao.deleteByProduitId(id);
    }
    public long countByProduitId(Long id){
        return dao.countByProduitId(id);
    }
    public List<InventaireItem> findByInventaireId(Long id){
        return dao.findByInventaireId(id);
    }
    public int deleteByInventaireId(Long id){
        return dao.deleteByInventaireId(id);
    }
    public long countByInventaireReference(String reference){
        return dao.countByInventaireReference(reference);
    }






    public void configure() {
        super.configure(InventaireItem.class, InventaireItemSpecification.class);
    }


    @Autowired
    private InventaireAdminService inventaireService ;
    @Autowired
    private ProduitAdminService produitService ;

    public InventaireItemAdminServiceImpl(InventaireItemDao dao) {
        super(dao);
    }

}
