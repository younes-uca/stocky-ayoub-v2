package ma.zs.stocky.service.facade.admin.entree;

import java.util.List;
import ma.zs.stocky.bean.core.entree.EntreeProduitItem;
import ma.zs.stocky.dao.criteria.core.entree.EntreeProduitItemCriteria;
import ma.zs.stocky.zynerator.service.IService;



public interface EntreeProduitItemAdminService extends  IService<EntreeProduitItem,EntreeProduitItemCriteria>  {

    List<EntreeProduitItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    long countByProduitId(Long id);
    List<EntreeProduitItem> findByTauxTvaId(Long id);
    int deleteByTauxTvaId(Long id);
    long countByTauxTvaCode(String code);
    List<EntreeProduitItem> findByEntreeProduitId(Long id);
    int deleteByEntreeProduitId(Long id);
    long countByEntreeProduitReference(String reference);



}
