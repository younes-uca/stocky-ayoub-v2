package ma.zs.stocky.dao.facade.core.effet;

import org.springframework.data.jpa.repository.Query;
import ma.zs.stocky.zynerator.repository.AbstractRepository;
import ma.zs.stocky.bean.core.effet.Paiement;
import org.springframework.stereotype.Repository;
import ma.zs.stocky.bean.core.effet.Paiement;
import java.util.List;


@Repository
public interface PaiementDao extends AbstractRepository<Paiement,Long>  {
    Paiement findByCodeChequeEffet(String codeChequeEffet);
    int deleteByCodeChequeEffet(String codeChequeEffet);

    List<Paiement> findByProprietaireChequeEffetId(Long id);
    int deleteByProprietaireChequeEffetId(Long id);
    long countByProprietaireChequeEffetId(Long id);
    List<Paiement> findByCompteId(Long id);
    int deleteByCompteId(Long id);
    long countByCompteId(Long id);
    List<Paiement> findByTypePaiementId(Long id);
    int deleteByTypePaiementId(Long id);
    long countByTypePaiementCode(String code);
    List<Paiement> findByBeneficiaireId(Long id);
    int deleteByBeneficiaireId(Long id);
    long countByBeneficiaireCin(String cin);

    @Query("SELECT NEW Paiement(item.id,item.codeChequeEffet) FROM Paiement item")
    List<Paiement> findAllOptimized();

}
