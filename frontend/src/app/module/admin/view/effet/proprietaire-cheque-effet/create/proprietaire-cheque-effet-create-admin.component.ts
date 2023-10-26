import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {ProprietaireChequeEffetAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetAdmin.service';
import {ProprietaireChequeEffetDto} from 'src/app/controller/model/effet/ProprietaireChequeEffet.model';
import {ProprietaireChequeEffetCriteria} from 'src/app/controller/criteria/effet/ProprietaireChequeEffetCriteria.model';
@Component({
  selector: 'app-proprietaire-cheque-effet-create-admin',
  templateUrl: './proprietaire-cheque-effet-create-admin.component.html'
})
export class ProprietaireChequeEffetCreateAdminComponent extends AbstractCreateController<ProprietaireChequeEffetDto, ProprietaireChequeEffetCriteria, ProprietaireChequeEffetAdminService>  implements OnInit {



   private _validProprietaireChequeEffetNom = true;

    constructor( private proprietaireChequeEffetService: ProprietaireChequeEffetAdminService ) {
        super(proprietaireChequeEffetService);
    }

    ngOnInit(): void {
    }





    public setValidation(value: boolean){
        this.validProprietaireChequeEffetNom = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateProprietaireChequeEffetNom();
    }

    public validateProprietaireChequeEffetNom(){
        if (this.stringUtilService.isEmpty(this.item.nom)) {
        this.errorMessages.push('Nom non valide');
        this.validProprietaireChequeEffetNom = false;
        } else {
            this.validProprietaireChequeEffetNom = true;
        }
    }






    get validProprietaireChequeEffetNom(): boolean {
        return this._validProprietaireChequeEffetNom;
    }

    set validProprietaireChequeEffetNom(value: boolean) {
         this._validProprietaireChequeEffetNom = value;
    }



}
