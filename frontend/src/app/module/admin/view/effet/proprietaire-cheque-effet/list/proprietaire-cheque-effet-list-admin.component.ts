import {Component, OnInit} from '@angular/core';
import {ProprietaireChequeEffetAdminService} from 'src/app/controller/service/admin/effet/ProprietaireChequeEffetAdmin.service';
import {ProprietaireChequeEffetDto} from 'src/app/controller/model/effet/ProprietaireChequeEffet.model';
import {ProprietaireChequeEffetCriteria} from 'src/app/controller/criteria/effet/ProprietaireChequeEffetCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';



@Component({
  selector: 'app-proprietaire-cheque-effet-list-admin',
  templateUrl: './proprietaire-cheque-effet-list-admin.component.html'
})
export class ProprietaireChequeEffetListAdminComponent extends AbstractListController<ProprietaireChequeEffetDto, ProprietaireChequeEffetCriteria, ProprietaireChequeEffetAdminService>  implements OnInit {

    fileName = 'ProprietaireChequeEffet';



    constructor( private proprietaireChequeEffetService: ProprietaireChequeEffetAdminService  ) {
        super(proprietaireChequeEffetService);
    }

    ngOnInit(): void {
        this.findPaginatedByCriteria();
        this.initExport();
        this.initCol();
    }


    public initCol() {
        this.cols = [
            {field: 'nom', header: 'Nom'},
        ];
    }





   public prepareColumnExport(): void {
        this.exportData = this.items.map(e => {
            return {
                 'Nom': e.nom ,
            }
        });

        this.criteriaData = [{
            'Nom': this.criteria.nom ? this.criteria.nom : environment.emptyForExport ,
        }];
      }
}
