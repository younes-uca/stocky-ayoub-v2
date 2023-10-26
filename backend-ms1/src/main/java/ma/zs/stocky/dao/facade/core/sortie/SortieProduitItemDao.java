package ma.zs.stocky.dao.facade.core.sortie;

import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.sortie.SortieProduitItem;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface SortieProduitItemDao extends AbstractRepository<SortieProduitItem,Long>  {

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
