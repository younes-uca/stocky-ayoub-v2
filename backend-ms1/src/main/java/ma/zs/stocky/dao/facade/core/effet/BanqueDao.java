package ma.zs.stocky.dao.facade.core.effet;

import org.springframework.data.jpa.repository.Query;
import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.effet.Banque;
import org.springframework.stereotype.Repository;
import ma.zs.stocky.bean.core.effet.Banque;
import java.util.List;


@Repository
public interface BanqueDao extends AbstractRepository<Banque,Long>  {
    Banque findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Banque(item.id,item.libelle) FROM Banque item")
    List<Banque> findAllOptimized();

}
