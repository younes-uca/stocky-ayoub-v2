import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {BeneficiaireAdminService} from 'src/app/controller/service/admin/effet/BeneficiaireAdmin.service';
import {BeneficiaireDto} from 'src/app/controller/model/effet/Beneficiaire.model';
import {BeneficiaireCriteria} from 'src/app/controller/criteria/effet/BeneficiaireCriteria.model';

@Component({
  selector: 'app-beneficiaire-view-admin',
  templateUrl: './beneficiaire-view-admin.component.html'
})
export class BeneficiaireViewAdminComponent extends AbstractViewController<BeneficiaireDto, BeneficiaireCriteria, BeneficiaireAdminService> implements OnInit {


    constructor(private beneficiaireService: BeneficiaireAdminService){
        super(beneficiaireService);
    }

    ngOnInit(): void {
    }




}
