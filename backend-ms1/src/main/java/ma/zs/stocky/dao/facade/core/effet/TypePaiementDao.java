package ma.zs.stocky.dao.facade.core.effet;

import org.springframework.data.jpa.repository.Query;
import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.effet.TypePaiement;
import org.springframework.stereotype.Repository;
import ma.zs.stocky.bean.core.effet.TypePaiement;
import java.util.List;


@Repository
public interface TypePaiementDao extends AbstractRepository<TypePaiement,Long>  {
    TypePaiement findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypePaiement(item.id,item.libelle) FROM TypePaiement item")
    List<TypePaiement> findAllOptimized();

}
