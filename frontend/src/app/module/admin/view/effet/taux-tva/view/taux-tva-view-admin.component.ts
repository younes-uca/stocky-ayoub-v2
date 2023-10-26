import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {TauxTvaAdminService} from 'src/app/controller/service/admin/effet/TauxTvaAdmin.service';
import {TauxTvaDto} from 'src/app/controller/model/effet/TauxTva.model';
import {TauxTvaCriteria} from 'src/app/controller/criteria/effet/TauxTvaCriteria.model';

@Component({
  selector: 'app-taux-tva-view-admin',
  templateUrl: './taux-tva-view-admin.component.html'
})
export class TauxTvaViewAdminComponent extends AbstractViewController<TauxTvaDto, TauxTvaCriteria, TauxTvaAdminService> implements OnInit {


    constructor(private tauxTvaService: TauxTvaAdminService){
        super(tauxTvaService);
    }

    ngOnInit(): void {
    }




}
