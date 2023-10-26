import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {CompteAdminService} from 'src/app/controller/service/admin/effet/CompteAdmin.service';
import {CompteDto} from 'src/app/controller/model/effet/Compte.model';
import {CompteCriteria} from 'src/app/controller/criteria/effet/CompteCriteria.model';


import {BanqueDto} from 'src/app/controller/model/effet/Banque.model';
import {BanqueAdminService} from 'src/app/controller/service/admin/effet/BanqueAdmin.service';
import {ProprietaireChequeEffetDto} from 'src/app/controller/model/effet/ProprietaireChequeEffet.model';
import {ProprietaireChequeEffetAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetAdmin.service';

@Component({
  selector: 'app-compte-edit-admin',
  templateUrl: './compte-edit-admin.component.html'
})
export class CompteEditAdminComponent extends AbstractEditController<CompteDto, CompteCriteria, CompteAdminService>   implements OnInit {


    private _validCompteNumero = true;

    private _validProprietaireChequeEffetNom = true;
    private _validBanqueLibelle = true;
    private _validBanqueCode = true;



    constructor( private compteService: CompteAdminService , private banqueService: BanqueAdminService, private proprietaireChequeEffetService: ProprietaireChequeEffetAdminService) {
        super(compteService);
    }

    ngOnInit(): void {
        this.proprietaireChequeEffet = new ProprietaireChequeEffetDto();
        this.proprietaireChequeEffetService.findAll().subscribe((data) => this.proprietaireChequeEffets = data);
        this.banque = new BanqueDto();
        this.banqueService.findAll().subscribe((data) => this.banques = data);
    }


    public setValidation(value: boolean){
        this.validCompteNumero = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateCompteNumero();
    }
    public validateCompteNumero(){
        if (this.stringUtilService.isEmpty(this.item.numero)) {
            this.errorMessages.push('Numero non valide');
            this.validCompteNumero = false;
        } else {
            this.validCompteNumero = true;
        }
    }



   public async openCreateBanque(banque: string) {
        const isPermistted = await this.roleService.isPermitted('Banque', 'edit');
        if (isPermistted) {
             this.banque = new BanqueDto();
             this.createBanqueDialog = true;
        }else {
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }
   public async openCreateProprietaireChequeEffet(proprietaireChequeEffet: string) {
        const isPermistted = await this.roleService.isPermitted('ProprietaireChequeEffet', 'edit');
        if (isPermistted) {
             this.proprietaireChequeEffet = new ProprietaireChequeEffetDto();
             this.createProprietaireChequeEffetDialog = true;
        }else {
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }

   get banque(): BanqueDto {
       return this.banqueService.item;
   }
  set banque(value: BanqueDto) {
        this.banqueService.item = value;
   }
   get banques(): Array<BanqueDto> {
        return this.banqueService.items;
   }
   set banques(value: Array<BanqueDto>) {
        this.banqueService.items = value;
   }
   get createBanqueDialog(): boolean {
       return this.banqueService.createDialog;
   }
  set createBanqueDialog(value: boolean) {
       this.banqueService.createDialog= value;
   }
   get proprietaireChequeEffet(): ProprietaireChequeEffetDto {
       return this.proprietaireChequeEffetService.item;
   }
  set proprietaireChequeEffet(value: ProprietaireChequeEffetDto) {
        this.proprietaireChequeEffetService.item = value;
   }
   get proprietaireChequeEffets(): Array<ProprietaireChequeEffetDto> {
        return this.proprietaireChequeEffetService.items;
   }
   set proprietaireChequeEffets(value: Array<ProprietaireChequeEffetDto>) {
        this.proprietaireChequeEffetService.items = value;
   }
   get createProprietaireChequeEffetDialog(): boolean {
       return this.proprietaireChequeEffetService.createDialog;
   }
  set createProprietaireChequeEffetDialog(value: boolean) {
       this.proprietaireChequeEffetService.createDialog= value;
   }


    get validCompteNumero(): boolean {
        return this._validCompteNumero;
    }
    set validCompteNumero(value: boolean) {
        this._validCompteNumero = value;
    }

    get validProprietaireChequeEffetNom(): boolean {
        return this._validProprietaireChequeEffetNom;
    }
    set validProprietaireChequeEffetNom(value: boolean) {
        this._validProprietaireChequeEffetNom = value;
    }
    get validBanqueLibelle(): boolean {
        return this._validBanqueLibelle;
    }
    set validBanqueLibelle(value: boolean) {
        this._validBanqueLibelle = value;
    }
    get validBanqueCode(): boolean {
        return this._validBanqueCode;
    }
    set validBanqueCode(value: boolean) {
        this._validBanqueCode = value;
    }
}
