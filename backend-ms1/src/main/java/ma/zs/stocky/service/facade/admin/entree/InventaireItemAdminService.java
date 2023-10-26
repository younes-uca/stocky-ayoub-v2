package ma.zs.stocky.service.facade.admin.entree;

import java.util.List;
import ma.zs.stocky.bean.core.entree.InventaireItem;
import ma.zs.stocky.dao.criteria.core.entree.InventaireItemCriteria;
import ma.zs.stocky.zynerator.service.IService;



public interface InventaireItemAdminService extends  IService<InventaireItem,InventaireItemCriteria>  {

    List<InventaireItem> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    long countByProduitId(Long id);
    List<InventaireItem> findByInventaireId(Long id);
    int deleteByInventaireId(Long id);
    long countByInventaireReference(String reference);



}
