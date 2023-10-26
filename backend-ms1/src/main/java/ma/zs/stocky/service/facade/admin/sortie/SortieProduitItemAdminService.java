package ma.zs.stocky.service.facade.admin.sortie;

import java.util.List;
import ma.zs.stocky.bean.core.sortie.SortieProduitItem;
import ma.zs.stocky.dao.criteria.core.sortie.SortieProduitItemCriteria;
import ma.zs.stocky.zynerator.service.IService;



public interface SortieProduitItemAdminService extends  IService<SortieProduitItem,SortieProduitItemCriteria>  {

    List<SortieProduitItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    long countByProduitId(Long id);
    List<SortieProduitItem> findByTauxTvaId(Long id);
    int deleteByTauxTvaId(Long id);
    long countByTauxTvaCode(String code);
    List<SortieProduitItem> findBySortieProduitId(Long id);
    int deleteBySortieProduitId(Long id);
    long countBySortieProduitReference(String reference);



}
