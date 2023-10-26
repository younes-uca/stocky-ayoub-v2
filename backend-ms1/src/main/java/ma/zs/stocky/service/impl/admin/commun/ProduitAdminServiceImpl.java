package ma.zs.stocky.service.impl.admin.commun;


import ma.zs.stocky.bean.core.commun.Produit;
import ma.zs.stocky.dao.criteria.core.commun.ProduitCriteria;
import ma.zs.stocky.dao.facade.core.commun.ProduitDao;
import ma.zs.stocky.dao.specification.core.commun.ProduitSpecification;
import ma.zs.stocky.service.facade.admin.commun.ProduitAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.stocky.service.facade.admin.commun.CategorieProduitAdminService ;
import ma.zs.stocky.bean.core.commun.CategorieProduit ;
import ma.zs.stocky.service.facade.admin.commun.MarqueAdminService ;
import ma.zs.stocky.bean.core.commun.Marque ;
import ma.zs.stocky.service.facade.admin.effet.TauxTvaAdminService ;
import ma.zs.stocky.bean.core.effet.TauxTva ;

import java.util.List;
@Service
public class ProduitAdminServiceImpl extends AbstractServiceImpl<Produit, ProduitCriteria, ProduitDao> implements ProduitAdminService {






    public List<Produit> findByCategorieProduitId(Long id){
        return dao.findByCategorieProduitId(id);
    }
    public int deleteByCategorieProduitId(Long id){
        return dao.deleteByCategorieProduitId(id);
    }
    public long countByCategorieProduitLibelle(String libelle){
        return dao.countByCategorieProduitLibelle(libelle);
    }
    public List<Produit> findByMarqueId(Long id){
        return dao.findByMarqueId(id);
    }
    public int deleteByMarqueId(Long id){
        return dao.deleteByMarqueId(id);
    }
    public long countByMarqueLibelle(String libelle){
        return dao.countByMarqueLibelle(libelle);
    }
    public List<Produit> findByTauxTvaId(Long id){
        return dao.findByTauxTvaId(id);
    }
    public int deleteByTauxTvaId(Long id){
        return dao.deleteByTauxTvaId(id);
    }
    public long countByTauxTvaCode(String code){
        return dao.countByTauxTvaCode(code);
    }






    public void configure() {
        super.configure(Produit.class, ProduitSpecification.class);
    }


    @Autowired
    private CategorieProduitAdminService categorieProduitService ;
    @Autowired
    private MarqueAdminService marqueService ;
    @Autowired
    private TauxTvaAdminService tauxTvaService ;

    public ProduitAdminServiceImpl(ProduitDao dao) {
        super(dao);
    }

}
