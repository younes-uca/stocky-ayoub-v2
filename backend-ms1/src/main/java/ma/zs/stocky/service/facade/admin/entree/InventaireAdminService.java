package ma.zs.stocky.service.facade.admin.entree;

import java.util.List;
import ma.zs.stocky.bean.core.entree.Inventaire;
import ma.zs.stocky.dao.criteria.core.entree.InventaireCriteria;
import ma.zs.stocky.zynerator.service.IService;



public interface InventaireAdminService extends  IService<Inventaire,InventaireCriteria>  {

    List<Inventaire> findByCollaborateurId(Long id);
    int deleteByCollaborateurId(Long id);
    long countByCollaborateurPrenom(String prenom);



}
