package ma.zs.stocky.dao.facade.core.entree;

import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.entree.EntreeProduitItem;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EntreeProduitItemDao extends AbstractRepository<EntreeProduitItem,Long>  {

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
