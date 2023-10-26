import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {ProprietaireChequeEffetAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetAdmin.service';
import {ProprietaireChequeEffetDto} from 'src/app/controller/model/effet/ProprietaireChequeEffet.model';
import {ProprietaireChequeEffetCriteria} from 'src/app/controller/criteria/effet/ProprietaireChequeEffetCriteria.model';

@Component({
  selector: 'app-proprietaire-cheque-effet-view-admin',
  templateUrl: './proprietaire-cheque-effet-view-admin.component.html'
})
export class ProprietaireChequeEffetViewAdminComponent extends AbstractViewController<ProprietaireChequeEffetDto, ProprietaireChequeEffetCriteria, ProprietaireChequeEffetAdminService> implements OnInit {


    constructor(private proprietaireChequeEffetService: ProprietaireChequeEffetAdminService){
        super(proprietaireChequeEffetService);
    }

    ngOnInit(): void {
    }




}
