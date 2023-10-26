import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {ProprietaireChequeEffetBanqueAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetBanqueAdmin.service';
import {ProprietaireChequeEffetBanqueDto} from 'src/app/controller/model/effet/ProprietaireChequeEffetBanque.model';
import {ProprietaireChequeEffetBanqueCriteria} from 'src/app/controller/criteria/effet/ProprietaireChequeEffetBanqueCriteria.model';

import {CompteDto} from 'src/app/controller/model/effet/Compte.model';
import {CompteAdminService} from 'src/app/controller/service/admin/effet/CompteAdmin.service';
import {BanqueDto} from 'src/app/controller/model/effet/Banque.model';
import {BanqueAdminService} from 'src/app/controller/service/admin/effet/BanqueAdmin.service';
import {ProprietaireChequeEffetDto} from 'src/app/controller/model/effet/ProprietaireChequeEffet.model';
import {ProprietaireChequeEffetAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetAdmin.service';
@Component({
  selector: 'app-proprietaire-cheque-effet-banque-view-admin',
  templateUrl: './proprietaire-cheque-effet-banque-view-admin.component.html'
})
export class ProprietaireChequeEffetBanqueViewAdminComponent extends AbstractViewController<ProprietaireChequeEffetBanqueDto, ProprietaireChequeEffetBanqueCriteria, ProprietaireChequeEffetBanqueAdminService> implements OnInit {


    constructor(private proprietaireChequeEffetBanqueService: ProprietaireChequeEffetBanqueAdminService, private compteService: CompteAdminService, private banqueService: BanqueAdminService, private proprietaireChequeEffetService: ProprietaireChequeEffetAdminService){
        super(proprietaireChequeEffetBanqueService);
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
    get compte(): CompteDto {
       return this.compteService.item;
    }
    set compte(value: CompteDto) {
        this.compteService.item = value;
    }
    get comptes(): Array<CompteDto> {
       return this.compteService.items;
    }
    set comptes(value: Array<CompteDto>) {
        this.compteService.items = value;
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
