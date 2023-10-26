package ma.zs.stocky.service.impl.admin.entree;


import ma.zs.stocky.bean.core.entree.EntreeProduit;
import ma.zs.stocky.dao.criteria.core.entree.EntreeProduitCriteria;
import ma.zs.stocky.dao.facade.core.entree.EntreeProduitDao;
import ma.zs.stocky.dao.specification.core.entree.EntreeProduitSpecification;
import ma.zs.stocky.service.facade.admin.entree.EntreeProduitAdminService;
import ma.zs.stocky.zynerator.service.AbstractServiceImpl;
import ma.zs.stocky.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.zs.stocky.service.facade.admin.commun.CollaborateurAdminService ;
import ma.zs.stocky.bean.core.commun.Collaborateur ;
import ma.zs.stocky.service.facade.admin.commun.FournisseurAdminService ;
import ma.zs.stocky.bean.core.commun.Fournisseur ;
import ma.zs.stocky.service.facade.admin.entree.EntreeProduitItemAdminService ;
import ma.zs.stocky.bean.core.entree.EntreeProduitItem ;
import ma.zs.stocky.service.facade.admin.effet.TauxTvaAdminService ;
import ma.zs.stocky.bean.core.effet.TauxTva ;
import ma.zs.stocky.service.facade.admin.commun.DepotAdminService ;
import ma.zs.stocky.bean.core.commun.Depot ;

import java.util.List;
@Service
public class EntreeProduitAdminServiceImpl extends AbstractServiceImpl<EntreeProduit, EntreeProduitCriteria, EntreeProduitDao> implements EntreeProduitAdminService {


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public EntreeProduit create(EntreeProduit t) {
        super.create(t);
        if (t.getEntreeProduitItems() != null) {
                t.getEntreeProduitItems().forEach(element-> {
                    element.setEntreeProduit(t);
                    entreeProduitItemService.create(element);
            });
        }
        return t;
    }

    public EntreeProduit findWithAssociatedLists(Long id){
        EntreeProduit result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setEntreeProduitItems(entreeProduitItemService.findByEntreeProduitId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        entreeProduitItemService.deleteByEntreeProduitId(id);
    }


    public void updateWithAssociatedLists(EntreeProduit entreeProduit){
    if(entreeProduit !=null && entreeProduit.getId() != null){
            List<List<EntreeProduitItem>> resultEntreeProduitItems= entreeProduitItemService.getToBeSavedAndToBeDeleted(entreeProduitItemService.findByEntreeProduitId(entreeProduit.getId()),entreeProduit.getEntreeProduitItems());
            entreeProduitItemService.delete(resultEntreeProduitItems.get(1));
            ListUtil.emptyIfNull(resultEntreeProduitItems.get(0)).forEach(e -> e.setEntreeProduit(entreeProduit));
            entreeProduitItemService.update(resultEntreeProduitItems.get(0),true);
    }
    }



    public EntreeProduit findByReferenceEntity(EntreeProduit t){
        return  dao.findByReference(t.getReference());
    }

    public List<EntreeProduit> findByTauxTvaId(Long id){
        return dao.findByTauxTvaId(id);
    }
    public int deleteByTauxTvaId(Long id){
        return dao.deleteByTauxTvaId(id);
    }
    public long countByTauxTvaCode(String code){
        return dao.countByTauxTvaCode(code);
    }
    public List<EntreeProduit> findByFournisseurId(Long id){
        return dao.findByFournisseurId(id);
    }
    public int deleteByFournisseurId(Long id){
        return dao.deleteByFournisseurId(id);
    }
    public long countByFournisseurNom(String nom){
        return dao.countByFournisseurNom(nom);
    }
    public List<EntreeProduit> findByDepotId(Long id){
        return dao.findByDepotId(id);
    }
    public int deleteByDepotId(Long id){
        return dao.deleteByDepotId(id);
    }
    public long countByDepotLibelle(String libelle){
        return dao.countByDepotLibelle(libelle);
    }
    public List<EntreeProduit> findByCollaborateurId(Long id){
        return dao.findByCollaborateurId(id);
    }
    public int deleteByCollaborateurId(Long id){
        return dao.deleteByCollaborateurId(id);
    }
    public long countByCollaborateurPrenom(String prenom){
        return dao.countByCollaborateurPrenom(prenom);
    }






    public void configure() {
        super.configure(EntreeProduit.class, EntreeProduitSpecification.class);
    }


    @Autowired
    private CollaborateurAdminService collaborateurService ;
    @Autowired
    private FournisseurAdminService fournisseurService ;
    @Autowired
    private EntreeProduitItemAdminService entreeProduitItemService ;
    @Autowired
    private TauxTvaAdminService tauxTvaService ;
    @Autowired
    private DepotAdminService depotService ;

    public EntreeProduitAdminServiceImpl(EntreeProduitDao dao) {
        super(dao);
    }

}
