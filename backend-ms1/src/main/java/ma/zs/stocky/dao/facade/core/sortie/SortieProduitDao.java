package ma.zs.stocky.dao.facade.core.sortie;

import org.springframework.data.jpa.repository.Query;
import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.sortie.SortieProduit;
import org.springframework.stereotype.Repository;
import ma.zs.stocky.bean.core.sortie.SortieProduit;
import java.util.List;


@Repository
public interface SortieProduitDao extends AbstractRepository<SortieProduit,Long>  {
    SortieProduit findByReference(String reference);
    int deleteByReference(String reference);

    List<SortieProduit> findByTauxTvaId(Long id);
    int deleteByTauxTvaId(Long id);
    long countByTauxTvaCode(String code);
    List<SortieProduit> findByDepotId(Long id);
    int deleteByDepotId(Long id);
    long countByDepotLibelle(String libelle);
    List<SortieProduit> findByCollaborateurId(Long id);
    int deleteByCollaborateurId(Long id);
    long countByCollaborateurPrenom(String prenom);

    @Query("SELECT NEW SortieProduit(item.id,item.reference) FROM SortieProduit item")
    List<SortieProduit> findAllOptimized();

}
