package ma.zs.stocky.dao.facade.core.commun;

import org.springframework.data.jpa.repository.Query;
import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.commun.Fournisseur;
import org.springframework.stereotype.Repository;
import ma.zs.stocky.bean.core.commun.Fournisseur;
import java.util.List;


@Repository
public interface FournisseurDao extends AbstractRepository<Fournisseur,Long>  {
    Fournisseur findByNom(String nom);
    int deleteByNom(String nom);


    @Query("SELECT NEW Fournisseur(item.id,item.reference) FROM Fournisseur item")
    List<Fournisseur> findAllOptimized();

}
