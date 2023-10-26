package ma.zs.stocky.dao.facade.core.commun;

import org.springframework.data.jpa.repository.Query;
import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.commun.Collaborateur;
import org.springframework.stereotype.Repository;
import ma.zs.stocky.bean.core.commun.Collaborateur;
import java.util.List;


@Repository
public interface CollaborateurDao extends AbstractRepository<Collaborateur,Long>  {
    Collaborateur findByPrenom(String prenom);
    int deleteByPrenom(String prenom);

    Collaborateur findByUsername(String username);

    @Query("SELECT NEW Collaborateur(item.id,item.prenom) FROM Collaborateur item")
    List<Collaborateur> findAllOptimized();

}
