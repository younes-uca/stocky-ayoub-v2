package  ma.zs.stocky.ws.converter.entree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.zs.stocky.zynerator.util.ListUtil;

import ma.zs.stocky.ws.converter.commun.ProduitConverter;
import ma.zs.stocky.ws.converter.commun.FournisseurConverter;
import ma.zs.stocky.ws.converter.entree.EntreeProduitItemConverter;
import ma.zs.stocky.ws.converter.effet.TauxTvaConverter;
import ma.zs.stocky.ws.converter.commun.CollaborateurConverter;
import ma.zs.stocky.ws.converter.commun.DepotConverter;



import ma.zs.stocky.zynerator.util.StringUtil;
import ma.zs.stocky.zynerator.converter.AbstractConverter;
import ma.zs.stocky.zynerator.util.DateUtil;
import ma.zs.stocky.bean.core.entree.EntreeProduit;
import ma.zs.stocky.ws.dto.entree.EntreeProduitDto;

@Component
public class EntreeProduitConverter extends AbstractConverter<EntreeProduit, EntreeProduitDto> {

    @Autowired
    private ProduitConverter produitConverter ;
    @Autowired
    private FournisseurConverter fournisseurConverter ;
    @Autowired
    private EntreeProduitItemConverter entreeProduitItemConverter ;
    @Autowired
    private TauxTvaConverter tauxTvaConverter ;
    @Autowired
    private CollaborateurConverter collaborateurConverter ;
    @Autowired
    private DepotConverter depotConverter ;
    private boolean tauxTva;
    private boolean fournisseur;
    private boolean depot;
    private boolean collaborateur;
    private boolean entreeProduitItems;

    public  EntreeProduitConverter(){
        super(EntreeProduit.class, EntreeProduitDto.class);
        init(true);
    }

    @Override
    public EntreeProduit toItem(EntreeProduitDto dto) {
        if (dto == null) {
            return null;
        } else {
        EntreeProduit item = new EntreeProduit();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());
            if(StringUtil.isNotEmpty(dto.getDateEntreeProduit()))
                item.setDateEntreeProduit(DateUtil.stringEnToDate(dto.getDateEntreeProduit()));
            if(StringUtil.isNotEmpty(dto.getTotalHT()))
                item.setTotalHT(dto.getTotalHT());
            if(StringUtil.isNotEmpty(dto.getTotalTVA()))
                item.setTotalTVA(dto.getTotalTVA());
            if(StringUtil.isNotEmpty(dto.getTotalHTTC()))
                item.setTotalHTTC(dto.getTotalHTTC());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(this.tauxTva && dto.getTauxTva()!=null &&  dto.getTauxTva().getId() != null)
                item.setTauxTva(tauxTvaConverter.toItem(dto.getTauxTva())) ;

            if(this.fournisseur && dto.getFournisseur()!=null &&  dto.getFournisseur().getId() != null)
                item.setFournisseur(fournisseurConverter.toItem(dto.getFournisseur())) ;

            if(this.depot && dto.getDepot()!=null &&  dto.getDepot().getId() != null)
                item.setDepot(depotConverter.toItem(dto.getDepot())) ;

            if(this.collaborateur && dto.getCollaborateur()!=null &&  dto.getCollaborateur().getId() != null)
                item.setCollaborateur(collaborateurConverter.toItem(dto.getCollaborateur())) ;


            if(this.entreeProduitItems && ListUtil.isNotEmpty(dto.getEntreeProduitItems()))
                item.setEntreeProduitItems(entreeProduitItemConverter.toItem(dto.getEntreeProduitItems()));


        return item;
        }
    }

    @Override
    public EntreeProduitDto toDto(EntreeProduit item) {
        if (item == null) {
            return null;
        } else {
            EntreeProduitDto dto = new EntreeProduitDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());
            if(item.getDateEntreeProduit()!=null)
                dto.setDateEntreeProduit(DateUtil.dateTimeToString(item.getDateEntreeProduit()));
            if(StringUtil.isNotEmpty(item.getTotalHT()))
                dto.setTotalHT(item.getTotalHT());
            if(StringUtil.isNotEmpty(item.getTotalTVA()))
                dto.setTotalTVA(item.getTotalTVA());
            if(StringUtil.isNotEmpty(item.getTotalHTTC()))
                dto.setTotalHTTC(item.getTotalHTTC());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.tauxTva && item.getTauxTva()!=null) {
            dto.setTauxTva(tauxTvaConverter.toDto(item.getTauxTva())) ;
        }
        if(this.fournisseur && item.getFournisseur()!=null) {
            dto.setFournisseur(fournisseurConverter.toDto(item.getFournisseur())) ;
        }
        if(this.depot && item.getDepot()!=null) {
            dto.setDepot(depotConverter.toDto(item.getDepot())) ;
        }
        if(this.collaborateur && item.getCollaborateur()!=null) {
            dto.setCollaborateur(collaborateurConverter.toDto(item.getCollaborateur())) ;
        }
        if(this.entreeProduitItems && ListUtil.isNotEmpty(item.getEntreeProduitItems())){
            entreeProduitItemConverter.init(true);
            entreeProduitItemConverter.setEntreeProduit(false);
            dto.setEntreeProduitItems(entreeProduitItemConverter.toDto(item.getEntreeProduitItems()));
            entreeProduitItemConverter.setEntreeProduit(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.entreeProduitItems = value;
    }

    public void initObject(boolean value) {
        this.tauxTva = value;
        this.fournisseur = value;
        this.depot = value;
        this.collaborateur = value;
    }


    public ProduitConverter getProduitConverter(){
        return this.produitConverter;
    }
    public void setProduitConverter(ProduitConverter produitConverter ){
        this.produitConverter = produitConverter;
    }
    public FournisseurConverter getFournisseurConverter(){
        return this.fournisseurConverter;
    }
    public void setFournisseurConverter(FournisseurConverter fournisseurConverter ){
        this.fournisseurConverter = fournisseurConverter;
    }
    public EntreeProduitItemConverter getEntreeProduitItemConverter(){
        return this.entreeProduitItemConverter;
    }
    public void setEntreeProduitItemConverter(EntreeProduitItemConverter entreeProduitItemConverter ){
        this.entreeProduitItemConverter = entreeProduitItemConverter;
    }
    public TauxTvaConverter getTauxTvaConverter(){
        return this.tauxTvaConverter;
    }
    public void setTauxTvaConverter(TauxTvaConverter tauxTvaConverter ){
        this.tauxTvaConverter = tauxTvaConverter;
    }
    public CollaborateurConverter getCollaborateurConverter(){
        return this.collaborateurConverter;
    }
    public void setCollaborateurConverter(CollaborateurConverter collaborateurConverter ){
        this.collaborateurConverter = collaborateurConverter;
    }
    public DepotConverter getDepotConverter(){
        return this.depotConverter;
    }
    public void setDepotConverter(DepotConverter depotConverter ){
        this.depotConverter = depotConverter;
    }
    public boolean  isTauxTva(){
        return this.tauxTva;
    }
    public void  setTauxTva(boolean tauxTva){
        this.tauxTva = tauxTva;
    }
    public boolean  isFournisseur(){
        return this.fournisseur;
    }
    public void  setFournisseur(boolean fournisseur){
        this.fournisseur = fournisseur;
    }
    public boolean  isDepot(){
        return this.depot;
    }
    public void  setDepot(boolean depot){
        this.depot = depot;
    }
    public boolean  isCollaborateur(){
        return this.collaborateur;
    }
    public void  setCollaborateur(boolean collaborateur){
        this.collaborateur = collaborateur;
    }
    public boolean  isEntreeProduitItems(){
        return this.entreeProduitItems ;
    }
    public void  setEntreeProduitItems(boolean entreeProduitItems ){
        this.entreeProduitItems  = entreeProduitItems ;
    }
}
