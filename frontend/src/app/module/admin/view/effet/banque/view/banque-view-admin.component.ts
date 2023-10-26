import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {BanqueAdminService} from 'src/app/controller/service/admin/effet/BanqueAdmin.service';
import {BanqueDto} from 'src/app/controller/model/effet/Banque.model';
import {BanqueCriteria} from 'src/app/controller/criteria/effet/BanqueCriteria.model';

@Component({
  selector: 'app-banque-view-admin',
  templateUrl: './banque-view-admin.component.html'
})
export class BanqueViewAdminComponent extends AbstractViewController<BanqueDto, BanqueCriteria, BanqueAdminService> implements OnInit {


    constructor(private banqueService: BanqueAdminService){
        super(banqueService);
    }

    ngOnInit(): void {
    }




}
