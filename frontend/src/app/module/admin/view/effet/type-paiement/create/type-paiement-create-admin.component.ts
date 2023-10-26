import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {TypePaiementAdminService} from 'src/app/controller/service/admin/effet/TypePaiementAdmin.service';
import {TypePaiementDto} from 'src/app/controller/model/effet/TypePaiement.model';
import {TypePaiementCriteria} from 'src/app/controller/criteria/effet/TypePaiementCriteria.model';
@Component({
  selector: 'app-type-paiement-create-admin',
  templateUrl: './type-paiement-create-admin.component.html'
})
export class TypePaiementCreateAdminComponent extends AbstractCreateController<TypePaiementDto, TypePaiementCriteria, TypePaiementAdminService>  implements OnInit {



   private _validTypePaiementLibelle = true;
   private _validTypePaiementCode = true;

    constructor( private typePaiementService: TypePaiementAdminService ) {
        super(typePaiementService);
    }

    ngOnInit(): void {
    }





    public setValidation(value: boolean){
        this.validTypePaiementLibelle = value;
        this.validTypePaiementCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateTypePaiementLibelle();
        this.validateTypePaiementCode();
    }

    public validateTypePaiementLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validTypePaiementLibelle = false;
        } else {
            this.validTypePaiementLibelle = true;
        }
    }
    public validateTypePaiementCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validTypePaiementCode = false;
        } else {
            this.validTypePaiementCode = true;
        }
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



}
