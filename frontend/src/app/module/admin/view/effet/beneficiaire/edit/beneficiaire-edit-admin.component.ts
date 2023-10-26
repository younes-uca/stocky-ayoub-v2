import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {BeneficiaireAdminService} from 'src/app/controller/service/admin/effet/BeneficiaireAdmin.service';
import {BeneficiaireDto} from 'src/app/controller/model/effet/Beneficiaire.model';
import {BeneficiaireCriteria} from 'src/app/controller/criteria/effet/BeneficiaireCriteria.model';



@Component({
  selector: 'app-beneficiaire-edit-admin',
  templateUrl: './beneficiaire-edit-admin.component.html'
})
export class BeneficiaireEditAdminComponent extends AbstractEditController<BeneficiaireDto, BeneficiaireCriteria, BeneficiaireAdminService>   implements OnInit {


    private _validBeneficiaireCin = true;
    private _validBeneficiaireNom = true;




    constructor( private beneficiaireService: BeneficiaireAdminService ) {
        super(beneficiaireService);
    }

    ngOnInit(): void {
    }


    public setValidation(value: boolean){
        this.validBeneficiaireCin = value;
        this.validBeneficiaireNom = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateBeneficiaireCin();
        this.validateBeneficiaireNom();
    }
    public validateBeneficiaireCin(){
        if (this.stringUtilService.isEmpty(this.item.cin)) {
            this.errorMessages.push('Cin non valide');
            this.validBeneficiaireCin = false;
        } else {
            this.validBeneficiaireCin = true;
        }
    }
    public validateBeneficiaireNom(){
        if (this.stringUtilService.isEmpty(this.item.nom)) {
            this.errorMessages.push('Nom non valide');
            this.validBeneficiaireNom = false;
        } else {
            this.validBeneficiaireNom = true;
        }
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
