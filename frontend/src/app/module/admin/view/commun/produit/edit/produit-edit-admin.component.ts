import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {ProduitAdminService} from 'src/app/controller/service/admin/commun/ProduitAdmin.service';
import {ProduitDto} from 'src/app/controller/model/commun/Produit.model';
import {ProduitCriteria} from 'src/app/controller/criteria/commun/ProduitCriteria.model';


import {CategorieProduitDto} from 'src/app/controller/model/commun/CategorieProduit.model';
import {CategorieProduitAdminService} from 'src/app/controller/service/admin/commun/CategorieProduitAdmin.service';
import {MarqueDto} from 'src/app/controller/model/commun/Marque.model';
import {MarqueAdminService} from 'src/app/controller/service/admin/commun/MarqueAdmin.service';
import {TauxTvaDto} from 'src/app/controller/model/effet/TauxTva.model';
import {TauxTvaAdminService} from 'src/app/controller/service/admin/effet/TauxTvaAdmin.service';

@Component({
  selector: 'app-produit-edit-admin',
  templateUrl: './produit-edit-admin.component.html'
})
export class ProduitEditAdminComponent extends AbstractEditController<ProduitDto, ProduitCriteria, ProduitAdminService>   implements OnInit {


    private _validProduitReference = true;
    private _validProduitPrixAchatMoyen = true;
    private _validProduitPrix = true;
    private _validProduitRemise = true;
    private _validProduitPrixUnitaireTtc = true;
    private _validProduitPrixUht = true;
    private _validProduitMontantHt = true;
    private _validProduitMontantTtc = true;

    private _validCategorieProduitReference = true;
    private _validCategorieProduitLibelle = true;
    private _validMarqueReference = true;
    private _validMarqueLibelle = true;
    private _validTauxTvaLibelle = true;
    private _validTauxTvaCode = true;



    constructor( private produitService: ProduitAdminService , private categorieProduitService: CategorieProduitAdminService, private marqueService: MarqueAdminService, private tauxTvaService: TauxTvaAdminService) {
        super(produitService);
    }

    ngOnInit(): void {
        this.categorieProduit = new CategorieProduitDto();
        this.categorieProduitService.findAll().subscribe((data) => this.categorieProduits = data);
        this.marque = new MarqueDto();
        this.marqueService.findAll().subscribe((data) => this.marques = data);
        this.tauxTva = new TauxTvaDto();
        this.tauxTvaService.findAll().subscribe((data) => this.tauxTvas = data);
    }


    public setValidation(value: boolean){
        this.validProduitReference = value;
        this.validProduitPrixAchatMoyen = value;
        this.validProduitPrix = value;
        this.validProduitRemise = value;
        this.validProduitPrixUnitaireTtc = value;
        this.validProduitPrixUht = value;
        this.validProduitMontantHt = value;
        this.validProduitMontantTtc = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateProduitReference();
        this.validateProduitPrixAchatMoyen();
        this.validateProduitPrix();
        this.validateProduitRemise();
        this.validateProduitPrixUnitaireTtc();
        this.validateProduitPrixUht();
        this.validateProduitMontantHt();
        this.validateProduitMontantTtc();
    }
    public validateProduitReference(){
        if (this.stringUtilService.isEmpty(this.item.reference)) {
            this.errorMessages.push('Reference non valide');
            this.validProduitReference = false;
        } else {
            this.validProduitReference = true;
        }
    }
    public validateProduitPrixAchatMoyen(){
        if (this.stringUtilService.isEmpty(this.item.prixAchatMoyen)) {
            this.errorMessages.push('Prix achat moyen non valide');
            this.validProduitPrixAchatMoyen = false;
        } else {
            this.validProduitPrixAchatMoyen = true;
        }
    }
    public validateProduitPrix(){
        if (this.stringUtilService.isEmpty(this.item.prix)) {
            this.errorMessages.push('Prix non valide');
            this.validProduitPrix = false;
        } else {
            this.validProduitPrix = true;
        }
    }
    public validateProduitRemise(){
        if (this.stringUtilService.isEmpty(this.item.remise)) {
            this.errorMessages.push('Remise non valide');
            this.validProduitRemise = false;
        } else {
            this.validProduitRemise = true;
        }
    }
    public validateProduitPrixUnitaireTtc(){
        if (this.stringUtilService.isEmpty(this.item.prixUnitaireTtc)) {
            this.errorMessages.push('Prix unitaire ttc non valide');
            this.validProduitPrixUnitaireTtc = false;
        } else {
            this.validProduitPrixUnitaireTtc = true;
        }
    }
    public validateProduitPrixUht(){
        if (this.stringUtilService.isEmpty(this.item.prixUht)) {
            this.errorMessages.push('Prix uht non valide');
            this.validProduitPrixUht = false;
        } else {
            this.validProduitPrixUht = true;
        }
    }
    public validateProduitMontantHt(){
        if (this.stringUtilService.isEmpty(this.item.montantHt)) {
            this.errorMessages.push('Montant ht non valide');
            this.validProduitMontantHt = false;
        } else {
            this.validProduitMontantHt = true;
        }
    }
    public validateProduitMontantTtc(){
        if (this.stringUtilService.isEmpty(this.item.montantTtc)) {
            this.errorMessages.push('Montant ttc non valide');
            this.validProduitMontantTtc = false;
        } else {
            this.validProduitMontantTtc = true;
        }
    }



   public async openCreateCategorieProduit(categorieProduit: string) {
        const isPermistted = await this.roleService.isPermitted('CategorieProduit', 'edit');
        if (isPermistted) {
             this.categorieProduit = new CategorieProduitDto();
             this.createCategorieProduitDialog = true;
        }else {
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }
   public async openCreateMarque(marque: string) {
        const isPermistted = await this.roleService.isPermitted('Marque', 'edit');
        if (isPermistted) {
             this.marque = new MarqueDto();
             this.createMarqueDialog = true;
        }else {
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }

   get categorieProduit(): CategorieProduitDto {
       return this.categorieProduitService.item;
   }
  set categorieProduit(value: CategorieProduitDto) {
        this.categorieProduitService.item = value;
   }
   get categorieProduits(): Array<CategorieProduitDto> {
        return this.categorieProduitService.items;
   }
   set categorieProduits(value: Array<CategorieProduitDto>) {
        this.categorieProduitService.items = value;
   }
   get createCategorieProduitDialog(): boolean {
       return this.categorieProduitService.createDialog;
   }
  set createCategorieProduitDialog(value: boolean) {
       this.categorieProduitService.createDialog= value;
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
   get marque(): MarqueDto {
       return this.marqueService.item;
   }
  set marque(value: MarqueDto) {
        this.marqueService.item = value;
   }
   get marques(): Array<MarqueDto> {
        return this.marqueService.items;
   }
   set marques(value: Array<MarqueDto>) {
        this.marqueService.items = value;
   }
   get createMarqueDialog(): boolean {
       return this.marqueService.createDialog;
   }
  set createMarqueDialog(value: boolean) {
       this.marqueService.createDialog= value;
   }


    get validProduitReference(): boolean {
        return this._validProduitReference;
    }
    set validProduitReference(value: boolean) {
        this._validProduitReference = value;
    }
    get validProduitPrixAchatMoyen(): boolean {
        return this._validProduitPrixAchatMoyen;
    }
    set validProduitPrixAchatMoyen(value: boolean) {
        this._validProduitPrixAchatMoyen = value;
    }
    get validProduitPrix(): boolean {
        return this._validProduitPrix;
    }
    set validProduitPrix(value: boolean) {
        this._validProduitPrix = value;
    }
    get validProduitRemise(): boolean {
        return this._validProduitRemise;
    }
    set validProduitRemise(value: boolean) {
        this._validProduitRemise = value;
    }
    get validProduitPrixUnitaireTtc(): boolean {
        return this._validProduitPrixUnitaireTtc;
    }
    set validProduitPrixUnitaireTtc(value: boolean) {
        this._validProduitPrixUnitaireTtc = value;
    }
    get validProduitPrixUht(): boolean {
        return this._validProduitPrixUht;
    }
    set validProduitPrixUht(value: boolean) {
        this._validProduitPrixUht = value;
    }
    get validProduitMontantHt(): boolean {
        return this._validProduitMontantHt;
    }
    set validProduitMontantHt(value: boolean) {
        this._validProduitMontantHt = value;
    }
    get validProduitMontantTtc(): boolean {
        return this._validProduitMontantTtc;
    }
    set validProduitMontantTtc(value: boolean) {
        this._validProduitMontantTtc = value;
    }

    get validCategorieProduitReference(): boolean {
        return this._validCategorieProduitReference;
    }
    set validCategorieProduitReference(value: boolean) {
        this._validCategorieProduitReference = value;
    }
    get validCategorieProduitLibelle(): boolean {
        return this._validCategorieProduitLibelle;
    }
    set validCategorieProduitLibelle(value: boolean) {
        this._validCategorieProduitLibelle = value;
    }
    get validMarqueReference(): boolean {
        return this._validMarqueReference;
    }
    set validMarqueReference(value: boolean) {
        this._validMarqueReference = value;
    }
    get validMarqueLibelle(): boolean {
        return this._validMarqueLibelle;
    }
    set validMarqueLibelle(value: boolean) {
        this._validMarqueLibelle = value;
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
}
