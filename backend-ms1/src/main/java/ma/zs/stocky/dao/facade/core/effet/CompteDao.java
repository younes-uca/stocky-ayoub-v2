package ma.zs.stocky.dao.facade.core.effet;

import org.springframework.data.jpa.repository.Query;
import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.effet.Compte;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface CompteDao extends AbstractRepository<Compte,Long>  {

    List<Compte> findByProprietaireChequeEffetId(Long id);
    int deleteByProprietaireChequeEffetId(Long id);
    long countByProprietaireChequeEffetId(Long id);
    List<Compte> findByBanqueId(Long id);
    int deleteByBanqueId(Long id);
    long countByBanqueCode(String code);

    @Query("SELECT NEW Compte(item.id,item.numero) FROM Compte item")
    List<Compte> findAllOptimized();

}
