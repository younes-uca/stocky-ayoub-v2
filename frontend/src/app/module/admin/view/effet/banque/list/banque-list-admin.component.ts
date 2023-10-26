import {Component, OnInit} from '@angular/core';
import {BanqueAdminService} from 'src/app/controller/service/admin/effet/BanqueAdmin.service';
import {BanqueDto} from 'src/app/controller/model/effet/Banque.model';
import {BanqueCriteria} from 'src/app/controller/criteria/effet/BanqueCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';



@Component({
  selector: 'app-banque-list-admin',
  templateUrl: './banque-list-admin.component.html'
})
export class BanqueListAdminComponent extends AbstractListController<BanqueDto, BanqueCriteria, BanqueAdminService>  implements OnInit {

    fileName = 'Banque';



    constructor( private banqueService: BanqueAdminService  ) {
        super(banqueService);
    }

    ngOnInit(): void {
        this.findPaginatedByCriteria();
        this.initExport();
        this.initCol();
    }


    public initCol() {
        this.cols = [
            {field: 'libelle', header: 'Libelle'},
            {field: 'code', header: 'Code'},
        ];
    }





   public prepareColumnExport(): void {
        this.exportData = this.items.map(e => {
            return {
                 'Libelle': e.libelle ,
                 'Code': e.code ,
            }
        });

        this.criteriaData = [{
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
        }];
      }
}
