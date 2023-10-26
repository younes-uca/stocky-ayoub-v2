package ma.zs.stocky.service.impl.admin.sortie;


import ma.zs.stocky.bean.core.sortie.SortieProduit;
import ma.zs.stocky.dao.criteria.core.sortie.SortieProduitCriteria;
import ma.zs.stocky.dao.facade.core.sortie.SortieProduitDao;
import ma.zs.stocky.dao.specification.core.sortie.SortieProduitSpecification;
import ma.zs.stocky.service.facade.admin.sortie.SortieProduitAdminService;
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
import ma.zs.stocky.service.facade.admin.sortie.SortieProduitItemAdminService ;
import ma.zs.stocky.bean.core.sortie.SortieProduitItem ;
import ma.zs.stocky.service.facade.admin.effet.TauxTvaAdminService ;
import ma.zs.stocky.bean.core.effet.TauxTva ;
import ma.zs.stocky.service.facade.admin.commun.DepotAdminService ;
import ma.zs.stocky.bean.core.commun.Depot ;

import java.util.List;
@Service
public class SortieProduitAdminServiceImpl extends AbstractServiceImpl<SortieProduit, SortieProduitCriteria, SortieProduitDao> implements SortieProduitAdminService {


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public SortieProduit create(SortieProduit t) {
        super.create(t);
        if (t.getSortieProduitItems() != null) {
                t.getSortieProduitItems().forEach(element-> {
                    element.setSortieProduit(t);
                    sortieProduitItemService.create(element);
            });
        }
        return t;
    }

    public SortieProduit findWithAssociatedLists(Long id){
        SortieProduit result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setSortieProduitItems(sortieProduitItemService.findBySortieProduitId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        sortieProduitItemService.deleteBySortieProduitId(id);
    }


    public void updateWithAssociatedLists(SortieProduit sortieProduit){
    if(sortieProduit !=null && sortieProduit.getId() != null){
            List<List<SortieProduitItem>> resultSortieProduitItems= sortieProduitItemService.getToBeSavedAndToBeDeleted(sortieProduitItemService.findBySortieProduitId(sortieProduit.getId()),sortieProduit.getSortieProduitItems());
            sortieProduitItemService.delete(resultSortieProduitItems.get(1));
            ListUtil.emptyIfNull(resultSortieProduitItems.get(0)).forEach(e -> e.setSortieProduit(sortieProduit));
            sortieProduitItemService.update(resultSortieProduitItems.get(0),true);
    }
    }



    public SortieProduit findByReferenceEntity(SortieProduit t){
        return  dao.findByReference(t.getReference());
    }

    public List<SortieProduit> findByTauxTvaId(Long id){
        return dao.findByTauxTvaId(id);
    }
    public int deleteByTauxTvaId(Long id){
        return dao.deleteByTauxTvaId(id);
    }
    public long countByTauxTvaCode(String code){
        return dao.countByTauxTvaCode(code);
    }
    public List<SortieProduit> findByDepotId(Long id){
        return dao.findByDepotId(id);
    }
    public int deleteByDepotId(Long id){
        return dao.deleteByDepotId(id);
    }
    public long countByDepotLibelle(String libelle){
        return dao.countByDepotLibelle(libelle);
    }
    public List<SortieProduit> findByCollaborateurId(Long id){
        return dao.findByCollaborateurId(id);
    }
    public int deleteByCollaborateurId(Long id){
        return dao.deleteByCollaborateurId(id);
    }
    public long countByCollaborateurPrenom(String prenom){
        return dao.countByCollaborateurPrenom(prenom);
    }






    public void configure() {
        super.configure(SortieProduit.class, SortieProduitSpecification.class);
    }


    @Autowired
    private CollaborateurAdminService collaborateurService ;
    @Autowired
    private SortieProduitItemAdminService sortieProduitItemService ;
    @Autowired
    private TauxTvaAdminService tauxTvaService ;
    @Autowired
    private DepotAdminService depotService ;

    public SortieProduitAdminServiceImpl(SortieProduitDao dao) {
        super(dao);
    }

}
