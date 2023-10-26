package ma.zs.stocky.service.impl.admin.entree;


import ma.zs.stocky.bean.core.entree.EntreeProduitItem;
import ma.zs.stocky.dao.criteria.core.entree.EntreeProduitItemCriteria;
import ma.zs.stocky.dao.facade.core.entree.EntreeProduitItemDao;
import ma.zs.stocky.dao.specification.core.entree.EntreeProduitItemSpecification;
import ma.zs.stocky.service.facade.admin.entree.EntreeProduitItemAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.stocky.service.facade.admin.commun.ProduitAdminService ;
import ma.zs.stocky.bean.core.commun.Produit ;
import ma.zs.stocky.service.facade.admin.entree.EntreeProduitAdminService ;
import ma.zs.stocky.bean.core.entree.EntreeProduit ;
import ma.zs.stocky.service.facade.admin.effet.TauxTvaAdminService ;
import ma.zs.stocky.bean.core.effet.TauxTva ;

import java.util.List;
@Service
public class EntreeProduitItemAdminServiceImpl extends AbstractServiceImpl<EntreeProduitItem, EntreeProduitItemCriteria, EntreeProduitItemDao> implements EntreeProduitItemAdminService {






    public List<EntreeProduitItem> findByProduitId(Long id){
        return dao.findByProduitId(id);
    }
    public int deleteByProduitId(Long id){
        return dao.deleteByProduitId(id);
    }
    public long countByProduitId(Long id){
        return dao.countByProduitId(id);
    }
    public List<EntreeProduitItem> findByTauxTvaId(Long id){
        return dao.findByTauxTvaId(id);
    }
    public int deleteByTauxTvaId(Long id){
        return dao.deleteByTauxTvaId(id);
    }
    public long countByTauxTvaCode(String code){
        return dao.countByTauxTvaCode(code);
    }
    public List<EntreeProduitItem> findByEntreeProduitId(Long id){
        return dao.findByEntreeProduitId(id);
    }
    public int deleteByEntreeProduitId(Long id){
        return dao.deleteByEntreeProduitId(id);
    }
    public long countByEntreeProduitReference(String reference){
        return dao.countByEntreeProduitReference(reference);
    }






    public void configure() {
        super.configure(EntreeProduitItem.class, EntreeProduitItemSpecification.class);
    }


    @Autowired
    private ProduitAdminService produitService ;
    @Autowired
    private EntreeProduitAdminService entreeProduitService ;
    @Autowired
    private TauxTvaAdminService tauxTvaService ;

    public EntreeProduitItemAdminServiceImpl(EntreeProduitItemDao dao) {
        super(dao);
    }

}
