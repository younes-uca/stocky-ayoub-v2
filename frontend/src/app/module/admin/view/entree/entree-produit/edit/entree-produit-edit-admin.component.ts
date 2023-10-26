import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {EntreeProduitAdminService} from 'src/app/controller/service/admin/entree/EntreeProduitAdmin.service';
import {EntreeProduitDto} from 'src/app/controller/model/entree/EntreeProduit.model';
import {EntreeProduitCriteria} from 'src/app/controller/criteria/entree/EntreeProduitCriteria.model';


import {ProduitDto} from 'src/app/controller/model/commun/Produit.model';
import {ProduitAdminService} from 'src/app/controller/service/admin/commun/ProduitAdmin.service';
import {FournisseurDto} from 'src/app/controller/model/commun/Fournisseur.model';
import {FournisseurAdminService} from 'src/app/controller/service/admin/commun/FournisseurAdmin.service';
import {EntreeProduitItemDto} from 'src/app/controller/model/entree/EntreeProduitItem.model';
import {EntreeProduitItemAdminService} from 'src/app/controller/service/admin/entree/EntreeProduitItemAdmin.service';
import {TauxTvaDto} from 'src/app/controller/model/effet/TauxTva.model';
import {TauxTvaAdminService} from 'src/app/controller/service/admin/effet/TauxTvaAdmin.service';
import {CollaborateurDto} from 'src/app/controller/model/commun/Collaborateur.model';
import {CollaborateurAdminService} from 'src/app/controller/service/admin/commun/CollaborateurAdmin.service';
import {DepotDto} from 'src/app/controller/model/commun/Depot.model';
import {DepotAdminService} from 'src/app/controller/service/admin/commun/DepotAdmin.service';

@Component({
  selector: 'app-entree-produit-edit-admin',
  templateUrl: './entree-produit-edit-admin.component.html'
})
export class EntreeProduitEditAdminComponent extends AbstractEditController<EntreeProduitDto, EntreeProduitCriteria, EntreeProduitAdminService>   implements OnInit {

    private _entreeProduitItemsElement = new EntreeProduitItemDto();

    private _validEntreeProduitReference = true;

    private _validTauxTvaLibelle = true;
    private _validTauxTvaCode = true;
    private _validFournisseurReference = true;
    private _validFournisseurNom = true;
    private _validDepotLibelle = true;
    private _validCollaborateurNom = true;
    private _validCollaborateurPrenom = true;
    private _validEntreeProduitItemsProduit = true;
    private _validEntreeProduitItemsQuantite = true;
    private _validEntreeProduitItemsRemise = true;
    private _validEntreeProduitItemsPrixUnitaireTtc = true;
    private _validEntreeProduitItemsPrixUht = true;
    private _validEntreeProduitItemsMontantHt = true;
    private _validEntreeProduitItemsMontantTtc = true;



    constructor( private entreeProduitService: EntreeProduitAdminService , private collaborateurService: CollaborateurAdminService, private produitService: ProduitAdminService, private fournisseurService: FournisseurAdminService, private entreeProduitItemService: EntreeProduitItemAdminService, private tauxTvaService: TauxTvaAdminService, private depotService: DepotAdminService) {
        super(entreeProduitService);
    }

    ngOnInit(): void {
        this.entreeProduitItemsElement.produit = new ProduitDto();
        this.produitService.findAll().subscribe((data) => this.produits = data);
        this.entreeProduitItemsElement.tauxTva = new TauxTvaDto();
        this.tauxTvaService.findAll().subscribe((data) => this.tauxTvas = data);

        this.tauxTva = new TauxTvaDto();
        this.tauxTvaService.findAll().subscribe((data) => this.tauxTvas = data);
        this.fournisseur = new FournisseurDto();
        this.fournisseurService.findAll().subscribe((data) => this.fournisseurs = data);
        this.depot = new DepotDto();
        this.depotService.findAll().subscribe((data) => this.depots = data);
        this.collaborateur = new CollaborateurDto();
        this.collaborateurService.findAll().subscribe((data) => this.collaborateurs = data);
    }
    public prepareEdit() {
        this.item.dateEntreeProduit = this.entreeProduitService.format(this.item.dateEntreeProduit);
    }



    public validateEntreeProduitItems(){
        this.errorMessages = new Array();
        this.validateEntreeProduitItemsProduit();
        this.validateEntreeProduitItemsQuantite();
        this.validateEntreeProduitItemsRemise();
        this.validateEntreeProduitItemsPrixUnitaireTtc();
        this.validateEntreeProduitItemsPrixUht();
        this.validateEntreeProduitItemsMontantHt();
        this.validateEntreeProduitItemsMontantTtc();
    }
    public setValidation(value: boolean){
        this.validEntreeProduitReference = value;
        this.validEntreeProduitItemsProduit = value;
        this.validEntreeProduitItemsQuantite = value;
        this.validEntreeProduitItemsRemise = value;
        this.validEntreeProduitItemsPrixUnitaireTtc = value;
        this.validEntreeProduitItemsPrixUht = value;
        this.validEntreeProduitItemsMontantHt = value;
        this.validEntreeProduitItemsMontantTtc = value;
        }
   public addEntreeProduitItems() {
        if( this.item.entreeProduitItems == null )
            this.item.entreeProduitItems = new Array<EntreeProduitItemDto>();
       this.validateEntreeProduitItems();
       if (this.errorMessages.length === 0) {
            if(this.entreeProduitItemsElement.id == null){
                this.item.entreeProduitItems.push(this.entreeProduitItemsElement);
            }else{
                const index = this.item.entreeProduitItems.findIndex(e => e.id == this.entreeProduitItemsElement.id);
                this.item.entreeProduitItems[index] = this.entreeProduitItemsElement;
            }
          this.entreeProduitItemsElement = new EntreeProduitItemDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs', detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
        }
   }

    public deleteEntreeProduitItems(p: EntreeProduitItemDto) {
        this.item.entreeProduitItems.forEach((element, index) => {
            if (element === p) { this.item.entreeProduitItems.splice(index, 1); }
        });
    }

    public editEntreeProduitItems(p: EntreeProduitItemDto) {
        this.entreeProduitItemsElement = {... p};
        this.activeTab = 0;
    }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateEntreeProduitReference();
    }
    public validateEntreeProduitReference(){
        if (this.stringUtilService.isEmpty(this.item.reference)) {
            this.errorMessages.push('Reference non valide');
            this.validEntreeProduitReference = false;
        } else {
            this.validEntreeProduitReference = true;
        }
    }


    private validateEntreeProduitItemsProduit(){
        if (this.entreeProduitItemsElement.produit == null) {
        this.errorMessages.push('Produit de la entreeProduitItem est  invalide');
            this.validEntreeProduitItemsProduit = false;
        } else {
            this.validEntreeProduitItemsProduit = true;
        }
    }
    private validateEntreeProduitItemsQuantite(){
        if (this.entreeProduitItemsElement.quantite == null) {
        this.errorMessages.push('Quantite de la entreeProduitItem est  invalide');
            this.validEntreeProduitItemsQuantite = false;
        } else {
            this.validEntreeProduitItemsQuantite = true;
        }
    }
    private validateEntreeProduitItemsRemise(){
        if (this.entreeProduitItemsElement.remise == null) {
        this.errorMessages.push('Remise de la entreeProduitItem est  invalide');
            this.validEntreeProduitItemsRemise = false;
        } else {
            this.validEntreeProduitItemsRemise = true;
        }
    }
    private validateEntreeProduitItemsPrixUnitaireTtc(){
        if (this.entreeProduitItemsElement.prixUnitaireTtc == null) {
        this.errorMessages.push('PrixUnitaireTtc de la entreeProduitItem est  invalide');
            this.validEntreeProduitItemsPrixUnitaireTtc = false;
        } else {
            this.validEntreeProduitItemsPrixUnitaireTtc = true;
        }
    }
    private validateEntreeProduitItemsPrixUht(){
        if (this.entreeProduitItemsElement.prixUht == null) {
        this.errorMessages.push('PrixUht de la entreeProduitItem est  invalide');
            this.validEntreeProduitItemsPrixUht = false;
        } else {
            this.validEntreeProduitItemsPrixUht = true;
        }
    }
    private validateEntreeProduitItemsMontantHt(){
        if (this.entreeProduitItemsElement.montantHt == null) {
        this.errorMessages.push('MontantHt de la entreeProduitItem est  invalide');
            this.validEntreeProduitItemsMontantHt = false;
        } else {
            this.validEntreeProduitItemsMontantHt = true;
        }
    }
    private validateEntreeProduitItemsMontantTtc(){
        if (this.entreeProduitItemsElement.montantTtc == null) {
        this.errorMessages.push('MontantTtc de la entreeProduitItem est  invalide');
            this.validEntreeProduitItemsMontantTtc = false;
        } else {
            this.validEntreeProduitItemsMontantTtc = true;
        }
    }


   get produit(): ProduitDto {
       return this.produitService.item;
   }
  set produit(value: ProduitDto) {
        this.produitService.item = value;
   }
   get produits(): Array<ProduitDto> {
        return this.produitService.items;
   }
   set produits(value: Array<ProduitDto>) {
        this.produitService.items = value;
   }
   get createProduitDialog(): boolean {
       return this.produitService.createDialog;
   }
  set createProduitDialog(value: boolean) {
       this.produitService.createDialog= value;
   }
   get depot(): DepotDto {
       return this.depotService.item;
   }
  set depot(value: DepotDto) {
        this.depotService.item = value;
   }
   get depots(): Array<DepotDto> {
        return this.depotService.items;
   }
   set depots(value: Array<DepotDto>) {
        this.depotService.items = value;
   }
   get createDepotDialog(): boolean {
       return this.depotService.createDialog;
   }
  set createDepotDialog(value: boolean) {
       this.depotService.createDialog= value;
   }
   get tauxTva(): TauxTvaDto {
       return this.tauxTvaService.item;
   }
  set tauxTva(value: TauxTvaDto) {
        this.tauxTvaService.item = value;
   }
   get tauxTvas(): Array<TauxTvaDto> {
        return this.tauxTvaService.items;
   }
   set tauxTvas(value: Array<TauxTvaDto>) {
        this.tauxTvaService.items = value;
   }
   get createTauxTvaDialog(): boolean {
       return this.tauxTvaService.createDialog;
   }
  set createTauxTvaDialog(value: boolean) {
       this.tauxTvaService.createDialog= value;
   }
   get collaborateur(): CollaborateurDto {
       return this.collaborateurService.item;
   }
  set collaborateur(value: CollaborateurDto) {
        this.collaborateurService.item = value;
   }
   get collaborateurs(): Array<CollaborateurDto> {
        return this.collaborateurService.items;
   }
   set collaborateurs(value: Array<CollaborateurDto>) {
        this.collaborateurService.items = value;
   }
   get createCollaborateurDialog(): boolean {
       return this.collaborateurService.createDialog;
   }
  set createCollaborateurDialog(value: boolean) {
       this.collaborateurService.createDialog= value;
   }
   get fournisseur(): FournisseurDto {
       return this.fournisseurService.item;
   }
  set fournisseur(value: FournisseurDto) {
        this.fournisseurService.item = value;
   }
   get fournisseurs(): Array<FournisseurDto> {
        return this.fournisseurService.items;
   }
   set fournisseurs(value: Array<FournisseurDto>) {
        this.fournisseurService.items = value;
   }
   get createFournisseurDialog(): boolean {
       return this.fournisseurService.createDialog;
   }
  set createFournisseurDialog(value: boolean) {
       this.fournisseurService.createDialog= value;
   }

    get entreeProduitItemsElement(): EntreeProduitItemDto {
        if( this._entreeProduitItemsElement == null )
            this._entreeProduitItemsElement = new EntreeProduitItemDto();
         return this._entreeProduitItemsElement;
    }

    set entreeProduitItemsElement(value: EntreeProduitItemDto) {
        this._entreeProduitItemsElement = value;
    }

    get validEntreeProduitReference(): boolean {
        return this._validEntreeProduitReference;
    }
    set validEntreeProduitReference(value: boolean) {
        this._validEntreeProduitReference = value;
    }

    get validTauxTvaLibelle(): boolean {
        return this._validTauxTvaLibelle;
    }
    set validTauxTvaLibelle(value: boolean) {
        this._validTauxTvaLibelle = value;
    }
    get validTauxTvaCode(): boolean {
        return this._validTauxTvaCode;
    }
    set validTauxTvaCode(value: boolean) {
        this._validTauxTvaCode = value;
    }
    get validFournisseurReference(): boolean {
        return this._validFournisseurReference;
    }
    set validFournisseurReference(value: boolean) {
        this._validFournisseurReference = value;
    }
    get validFournisseurNom(): boolean {
        return this._validFournisseurNom;
    }
    set validFournisseurNom(value: boolean) {
        this._validFournisseurNom = value;
    }
    get validDepotLibelle(): boolean {
        return this._validDepotLibelle;
    }
    set validDepotLibelle(value: boolean) {
        this._validDepotLibelle = value;
    }
    get validCollaborateurNom(): boolean {
        return this._validCollaborateurNom;
    }
    set validCollaborateurNom(value: boolean) {
        this._validCollaborateurNom = value;
    }
    get validCollaborateurPrenom(): boolean {
        return this._validCollaborateurPrenom;
    }
    set validCollaborateurPrenom(value: boolean) {
        this._validCollaborateurPrenom = value;
    }
    get validEntreeProduitItemsProduit(): boolean {
        return this._validEntreeProduitItemsProduit;
    }
    set validEntreeProduitItemsProduit(value: boolean) {
        this._validEntreeProduitItemsProduit = value;
    }
    get validEntreeProduitItemsQuantite(): boolean {
        return this._validEntreeProduitItemsQuantite;
    }
    set validEntreeProduitItemsQuantite(value: boolean) {
        this._validEntreeProduitItemsQuantite = value;
    }
    get validEntreeProduitItemsRemise(): boolean {
        return this._validEntreeProduitItemsRemise;
    }
    set validEntreeProduitItemsRemise(value: boolean) {
        this._validEntreeProduitItemsRemise = value;
    }
    get validEntreeProduitItemsPrixUnitaireTtc(): boolean {
        return this._validEntreeProduitItemsPrixUnitaireTtc;
    }
    set validEntreeProduitItemsPrixUnitaireTtc(value: boolean) {
        this._validEntreeProduitItemsPrixUnitaireTtc = value;
    }
    get validEntreeProduitItemsPrixUht(): boolean {
        return this._validEntreeProduitItemsPrixUht;
    }
    set validEntreeProduitItemsPrixUht(value: boolean) {
        this._validEntreeProduitItemsPrixUht = value;
    }
    get validEntreeProduitItemsMontantHt(): boolean {
        return this._validEntreeProduitItemsMontantHt;
    }
    set validEntreeProduitItemsMontantHt(value: boolean) {
        this._validEntreeProduitItemsMontantHt = value;
    }
    get validEntreeProduitItemsMontantTtc(): boolean {
        return this._validEntreeProduitItemsMontantTtc;
    }
    set validEntreeProduitItemsMontantTtc(value: boolean) {
        this._validEntreeProduitItemsMontantTtc = value;
    }
}
