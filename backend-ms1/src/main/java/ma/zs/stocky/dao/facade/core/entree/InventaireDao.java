package ma.zs.stocky.dao.facade.core.entree;

import org.springframework.data.jpa.repository.Query;
import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.entree.Inventaire;
import org.springframework.stereotype.Repository;
import ma.zs.stocky.bean.core.entree.Inventaire;
import java.util.List;


@Repository
public interface InventaireDao extends AbstractRepository<Inventaire,Long>  {
    Inventaire findByReference(String reference);
    int deleteByReference(String reference);

    List<Inventaire> findByCollaborateurId(Long id);
    int deleteByCollaborateurId(Long id);
    long countByCollaborateurPrenom(String prenom);

    @Query("SELECT NEW Inventaire(item.id,item.reference) FROM Inventaire item")
    List<Inventaire> findAllOptimized();

}
