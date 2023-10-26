import {Component, OnInit} from '@angular/core';
import {TauxTvaAdminService} from 'src/app/controller/service/admin/effet/TauxTvaAdmin.service';
import {TauxTvaDto} from 'src/app/controller/model/effet/TauxTva.model';
import {TauxTvaCriteria} from 'src/app/controller/criteria/effet/TauxTvaCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';



@Component({
  selector: 'app-taux-tva-list-admin',
  templateUrl: './taux-tva-list-admin.component.html'
})
export class TauxTvaListAdminComponent extends AbstractListController<TauxTvaDto, TauxTvaCriteria, TauxTvaAdminService>  implements OnInit {

    fileName = 'TauxTva';



    constructor( private tauxTvaService: TauxTvaAdminService  ) {
        super(tauxTvaService);
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
