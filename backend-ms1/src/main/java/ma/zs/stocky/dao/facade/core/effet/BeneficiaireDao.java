package ma.zs.stocky.dao.facade.core.effet;

import org.springframework.data.jpa.repository.Query;
import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.effet.Beneficiaire;
import org.springframework.stereotype.Repository;
import ma.zs.stocky.bean.core.effet.Beneficiaire;
import java.util.List;


@Repository
public interface BeneficiaireDao extends AbstractRepository<Beneficiaire,Long>  {
    Beneficiaire findByCin(String cin);
    int deleteByCin(String cin);


    @Query("SELECT NEW Beneficiaire(item.id,item.nom) FROM Beneficiaire item")
    List<Beneficiaire> findAllOptimized();

}
