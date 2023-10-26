import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {TauxTvaAdminService} from 'src/app/controller/service/admin/effet/TauxTvaAdmin.service';
import {TauxTvaDto} from 'src/app/controller/model/effet/TauxTva.model';
import {TauxTvaCriteria} from 'src/app/controller/criteria/effet/TauxTvaCriteria.model';



@Component({
  selector: 'app-taux-tva-edit-admin',
  templateUrl: './taux-tva-edit-admin.component.html'
})
export class TauxTvaEditAdminComponent extends AbstractEditController<TauxTvaDto, TauxTvaCriteria, TauxTvaAdminService>   implements OnInit {


    private _validTauxTvaLibelle = true;
    private _validTauxTvaCode = true;




    constructor( private tauxTvaService: TauxTvaAdminService ) {
        super(tauxTvaService);
    }

    ngOnInit(): void {
    }


    public setValidation(value: boolean){
        this.validTauxTvaLibelle = value;
        this.validTauxTvaCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateTauxTvaLibelle();
        this.validateTauxTvaCode();
    }
    public validateTauxTvaLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validTauxTvaLibelle = false;
        } else {
            this.validTauxTvaLibelle = true;
        }
    }
    public validateTauxTvaCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validTauxTvaCode = false;
        } else {
            this.validTauxTvaCode = true;
        }
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
