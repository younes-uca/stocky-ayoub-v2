import {Component, OnInit} from '@angular/core';
import {CompteAdminService} from 'src/app/controller/service/admin/effet/CompteAdmin.service';
import {CompteDto} from 'src/app/controller/model/effet/Compte.model';
import {CompteCriteria} from 'src/app/controller/criteria/effet/CompteCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import {BanqueDto} from 'src/app/controller/model/effet/Banque.model';
import {BanqueAdminService} from 'src/app/controller/service/admin/effet/BanqueAdmin.service';
import {ProprietaireChequeEffetDto} from 'src/app/controller/model/effet/ProprietaireChequeEffet.model';
import {ProprietaireChequeEffetAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetAdmin.service';


@Component({
  selector: 'app-compte-list-admin',
  templateUrl: './compte-list-admin.component.html'
})
export class CompteListAdminComponent extends AbstractListController<CompteDto, CompteCriteria, CompteAdminService>  implements OnInit {

    fileName = 'Compte';

    proprietaireChequeEffets: Array<ProprietaireChequeEffetDto>;
    banques: Array<BanqueDto>;


    constructor( private compteService: CompteAdminService  , private banqueService: BanqueAdminService, private proprietaireChequeEffetService: ProprietaireChequeEffetAdminService) {
        super(compteService);
    }

    ngOnInit(): void {
        this.findPaginatedByCriteria();
        this.initExport();
        this.initCol();
        this.loadProprietaireChequeEffet();
        this.loadBanque();
    }


    public initCol() {
        this.cols = [
            {field: 'numero', header: 'Numero'},
            {field: 'proprietaireChequeEffet?.nom', header: 'Proprietaire cheque effet'},
            {field: 'banque?.libelle', header: 'Banque'},
        ];
    }


    public async loadProprietaireChequeEffet(){
       this.proprietaireChequeEffetService.findAllOptimized().subscribe(proprietaireChequeEffets => this.proprietaireChequeEffets = proprietaireChequeEffets, error => console.log(error))
    }
    public async loadBanque(){
       this.banqueService.findAllOptimized().subscribe(banques => this.banques = banques, error => console.log(error))
    }



   public prepareColumnExport(): void {
        this.exportData = this.items.map(e => {
            return {
                 'Numero': e.numero ,
                'Proprietaire cheque effet': e.proprietaireChequeEffet?.nom ,
                'Banque': e.banque?.libelle ,
            }
        });

        this.criteriaData = [{
            'Numero': this.criteria.numero ? this.criteria.numero : environment.emptyForExport ,
        //'Proprietaire cheque effet': this.criteria.proprietaireChequeEffet?.nom ? this.criteria.proprietaireChequeEffet?.nom : environment.emptyForExport ,
        //'Banque': this.criteria.banque?.libelle ? this.criteria.banque?.libelle : environment.emptyForExport ,
        }];
      }
}
