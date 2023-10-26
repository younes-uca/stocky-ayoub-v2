import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {ProprietaireChequeEffetBanqueAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetBanqueAdmin.service';
import {ProprietaireChequeEffetBanqueDto} from 'src/app/controller/model/effet/ProprietaireChequeEffetBanque.model';
import {ProprietaireChequeEffetBanqueCriteria} from 'src/app/controller/criteria/effet/ProprietaireChequeEffetBanqueCriteria.model';
import {CompteDto} from 'src/app/controller/model/effet/Compte.model';
import {CompteAdminService} from 'src/app/controller/service/admin/effet/CompteAdmin.service';
import {BanqueDto} from 'src/app/controller/model/effet/Banque.model';
import {BanqueAdminService} from 'src/app/controller/service/admin/effet/BanqueAdmin.service';
import {ProprietaireChequeEffetDto} from 'src/app/controller/model/effet/ProprietaireChequeEffet.model';
import {ProprietaireChequeEffetAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetAdmin.service';
@Component({
  selector: 'app-proprietaire-cheque-effet-banque-create-admin',
  templateUrl: './proprietaire-cheque-effet-banque-create-admin.component.html'
})
export class ProprietaireChequeEffetBanqueCreateAdminComponent extends AbstractCreateController<ProprietaireChequeEffetBanqueDto, ProprietaireChequeEffetBanqueCriteria, ProprietaireChequeEffetBanqueAdminService>  implements OnInit {



    private _validProprietaireChequeEffetNom = true;
    private _validBanqueLibelle = true;
    private _validBanqueCode = true;
    private _validCompteNumero = true;

    constructor( private proprietaireChequeEffetBanqueService: ProprietaireChequeEffetBanqueAdminService , private compteService: CompteAdminService, private banqueService: BanqueAdminService, private proprietaireChequeEffetService: ProprietaireChequeEffetAdminService) {
        super(proprietaireChequeEffetBanqueService);
    }

    ngOnInit(): void {
        this.proprietaireChequeEffet = new ProprietaireChequeEffetDto();
        this.proprietaireChequeEffetService.findAll().subscribe((data) => this.proprietaireChequeEffets = data);
        this.banque = new BanqueDto();
        this.banqueService.findAll().subscribe((data) => this.banques = data);
        this.compte = new CompteDto();
        this.compteService.findAll().subscribe((data) => this.comptes = data);
    }





    public setValidation(value: boolean){
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }



    public async openCreateBanque(banque: string) {
    const isPermistted = await this.roleService.isPermitted('Banque', 'add');
    if(isPermistted) {
         this.banque = new BanqueDto();
         this.createBanqueDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }
    public async openCreateCompte(compte: string) {
    const isPermistted = await this.roleService.isPermitted('Compte', 'add');
    if(isPermistted) {
         this.compte = new CompteDto();
         this.createCompteDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }
    public async openCreateProprietaireChequeEffet(proprietaireChequeEffet: string) {
    const isPermistted = await this.roleService.isPermitted('ProprietaireChequeEffet', 'add');
    if(isPermistted) {
         this.proprietaireChequeEffet = new ProprietaireChequeEffetDto();
         this.createProprietaireChequeEffetDialog = true;
    }else{
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
    get compte(): CompteDto {
        return this.compteService.item;
    }
    set compte(value: CompteDto) {
        this.compteService.item = value;
    }
    get comptes(): Array<CompteDto> {
        return this.compteService.items;
    }
    set comptes(value: Array<CompteDto>) {
        this.compteService.items = value;
    }
    get createCompteDialog(): boolean {
       return this.compteService.createDialog;
    }
    set createCompteDialog(value: boolean) {
        this.compteService.createDialog= value;
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
    get validCompteNumero(): boolean {
        return this._validCompteNumero;
    }
    set validCompteNumero(value: boolean) {
        this._validCompteNumero = value;
    }


}
