package ma.zs.stocky.service.impl.admin.sortie;


import ma.zs.stocky.bean.core.sortie.SortieProduitItem;
import ma.zs.stocky.dao.criteria.core.sortie.SortieProduitItemCriteria;
import ma.zs.stocky.dao.facade.core.sortie.SortieProduitItemDao;
import ma.zs.stocky.dao.specification.core.sortie.SortieProduitItemSpecification;
import ma.zs.stocky.service.facade.admin.sortie.SortieProduitItemAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.stocky.service.facade.admin.commun.ProduitAdminService ;
import ma.zs.stocky.bean.core.commun.Produit ;
import ma.zs.stocky.service.facade.admin.sortie.SortieProduitAdminService ;
import ma.zs.stocky.bean.core.sortie.SortieProduit ;
import ma.zs.stocky.service.facade.admin.effet.TauxTvaAdminService ;
import ma.zs.stocky.bean.core.effet.TauxTva ;

import java.util.List;
@Service
public class SortieProduitItemAdminServiceImpl extends AbstractServiceImpl<SortieProduitItem, SortieProduitItemCriteria, SortieProduitItemDao> implements SortieProduitItemAdminService {






    public List<SortieProduitItem> findByProduitId(Long id){
        return dao.findByProduitId(id);
    }
    public int deleteByProduitId(Long id){
        return dao.deleteByProduitId(id);
    }
    public long countByProduitId(Long id){
        return dao.countByProduitId(id);
    }
    public List<SortieProduitItem> findByTauxTvaId(Long id){
        return dao.findByTauxTvaId(id);
    }
    public int deleteByTauxTvaId(Long id){
        return dao.deleteByTauxTvaId(id);
    }
    public long countByTauxTvaCode(String code){
        return dao.countByTauxTvaCode(code);
    }
    public List<SortieProduitItem> findBySortieProduitId(Long id){
        return dao.findBySortieProduitId(id);
    }
    public int deleteBySortieProduitId(Long id){
        return dao.deleteBySortieProduitId(id);
    }
    public long countBySortieProduitReference(String reference){
        return dao.countBySortieProduitReference(reference);
    }






    public void configure() {
        super.configure(SortieProduitItem.class, SortieProduitItemSpecification.class);
    }


    @Autowired
    private ProduitAdminService produitService ;
    @Autowired
    private SortieProduitAdminService sortieProduitService ;
    @Autowired
    private TauxTvaAdminService tauxTvaService ;

    public SortieProduitItemAdminServiceImpl(SortieProduitItemDao dao) {
        super(dao);
    }

}
