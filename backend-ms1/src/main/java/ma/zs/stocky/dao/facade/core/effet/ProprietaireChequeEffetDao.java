package ma.zs.stocky.dao.facade.core.effet;

import org.springframework.data.jpa.repository.Query;
import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.effet.ProprietaireChequeEffet;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ProprietaireChequeEffetDao extends AbstractRepository<ProprietaireChequeEffet,Long>  {


    @Query("SELECT NEW ProprietaireChequeEffet(item.id,item.nom) FROM ProprietaireChequeEffet item")
    List<ProprietaireChequeEffet> findAllOptimized();

}
