package ma.zs.stocky.dao.facade.core.commun;

import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.commun.Stock;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface StockDao extends AbstractRepository<Stock,Long>  {

    List<Stock> findByProduitId(Long id);
    int deleteByProduitId(Long id);
    long countByProduitId(Long id);
    List<Stock> findByDepotId(Long id);
    int deleteByDepotId(Long id);
    long countByDepotLibelle(String libelle);


}
