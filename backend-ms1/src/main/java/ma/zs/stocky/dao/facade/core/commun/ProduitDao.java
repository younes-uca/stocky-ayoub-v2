package ma.zs.stocky.dao.facade.core.commun;

import org.springframework.data.jpa.repository.Query;
import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.commun.Produit;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ProduitDao extends AbstractRepository<Produit,Long>  {

    List<Produit> findByCategorieProduitId(Long id);
    int deleteByCategorieProduitId(Long id);
    long countByCategorieProduitLibelle(String libelle);
    List<Produit> findByMarqueId(Long id);
    int deleteByMarqueId(Long id);
    long countByMarqueLibelle(String libelle);
    List<Produit> findByTauxTvaId(Long id);
    int deleteByTauxTvaId(Long id);
    long countByTauxTvaCode(String code);

    @Query("SELECT NEW Produit(item.id,item.reference) FROM Produit item")
    List<Produit> findAllOptimized();

}
