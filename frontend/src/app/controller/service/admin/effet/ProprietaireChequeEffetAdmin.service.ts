import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';

import {ProprietaireChequeEffetDto} from 'src/app/controller/model/effet/ProprietaireChequeEffet.model';
import {ProprietaireChequeEffetCriteria} from 'src/app/controller/criteria/effet/ProprietaireChequeEffetCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class ProprietaireChequeEffetAdminService extends AbstractService<ProprietaireChequeEffetDto, ProprietaireChequeEffetCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/proprietaireChequeEffet/');
    }

    public constrcutDto(): ProprietaireChequeEffetDto {
        return new ProprietaireChequeEffetDto();
    }

    public constrcutCriteria(): ProprietaireChequeEffetCriteria {
        return new ProprietaireChequeEffetCriteria();
    }
}
