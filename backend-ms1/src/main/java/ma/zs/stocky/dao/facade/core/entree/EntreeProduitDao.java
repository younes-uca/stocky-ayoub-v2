package ma.zs.stocky.dao.facade.core.entree;

import org.springframework.data.jpa.repository.Query;
import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.entree.EntreeProduit;
import org.springframework.stereotype.Repository;
import ma.zs.stocky.bean.core.entree.EntreeProduit;
import java.util.List;


@Repository
public interface EntreeProduitDao extends AbstractRepository<EntreeProduit,Long>  {
    EntreeProduit findByReference(String reference);
    int deleteByReference(String reference);

    List<EntreeProduit> findByTauxTvaId(Long id);
    int deleteByTauxTvaId(Long id);
    long countByTauxTvaCode(String code);
    List<EntreeProduit> findByFournisseurId(Long id);
    int deleteByFournisseurId(Long id);
    long countByFournisseurNom(String nom);
    List<EntreeProduit> findByDepotId(Long id);
    int deleteByDepotId(Long id);
    long countByDepotLibelle(String libelle);
    List<EntreeProduit> findByCollaborateurId(Long id);
    int deleteByCollaborateurId(Long id);
    long countByCollaborateurPrenom(String prenom);

    @Query("SELECT NEW EntreeProduit(item.id,item.reference) FROM EntreeProduit item")
    List<EntreeProduit> findAllOptimized();

}
