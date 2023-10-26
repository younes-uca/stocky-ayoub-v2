package ma.zs.stocky.service.facade.admin.commun;

import java.util.List;
import ma.zs.stocky.bean.core.commun.Produit;
import ma.zs.stocky.dao.criteria.core.commun.ProduitCriteria;
import ma.zs.stocky.zynerator.service.IService;



public interface ProduitAdminService extends  IService<Produit,ProduitCriteria>  {

    List<Produit> findByCategorieProduitId(Long id);
    int deleteByCategorieProduitId(Long id);
    long countByCategorieProduitLibelle(String libelle);
    List<Produit> findByMarqueId(Long id);
    int deleteByMarqueId(Long id);
    long countByMarqueLibelle(String libelle);
    List<Produit> findByTauxTvaId(Long id);
    int deleteByTauxTvaId(Long id);
    long countByTauxTvaCode(String code);



}
