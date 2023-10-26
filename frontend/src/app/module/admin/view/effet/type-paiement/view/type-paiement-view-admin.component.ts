import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {TypePaiementAdminService} from 'src/app/controller/service/admin/effet/TypePaiementAdmin.service';
import {TypePaiementDto} from 'src/app/controller/model/effet/TypePaiement.model';
import {TypePaiementCriteria} from 'src/app/controller/criteria/effet/TypePaiementCriteria.model';

@Component({
  selector: 'app-type-paiement-view-admin',
  templateUrl: './type-paiement-view-admin.component.html'
})
export class TypePaiementViewAdminComponent extends AbstractViewController<TypePaiementDto, TypePaiementCriteria, TypePaiementAdminService> implements OnInit {


    constructor(private typePaiementService: TypePaiementAdminService){
        super(typePaiementService);
    }

    ngOnInit(): void {
    }




}
