import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {PaiementAdminService} from 'src/app/controller/service/admin/effet/PaiementAdmin.service';
import {PaiementDto} from 'src/app/controller/model/effet/Paiement.model';
import {PaiementCriteria} from 'src/app/controller/criteria/effet/PaiementCriteria.model';

import {CompteDto} from 'src/app/controller/model/effet/Compte.model';
import {CompteAdminService} from 'src/app/controller/service/admin/effet/CompteAdmin.service';
import {BeneficiaireDto} from 'src/app/controller/model/effet/Beneficiaire.model';
import {BeneficiaireAdminService} from 'src/app/controller/service/admin/effet/BeneficiaireAdmin.service';
import {ProprietaireChequeEffetDto} from 'src/app/controller/model/effet/ProprietaireChequeEffet.model';
import {ProprietaireChequeEffetAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetAdmin.service';
import {TypePaiementDto} from 'src/app/controller/model/effet/TypePaiement.model';
import {TypePaiementAdminService} from 'src/app/controller/service/admin/effet/TypePaiementAdmin.service';
@Component({
  selector: 'app-paiement-view-admin',
  templateUrl: './paiement-view-admin.component.html'
})
export class PaiementViewAdminComponent extends AbstractViewController<PaiementDto, PaiementCriteria, PaiementAdminService> implements OnInit {


    constructor(private paiementService: PaiementAdminService, private compteService: CompteAdminService, private beneficiaireService: BeneficiaireAdminService, private proprietaireChequeEffetService: ProprietaireChequeEffetAdminService, private typePaiementService: TypePaiementAdminService){
        super(paiementService);
    }

    ngOnInit(): void {
    }


    get typePaiement(): TypePaiementDto {
       return this.typePaiementService.item;
    }
    set typePaiement(value: TypePaiementDto) {
        this.typePaiementService.item = value;
    }
    get typePaiements(): Array<TypePaiementDto> {
       return this.typePaiementService.items;
    }
    set typePaiements(value: Array<TypePaiementDto>) {
        this.typePaiementService.items = value;
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
    get beneficiaire(): BeneficiaireDto {
       return this.beneficiaireService.item;
    }
    set beneficiaire(value: BeneficiaireDto) {
        this.beneficiaireService.item = value;
    }
    get beneficiaires(): Array<BeneficiaireDto> {
       return this.beneficiaireService.items;
    }
    set beneficiaires(value: Array<BeneficiaireDto>) {
        this.beneficiaireService.items = value;
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
