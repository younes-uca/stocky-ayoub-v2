import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {PaiementAdminService} from 'src/app/controller/service/admin/effet/PaiementAdmin.service';
import {PaiementDto} from 'src/app/controller/model/effet/Paiement.model';
import {PaiementCriteria} from 'src/app/controller/criteria/effet/PaiementCriteria.model';
import {CompteDto} from 'src/app/controller/model/effet/Compte.model';
import {CompteAdminService} from 'src/app/controller/service/admin/effet/CompteAdmin.service';
import {BeneficiaireDto} from 'src/app/controller/model/effet/Beneficiaire.model';
import {BeneficiaireAdminService} from 'src/app/controller/service/admin/effet/BeneficiaireAdmin.service';
import {ProprietaireChequeEffetDto} from 'src/app/controller/model/effet/ProprietaireChequeEffet.model';
import {ProprietaireChequeEffetAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetAdmin.service';
import {TypePaiementDto} from 'src/app/controller/model/effet/TypePaiement.model';
import {TypePaiementAdminService} from 'src/app/controller/service/admin/effet/TypePaiementAdmin.service';
@Component({
  selector: 'app-paiement-create-admin',
  templateUrl: './paiement-create-admin.component.html'
})
export class PaiementCreateAdminComponent extends AbstractCreateController<PaiementDto, PaiementCriteria, PaiementAdminService>  implements OnInit {



   private _validPaiementCodeChequeEffet = true;
    private _validProprietaireChequeEffetNom = true;
    private _validCompteNumero = true;
    private _validTypePaiementLibelle = true;
    private _validTypePaiementCode = true;
    private _validBeneficiaireCin = true;
    private _validBeneficiaireNom = true;

    constructor( private paiementService: PaiementAdminService , private compteService: CompteAdminService, private beneficiaireService: BeneficiaireAdminService, private proprietaireChequeEffetService: ProprietaireChequeEffetAdminService, private typePaiementService: TypePaiementAdminService) {
        super(paiementService);
    }

    ngOnInit(): void {
        this.proprietaireChequeEffet = new ProprietaireChequeEffetDto();
        this.proprietaireChequeEffetService.findAll().subscribe((data) => this.proprietaireChequeEffets = data);
        this.compte = new CompteDto();
        this.compteService.findAll().subscribe((data) => this.comptes = data);
        this.typePaiement = new TypePaiementDto();
        this.typePaiementService.findAll().subscribe((data) => this.typePaiements = data);
        this.beneficiaire = new BeneficiaireDto();
        this.beneficiaireService.findAll().subscribe((data) => this.beneficiaires = data);
    }





    public setValidation(value: boolean){
        this.validPaiementCodeChequeEffet = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validatePaiementCodeChequeEffet();
    }

    public validatePaiementCodeChequeEffet(){
        if (this.stringUtilService.isEmpty(this.item.codeChequeEffet)) {
        this.errorMessages.push('Code cheque effet non valide');
        this.validPaiementCodeChequeEffet = false;
        } else {
            this.validPaiementCodeChequeEffet = true;
        }
    }


    public async openCreateTypePaiement(typePaiement: string) {
    const isPermistted = await this.roleService.isPermitted('TypePaiement', 'add');
    if(isPermistted) {
         this.typePaiement = new TypePaiementDto();
         this.createTypePaiementDialog = true;
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
    public async openCreateBeneficiaire(beneficiaire: string) {
    const isPermistted = await this.roleService.isPermitted('Beneficiaire', 'add');
    if(isPermistted) {
         this.beneficiaire = new BeneficiaireDto();
         this.createBeneficiaireDialog = true;
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

    get typePaiement(): TypePaiementDto {
        return this.typePaiementService.item;
    }
    set typePaiement(value: TypePaiementDto) {
        this.typePaiementService.item = value;
    }
    get typePaiements(): Array<TypePaiementDto> {
        return this.typePaiementService.items;
    }
    set typePaiements(value: Array<TypePaiementDto>) {
        this.typePaiementService.items = value;
    }
    get createTypePaiementDialog(): boolean {
       return this.typePaiementService.createDialog;
    }
    set createTypePaiementDialog(value: boolean) {
        this.typePaiementService.createDialog= value;
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
    get beneficiaire(): BeneficiaireDto {
        return this.beneficiaireService.item;
    }
    set beneficiaire(value: BeneficiaireDto) {
        this.beneficiaireService.item = value;
    }
    get beneficiaires(): Array<BeneficiaireDto> {
        return this.beneficiaireService.items;
    }
    set beneficiaires(value: Array<BeneficiaireDto>) {
        this.beneficiaireService.items = value;
    }
    get createBeneficiaireDialog(): boolean {
       return this.beneficiaireService.createDialog;
    }
    set createBeneficiaireDialog(value: boolean) {
        this.beneficiaireService.createDialog= value;
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



    get validPaiementCodeChequeEffet(): boolean {
        return this._validPaiementCodeChequeEffet;
    }

    set validPaiementCodeChequeEffet(value: boolean) {
         this._validPaiementCodeChequeEffet = value;
    }

    get validProprietaireChequeEffetNom(): boolean {
        return this._validProprietaireChequeEffetNom;
    }
    set validProprietaireChequeEffetNom(value: boolean) {
        this._validProprietaireChequeEffetNom = value;
    }
    get validCompteNumero(): boolean {
        return this._validCompteNumero;
    }
    set validCompteNumero(value: boolean) {
        this._validCompteNumero = value;
    }
    get validTypePaiementLibelle(): boolean {
        return this._validTypePaiementLibelle;
    }
    set validTypePaiementLibelle(value: boolean) {
        this._validTypePaiementLibelle = value;
    }
    get validTypePaiementCode(): boolean {
        return this._validTypePaiementCode;
    }
    set validTypePaiementCode(value: boolean) {
        this._validTypePaiementCode = value;
    }
    get validBeneficiaireCin(): boolean {
        return this._validBeneficiaireCin;
    }
    set validBeneficiaireCin(value: boolean) {
        this._validBeneficiaireCin = value;
    }
    get validBeneficiaireNom(): boolean {
        return this._validBeneficiaireNom;
    }
    set validBeneficiaireNom(value: boolean) {
        this._validBeneficiaireNom = value;
    }


}
