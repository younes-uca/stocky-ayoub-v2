import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {CompteAdminService} from 'src/app/controller/service/admin/effet/CompteAdmin.service';
import {CompteDto} from 'src/app/controller/model/effet/Compte.model';
import {CompteCriteria} from 'src/app/controller/criteria/effet/CompteCriteria.model';

import {BanqueDto} from 'src/app/controller/model/effet/Banque.model';
import {BanqueAdminService} from 'src/app/controller/service/admin/effet/BanqueAdmin.service';
import {ProprietaireChequeEffetDto} from 'src/app/controller/model/effet/ProprietaireChequeEffet.model';
import {ProprietaireChequeEffetAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetAdmin.service';
@Component({
  selector: 'app-compte-view-admin',
  templateUrl: './compte-view-admin.component.html'
})
export class CompteViewAdminComponent extends AbstractViewController<CompteDto, CompteCriteria, CompteAdminService> implements OnInit {


    constructor(private compteService: CompteAdminService, private banqueService: BanqueAdminService, private proprietaireChequeEffetService: ProprietaireChequeEffetAdminService){
        super(compteService);
    }

    ngOnInit(): void {
    }


    get banque(): BanqueDto {
       return this.banqueService.item;
    }
    set banque(value: BanqueDto) {
        this.banqueService.item = value;
    }
    get banques(): Array<BanqueDto> {
       return this.banqueService.items;
    }
    set banques(value: Array<BanqueDto>) {
        this.banqueService.items = value;
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


}
