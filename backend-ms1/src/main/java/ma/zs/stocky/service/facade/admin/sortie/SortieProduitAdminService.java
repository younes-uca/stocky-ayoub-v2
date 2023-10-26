package ma.zs.stocky.service.facade.admin.sortie;

import java.util.List;
import ma.zs.stocky.bean.core.sortie.SortieProduit;
import ma.zs.stocky.dao.criteria.core.sortie.SortieProduitCriteria;
import ma.zs.stocky.zynerator.service.IService;



public interface SortieProduitAdminService extends  IService<SortieProduit,SortieProduitCriteria>  {

    List<SortieProduit> findByTauxTvaId(Long id);
    int deleteByTauxTvaId(Long id);
    long countByTauxTvaCode(String code);
    List<SortieProduit> findByDepotId(Long id);
    int deleteByDepotId(Long id);
    long countByDepotLibelle(String libelle);
    List<SortieProduit> findByCollaborateurId(Long id);
    int deleteByCollaborateurId(Long id);
    long countByCollaborateurPrenom(String prenom);



}
